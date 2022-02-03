package ru.skypro;

public class Main {

    public static void main(String[] args) {
// Task_1
        System.out.println("Task 1");
        byte i=1;
        while (i <= 10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        i = 10;
        for (; i >= 1; i--){
            System.out.print(i + " ");
        }
        System.out.println();

// Task_2
        System.out.println();
        System.out.println("Task 2");
        int countDayOfWeek = 7;
        int currDay = 3; // [1 ... 7]
        for ( ; currDay <= 31; currDay += countDayOfWeek ) {
            System.out.println("Сегодня пятница, " + currDay + " число. Необходимо подготовить отчет.");
        }

// Task_3
        System.out.println();
        System.out.println("Task 3");
        int cycleCometa = 79;
        int currentYear = 2022;
        int beforeYear = currentYear - 200; // 1820
        // int laterYear = currentYear + 100; // 2122
        int year = beforeYear; // 1822

        while (year >= beforeYear) {
            if (year % cycleCometa == 0){
                System.out.println(year);
                if (year >= currentYear) {
                    break;
                }
            }
            year++;
        }

    } // of main
}
