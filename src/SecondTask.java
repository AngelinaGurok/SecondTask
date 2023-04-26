import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        /* написать программу, которая в массиве меняет наибольший и наименьший элемент местами*/
        int size;
        Scanner in = new Scanner(System.in);
        do { //проверка на корректный ввод размера массива (значение должно быть больше 1)
            System.out.println("Input size of array (shouLd be more than 1): ");
            size = in.nextInt();
        }while (size <= 1);

        int array[] = new int[size];
        System.out.println("Enter the values of elements of array");
        for (int i = 0; i < array.length; i++){
            array[i] = in.nextInt();
        }

        array = swapMaxMin(array);
        System.out.print("New array: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static int searchMax(int arr[]){ //возвращает индекс максимального элемента в масииве
        int index = 0;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
    public static int searchMin(int arr[]){ //возвращает индекс минимального жлемента в массиве
        int index = 0;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arr[i] < max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
    public static int[] swapMaxMin(int arr[]){
        int iMax = searchMax(arr);
        int iMin = searchMin(arr);
        int buffer = arr[iMax]; //сохраняем одно из значений в "буфер"
        arr[iMax] = arr[iMin]; // присваиваем элементу, который находится на позиции MAX значение минимального
        arr[iMin] = buffer; //вместо минимального вставляем значение из "буфера", то есть максимальное
        return arr;//возвращаем массив для дальнейшего использования в программе
    }
}