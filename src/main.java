import java.util.Arrays;
import java.util.Scanner;

public class main {
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
            byte startDate = 0;
            byte endDate = 0;
            int numberInput = input1(number, input, startDate, endDate);
        }
        while (number != 5);


    }

    public static int input1(int number, Scanner input, byte startDate, byte endDate) {

        switch (number) {
            case 1:
                System.out.println("Въведете име :");
                String name = input.nextLine();
                input.next();
                System.out.println("Въведете имейл :");
                String email = input.nextLine();
                input.next();
                System.out.println("Въведете егн :");
                long egn = input.nextLong();
                System.out.println("Въведете начална дата :");
                startDate = input.nextByte();
                System.out.println("Въведете крайна дата :");
                endDate = input.nextByte();
                System.out.println("Въведете тип на отпуската :");
                String type = input.next();
                if (type.equalsIgnoreCase("платена") || type.equalsIgnoreCase("неплатена")) {
                    break;
                } else {
                    System.out.println("error");
                }
                break;

            case 2:
                tableOfRequest(startDate, endDate);
                break;
        }
        return number;


    }

    public static void tableOfRequest(byte startDate, byte endDate) {
        int[][] secondOptionTableRows = {
                {1, startDate, endDate,},
                {2, startDate, endDate},
                {3, startDate, endDate}
        };

        for (int i = 0; i < secondOptionTableRows.length; i++) {
            for (int j = 0; j < secondOptionTableRows[0].length; j++) {
//                System.out.println(Arrays.toString(secondOptionTableRows));
//                secondOptionTableRows[i][j] =

            }

        }
        String[] columnNames = {"Номер на заявка", "Начало на отпуска", "Край на отпуска"};

        System.out.println(Arrays.toString(columnNames));
        for (int i = 0; i < secondOptionTableRows.length; i++) {
            System.out.println(Arrays.toString(secondOptionTableRows[i]));

        }

    }
}


