public class Main {
    public static void main(String[] args) {
        printYear(2023);
        printPhoneInfo(2020);
        calculateDeliveryDays(95);
    }


    public static void printYear(int year) {
        System.out.println("\nЗадание 1.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println(year + " не високосный год");
        else System.out.println(year + " високосный год");
    }

    public static void printPhoneInfo(int currentyear) {
        System.out.println("\nЗадание 2.");
        int clientOS = 1;
        long clientDeviceYear = 2015L;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию Android по ссылке");
        }
    }

    public static void calculateDeliveryDays(int deliveryDistance) {
        System.out.println("\nЗадание 3.");

        if (deliveryDistance <= 20) {
            System.out.println("Доставка занимает сутки");
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка занимает двое суток");
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка занимает трое суток");
        }
    }
}
