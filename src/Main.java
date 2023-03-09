public class Main {
    public static void main(String[] args) {

            task1 ();
            task2 ();
            task3 ();
            task4 ();
            task5 ();
            task6 ();
            task7 ();
            task8 ();

        }

    public static void task1 () {
        System.out.println("Задача 1");
        int vklad = 0;
        int plus = 15000;
        int myVklad = 2459000;
        var i = vklad;
        int mes = 0;
        while (i < myVklad){
            i+=(vklad + plus ++);
            mes++;
        }
        System.out.println(" Месяц " + mes + ", сумма накоплений равна " + myVklad);

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int start = 0;
        while (start < 11){
            System.out.print(start + " " );
            start = start + 1;
            }
        System.out.println();
        for (int u = 10; u > 0; u--) {
            System.out.print(u + " ");}
            System.out.println();{
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        double population = 12000000;
        int death = 8;
        int birth = 17;
        int year = 0;
        while (year < 10) {
            population = population + (birth - death)/1000.0 * population;
            System.out.printf("%.2f\n", population);
            year++;
        }



    }

    public static void task4() {
        System.out.println("Задача 4");
        double sum = 15000;
        while ( sum < 12000000) {
            sum = sum + sum * 0.07;
            System.out.printf("%.2f \n" ,sum);

        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        double sum = 15000;
        for (int month = 1; sum < 12000000; month++) {
            sum = sum + sum * 0.07;
            if (month % 6 == 0) {
                System.out.printf(" Номер месяца "+month+" %.2f \n ", sum);

            }
        }
    }


    public static void task6() {
        System.out.println("Задача 6");
        double sum = 15000;
        for (int month = 1; month <= 9*12; month++) {
            sum = sum + sum * 0.07;
            if (month % 6 == 0) {
                System.out.printf(" Hомер месяца "+month+" %.2f \n ", sum);

            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
            int oneFriday = 5;
            for (int i = oneFriday; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница " + i + " число. Необходимо подготовить отчет ");
             }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int years = 2023 + 100;
        int i = 1896;
        for (; i < years;  i = i + 79) {
            System.out.println(i);
        }
    }



}