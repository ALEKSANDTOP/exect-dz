package Sem2;

import java.util.Arrays;

public class dz2 {
    public static void main(String[] args) {
        translate(isPalindrome(genString()));

    }
    public static String genString(){
        String str = "ала";
        return str;
    }

    public static boolean isPalindrome(String str){
        String s = str.replace(" ", "").toLowerCase();
        s = s.replace(",", "");
        int lenght = s.length();

        for (int i = 0; i < lenght / 2; i++) {
            if(s.charAt(i) != s.charAt(lenght - i - 1 )){
                return false;
            }
        }
        return true;
    }
    public static void translate(Boolean b){
        if (b == true){
            System.out.println("Строка являеться палидромом");
        }
        else {
            System.out.println("Строка не являтсья палидромом");
        }
    }
}
