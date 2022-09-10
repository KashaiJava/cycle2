import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
        task9();

    }
    public static void task1() {
        int cash = 29000;
        int totalSum = 0;
        int i = 0;
        while (totalSum <= 2_459_000) {
            totalSum += totalSum / 100;
            totalSum += cash;
            i++;
        }
        System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, totalSum);
    }

    public static void task2() {
        for (int right = 10; right > 0; right--) {
            System.out.print(right + " ");
        }
        int left = 1;
        System.out.println("\n");
        while (left <= 10) {
            System.out.print(left + " ");
            left++;
        }

    }

    public static void task3() {
        int y = 12_000_000;
        int born = 17;
        int die = 8;
        int bornCycle = 1000;
        System.out.println("\n");
        int yAllPeopleBorn = y + y * born / bornCycle;
        int dieAllPeople = y + y * die / bornCycle;
        int diffDieBorn = yAllPeopleBorn - dieAllPeople;
        for (int i = 1; i <= 10; i++) {
            y = y + diffDieBorn;
            System.out.println("Год " + i + " численность населения  " + y);
        }
    }

    public static void task4() {
        int totalSum = 12_000_000;
        double percent = 0.07;
        double pervyiVklad = 15_000;
        for (int i = 1; pervyiVklad <= totalSum; i++) {
            pervyiVklad = pervyiVklad + (pervyiVklad * percent);
            System.out.println("Месяц " + i + " сумма накоплений " + Math.round(pervyiVklad) + " руб.");
        }
    }

    public static void task5() {
        int totalSum = 12_000_000;
        double percent = 0.07;
        double pervyiVklad = 15_000;
        for (int i = 1; pervyiVklad <= totalSum; i++) {
            pervyiVklad = pervyiVklad + (pervyiVklad * percent);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений " + Math.round(pervyiVklad) + " руб.");
            }
        }
    }

    public static void task6() {
        double percent = 0.07;
        double pervyiVklad = 15_000;
        int halfYear = 9 * 12 / 2;
        for (int i = 1; i <= halfYear; i++) {
            pervyiVklad = pervyiVklad + (pervyiVklad * percent);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений " + Math.round(pervyiVklad) + " руб.");
            }
        }
    }

    public static void task7() {
        int month = 31;
        for (int day = 5; day < month; day += 7) {
            System.out.println("Сегодня пятница," + day + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void task8() {
        int year = 2022;
        int year200 = year - 200;
        int year100 = year + 100;
        for (int years = 0; years <= year100; years += 79) {
            if (years > year200 && years < year100)
                System.out.println(years);
        }
    }

    public static void task9() {
      int k = 2;
      for ( int i = 1; i <= 10; i++ ){
          System.out.println(k + "*" + i + "=" + k * i);
      }
    }
}