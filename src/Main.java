public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");

        int clientOS = 0;
        if (clientOS ==0) {
            System.out.println("Установите версию приложения для iOS по ссылке.\n");
        } else if (clientOS ==1) {
            System.out.println("Установите версию приложения для Android по ссылке.\n");
        } else {
            System.out.println("error.\n");
        }

        //Задание 2
        System.out.println("Задание 2");

        int clientOS1 = 5;
        int clientDeviceYear = 2017;

        if (clientOS1 == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
        } else if (clientOS1 == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        }
        if (clientOS1 > 1 || clientOS1 < 0) {
            System.out.println("error.\n" + "Устройство не поддерживается\n");
        } else {
            System.out.println("https://,,,,,,,,,,,,,\n");
        }



        //Задание 3
        System.out.println("Задание 3");
        int year = 2021;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
            System.out.println( year + " год является високосным\n");
        } else {
            System.out.println( year + " год не является високосным\n");
        }


        //Задание 4
        System.out.println("Задание 4");

        int deliveryDistance = 1005;
        int oneDay = 1;
        int nextDayKm = 40;
        int deliveryTime = (deliveryDistance - 20) / nextDayKm;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + oneDay + "\n" );
        } else {
            System.out.println("Потребуется дней: " + ((oneDay * 2) + deliveryTime) + "\n" );
        }


        //Задание 5
        System.out.println("Задание 5");

        int monthNumber = 14;
        switch (monthNumber) {

            case 12:
            case 1:
            case 2:
                System.out.println("Зима\n");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна\n");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето\n");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень\n");
                break;
            default:
                System.out.println(" Такого месяца не существует\n");
        }
    }
}

