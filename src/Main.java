public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Задача 2
        System.out.println("Задача 2");
        int clientDeviceYear = 2013;
        if (clientOS == 0 && clientDeviceYear == 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear != 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear == 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Задача 3
        System.out.println("Задача 3");
        int year = 2021;
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 != 0) {
            System.out.println(year + " год не является високосным");
        }
        // Задача 4
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int timeOfDelivery = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней:" + timeOfDelivery);
        } else {
            if (deliveryDistance > 20 && deliveryDistance < 60) {
                System.out.println("Потребуется дней:" + (timeOfDelivery + 1));
            } else if (deliveryDistance > 60 && deliveryDistance < 100) {
                System.out.println("Потребуется дней:" + (timeOfDelivery + 2));
            } else {
                System.out.println("На такое расстояние доставка не осуществляется");
            }
        }
        // Задача 5
        System.out.println("Задача 5");
        }
}