public class Main {
    public static void main(String[] args) {
        doYear(2023);
        doPhone(2020);
    }


    public static void doYear(int year) {
        System.out.println("\nЗадание 1.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println(year + " не високосный год");
        else System.out.println(year + " високосный год");
    }

    public static void doPhone(int currentyear) {
        System.out.println("\nЗадание 2.");
        int clientOS = 1;
        long clientDeviceYear = 2015L;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию Android по ссылке");
        }
    }
}
