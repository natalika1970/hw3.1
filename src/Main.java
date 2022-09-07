public class Main {
    public static void main(String[] args) {
        // Условный оператор 2 задача1
        System.out.println("Условный оператор 2 задача1");

        int clientOs = 0;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Условный оператор 2 задача2
        System.out.println("Условный оператор 2 задача2");

        int clientDeviceYear = 2020;
        if (clientOs == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");

            }
            // Условный оператор 2 задача3
            System.out.println("Условный оператор 2 задача3");

            int year = 400;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " является високосным");
            } else {
                System.out.println(year + " не является високосным");

            }
            // Условный оператор 2 задача4
            System.out.println("Условный оператор 2 задача4");

            int deliveryDistance = 40;
            int deliveryDays = 1;
            if (deliveryDistance > 20) {
                deliveryDays++;
            }
            if (deliveryDistance > 60) {
                deliveryDays++;
            }
            System.out.println("потребуется дней " + deliveryDays);
        }
        // Условный оператор 2 задача5
        System.out.println("Условный оператор 2 задача5");

        int monthNumber = 15;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("некорректный месяц");
        }
    }
}