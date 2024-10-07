package Sem2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class dz1 {
    public static void main(String[] args) {
        System.out.println(validateDate(genData()));

    }

    public static String genData() {
        String data = "2024-12-01";
        return data;
    }


    public static String validateDate(String date) {
        String[] s = date.split("-");



        if (s[0].length() == 1 || s[0].length() == 2 || s[0].length() == 3 || s[0].length() == 4) {
            int year = Integer.parseInt(s[0]);
            if (year < 1 || year > 9999) {
                throw new IndexOutOfBoundsException("Год не подходит по параметрам");
            }
        }
        else {
            throw new IndexOutOfBoundsException("Год не подходит по формату.");
        }

        if (s[1].length() == 1 || s[1].length() == 2) {
            int m = Integer.parseInt(s[1]);
            if (m > 12 || m < 1) {
                throw new IndexOutOfBoundsException("месяц не подходит по длинне.");
            }
        }
        else {
            throw new IndexOutOfBoundsException("месяц не подходит по формату.");
        }

            if (s[2].length() == 1 || s[2].length() == 2) {
                int d = Integer.parseInt(s[2]);
                if (d > 31 || d < 1) {
                    throw new IndexOutOfBoundsException("день не подходит по длинне.");
                }
            } else {
                throw new IndexOutOfBoundsException("день не подходит по формату.");
            }

        return date;
    }
}
