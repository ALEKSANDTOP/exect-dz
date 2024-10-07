package Attest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class dz1 {
    public static void main(String[] args) throws IOException {
        editInfo(read());
    }
    public static String read() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите ваше ФИО, дата рождения, номер тел, пол(F/M)");
        String info = s.nextLine();
        s.close();
        return info;
    }

    public static void editInfo(String s) throws IOException {
        String [] edInfo = s.split(" ");

        try {

            if (edInfo.length != 6) {
                throw new IllegalArgumentException("Введенно неверное кол-во данных.");
            }

            String firstName = edInfo[0];
            String middleName = edInfo[1];
            String lastName = edInfo[2];
            LocalDate data = parseData(edInfo[3]);
            Long numPhon =parseNum(edInfo[4]);
            String gender = parseGenger(edInfo[5]);
            writerToFile(firstName, middleName,lastName, data, numPhon,gender);
        }catch (IllegalArgumentException e){
            System.out.println("не удалось приобразовать данные, проверьте их корректность" + e.getMessage() );
        }
        catch (DateTimeException e){
            System.out.println("Введенна не корректнач дата рождения, дата должна быть формата DD.MM.YYYY, проверьте ее написание" + e.getMessage());
        }
    }
    private static LocalDate parseData(String data) throws DateTimeException{

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDate.parse(data, formatter);
    }
    private static Long parseNum(String numphone) {
        try {
            return Long.parseLong(numphone);
        } catch (NumberFormatException e) {
            System.out.println("Введен неверный формат номера телефона" + e.getMessage());
        }

        return Long.parseLong(numphone);
    }


    private static String parseGenger(String g){
        g = g.toLowerCase();
        if (g.length() == 1 || g.equals("m") || g.equals("f")){
            return g;
        }
        else {
            throw new IllegalArgumentException("Неверный формат пола (F/M)");
        }

    }
    public static void writerToFile( String firstName, String middleName, String lastName, LocalDate data, Long numPhon, String gender) throws IOException{
        String file = firstName + ".txt";

        String line = String.format("%s %s %s %s %d %s", firstName, middleName, lastName, data, numPhon, gender);
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

    }
}

