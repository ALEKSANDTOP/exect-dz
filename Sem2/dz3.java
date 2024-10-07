package Sem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dz3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArr(genArray())));

    }
    public static String[] genArray(){
        String [] strings = {"арбуз", "дыня", "персик"};
        return strings;
    }

    public static String[] sortArr(String [] list){

        if(security(list)){
            try {
                Arrays.sort(list);
            }catch (Exception e){
                throw new ClassCastException("Не удалось отсортировать, проверьте что все строки не имеют цифр.");
            }
            return list;
        }
        else {
            throw new RuntimeException("Лист пуст.");
        }
    }

    public static boolean security(String [] list){
        if (list.length == 0){
            return false;
        }
        return true;
    }
}
