package Sem1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Boolean a = true;
        while (true){
            System.out.println("Введите значение: ");
            if (s.nextInt() == 1){
                search1();
            }
            else {
                a = false;
            }
        }

    }

    public static int[]  genArr(){
        int [] arr = null;
        return arr;
    }
    public static int search(int [] arr, int a){
        if (arr == null){
            return -3;
        }
        if (arr.length < a){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a){
                return i;

            }
        }
        return -2;
    }

    public static void search1(){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = s.nextInt();

        int p = search(genArr(),a);

        if (p == -1){
            System.out.println("Элемент больше размера массива");
        }
        else if (p == -2){
            System.out.println("Элемент не найден.");
        }
        else if (p == -3){
            System.out.println("Массив не содержит элементы. ");
        }
        System.out.println("Индекс: " + p);
    }
}
