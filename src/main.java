import java.util.Arrays;
import java.util.Scanner;

public class main {
    static String[] names = new String[100];
    static long[] egns = new long[100];
    static String[] emails = new String[100];
    static byte[] startDates = new byte[100];
    static byte[] endDates = new byte[100];
    static String[] types = new String[100];
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

            input1(number, input);
        }
        while (number != 5);


    }

    public static void input1(int number, Scanner input) {

        switch (number) {
            case 1:
                System.out.println("Въведете име :");
                String name = input.next();
                System.out.println("Въведете имейл :");
                String email = input.next();
                System.out.println("Въведете егн :");
                long egn = input.nextLong();
                System.out.println("Въведете начална дата :");
                byte startDate = input.nextByte();
                System.out.println("Въведете крайна дата :");
                byte endDate = input.nextByte();
                System.out.println("Въведете тип на отпуската :");
                String type = input.next();
                if (type.equalsIgnoreCase("платена") || type.equalsIgnoreCase("неплатена")) {
                    createRecord(name, egn, email, startDate, endDate, type);
                    break;
                } else {
                    System.out.println("error");
                }

                break;

            case 2:
                printRecords();
                break;
            case 3:

        }
    }


    public static void createRecord(String name, long egn, String email, byte startDate, byte endDate, String type) {
        names[index] = name;
        egns[index] = egn;
        emails[index] = email;
        startDates[index] = startDate;
        endDates[index] = endDate;
        types[index] = type;
//        za drugite poleta sustoto
        index = index + 1;
        System.out.println("dobavaqne na zapis");
    }

    public static void printRecords() {
        System.out.println("име        егн          имейл           Начална дата            Крайна дата                       Тип на отпуската");
        for (int i = 0; i < index; i++) {
            System.out.println(names[i] + " " + egns[i] + "    " + emails[i] + "      " + startDates[i] + "     " + endDates[i] + "      " + types[i]);
        }

    }
}