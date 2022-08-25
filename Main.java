public class Main {
    public static void main(String[] args){
        doYear(2023);
    }


    public static void doYear(int year) {
        System.out.println("\nЗадание 1.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " не високосный год");
        else System.out.println(year + " високосный год");
    }
}
