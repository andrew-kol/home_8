import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printYear(2023);
        printPhoneInfo(1, 2022);
        calculateDeliveryDays(95);
    }


    private static void printYear(int year) {
        System.out.println("\nЗадание 1.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println(year + " не високосный год");
        else {
            System.out.println(year + " високосный год");
        }
    }

    private static void printPhoneInfo(int phoneOs, int productionYear) {
        System.out.println("\nЗадание 2.");

        if (!(phoneOs == 0 || phoneOs == 1))
        {
            throw new RuntimeException("Устройство поддерживается немедленно");
        }

            var currentYear = LocalDate.now().getYear();
            String versionMessage = productionYear < currentYear ? "облегченную" : "";
            String osMessage = phoneOs == 0 ? "iOs" : "Android";

            System.out.printf("Установите %s версию приложения для %s", versionMessage, osMessage);
        }

    private static void calculateDeliveryDays(int deliveryDistance) {
        System.out.println("\nЗадание 3.");
        int start = 20;
        int step = 40;
        int result;
        if (deliveryDistance < start) {
            result = 1;
        } else {
            result = (Math.abs((deliveryDistance - start) / step)+2);
        }
        System.out.println("Потребуется дней для доставки " + result);
    }

                    }










