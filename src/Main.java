public class Main {
    public static void main(String[] args) {

        // вызов метода домашки 2
        hw2_2();
        // вызов метода домашки 2
        hw2_1();
    }
       public static void hw2_2() {
        System.out.println("===Домашняя работа N2.2===\n");
        int amount = 1500;
        int balance = 200;
        int bonus = 0;
        if (amount >= 1000) {
            bonus = (amount / 100);
        }
        System.out.println("итоговый бонус: " + bonus);
        System.out.println("итоговая сумма: " + (bonus + amount + balance));
        System.out.println("\n\n\n");
    }

    public static void hw2_1() {
        System.out.println("===Домашняя работа N2.1===\n");
        int price = 200;
        System.out.println("bonus: " + price / 20);
        System.out.println("\n\n\n");
    }
}

