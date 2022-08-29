import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printYear(2023);
        printPhoneInfo(0, 2015);
        //      calculateDeliveryDays(95);
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

        if (!(phoneOs == 0 || phoneOs == 1)) ;
        {
            throw new RuntimeException("Устройство поддерживается немедленно");
        }

            var currentYear = LocalDate.now().getYear();
            String versionMessage = productionYear < currentYear ? "облегченную" : "";
            String osMessage = phoneOs == 0 ? "iOs" : "Android";

            System.out.printf("Установите %s версию приложения для %s по ссылке %s", versionMessage, osMessage);
        }



                    }


                //  public static void calculateDeliveryDays(int deliveryDistance) {
                ///    System.out.println("\nЗадание 3.");

                // if (deliveryDistance <= 20) {
                //   System.out.println("Доставка занимает сутки");
                //}
                //if (deliveryDistance > 20 && deliveryDistance <= 60) {
                //  System.out.println("Доставка занимает двое суток");
                //}
                //if (deliveryDistance > 60 && deliveryDistance <= 100) {
                //  System.out.println("Доставка занимает трое суток");
                //}




