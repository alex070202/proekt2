

import java.util.Arrays;
import java.util.Scanner;

public class main {
    static String[] names = new String[100];
    static String[]secondNames=new String[100];
    static long[] egns = new long[100];
    static String[] emails = new String[100];
    static String[] startDates = new String[100];
    static String[] endDates = new String[100];
    static String[] types = new String[100];
    static String[] statuss = new String[100];
    static int index = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.println("---------------------------------------------");
            System.out.println("1. Заяви отпуска");
            System.out.println("2. Виж всички отпуски");
            System.out.println("3. Виж отпуска за служител");
            System.out.println("4. Промени статус на отпуска");
            System.out.println("5. Изход");
            System.out.println(" ---------------------------------------------");
            number = input.nextInt();

            askNumberFromUser(number, input);
        }
        while (number != 5);


    }

    public static void askNumberFromUser(int number, Scanner input) {

        switch (number) {
            case 1:
                System.out.println("Въведете име :");
                String name = input.next();
                System.out.println("Въведете фамилия");
                String secondName=input.next();
                System.out.println("Въведете имейл :");
                String email = input.next();
                System.out.println("Въведете егн :");
                long egn = input.nextLong();
                System.out.println("Въведете начална дата :");
                String startDate = input.next();
                System.out.println("Въведете крайна дата :");
                String endDate = input.next();
                System.out.println("Въведете тип на отпуската :");
                String type = input.next();
                System.out.println("Status");
                String status = input.next();
                if (type.equalsIgnoreCase("платена") || type.equalsIgnoreCase("неплатена")) {
                    createRecord(name,secondName, egn, email, startDate, endDate, type, status);
                    break;
                } else {
                    System.out.println("error");
                }

                break;

            case 2:
                printRecords();

                break;
            case 3:
                searchForClient(input);
                break;
            case 4:
                printNewTable();
                System.out.println("Въведете номер на заявка");
                int numberOfRequest = input.nextInt();
                if (numberOfRequest == index) {
                    System.out.println("Въведете статус");
                    String newStatus = input.next();
                    statuss[index] = newStatus;
                    printNewTable();
                } else {
                    System.out.println("Няма такъв номер на заявка");
                }
                break;
            case 5:
                exitProgram();
                break;
            default:
                do {
                    System.out.print("Въведената цифра не отговаря на нито една опция! " +
                            "Моля, въведете пак:");
                    number = input.nextInt();
                } while (number > 5 || number < 1);


        }
    }


    public static void createRecord(String name,String secondName, long egn, String email, String startDate, String endDate, String type, String status) {
        names[index] = name;
        secondNames[index]=secondName;
        egns[index] = egn;
        emails[index] = email;
        startDates[index] = startDate;
        endDates[index] = endDate;
        types[index] = type;
        statuss[index] = status;

//        za drugite poleta sustoto
        index = index + 1;
        System.out.println("dobavaqne na zapis");
    }

    public static void printRecords() {
        System.out.println("име                Фамилия       егн          имейл                    Начална дата    Крайна дата    Тип на отпуската   Статус");
        for (int i = 0; i < index; i++) {
            System.out.println(names[i] + "     " +secondNames[i]+"         "+ egns[i] + "      " + emails[i] + "         " + startDates[i] + "     " + endDates[i] + "             " + types[i] +
                    "           " + statuss[i]);
        }
    }

    public static void printSpecificRecords() {
        System.out.println("име           Фамилия       егн            имейл          Начална дата               Крайна дата                          Тип на отпуската             Статус");

        System.out.println(names[index] + "          "+secondNames[index] +"      "+ egns[index] + "         " + emails[index] + "          " + startDates[index] + "          " + endDates[index] + "          " + types[index] +
                "            " + statuss[index]);
    }

    public static void searchForClient(Scanner input) {
        String searchName = input.next();
        for (int i = 0; i < index; i++) {
            if (searchName.equalsIgnoreCase(names[i])) {
                printSpecificRecords();
            }
        }


    }


    public static void printNewTable() {
        System.out.println("име        Фамилия        егн          имейл       Начална дата            Крайна дата                       Тип на отпуската     Статус" + " " +
                "Номер на заявката");

        for (int i = 0; i < index; i++) {
            System.out.println(names[i] + "    "+secondNames[i] +"     "+ egns[i] + "    " + emails[i] + "      " + startDates[i] + "     " + endDates[i] + "      " + types[i] +
                    "           " + statuss[i] + "         " + index);
        }


    }

    public static void exitProgram() {
        System.exit(0);
    }
}