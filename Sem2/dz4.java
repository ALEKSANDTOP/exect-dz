package Sem2;

import java.util.ArrayList;
import java.util.Scanner;

public class dz4 {
    public static void main(String[] args) {
        System.out.println(findAvarange(genList()));

    }
    public static ArrayList<Integer> genList(){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите размер листа: ");
        int size = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Введите число: ");
            list.add(s.nextInt());
        }
        return list;
    }

    public static double findAvarange(ArrayList<Integer> list) {
        if (list.isEmpty()){
            throw new IndexOutOfBoundsException("Лист пуст.");
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return (double) sum / list.size();
    }
}
