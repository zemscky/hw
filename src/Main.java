public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else{
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Задача 2
        System.out.println("Задача 2");
        int clientDeviceYear = 2013;
        if (clientOS == 0 && clientDeviceYear == 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientOS == 0 && clientDeviceYear != 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (clientOS == 1 && clientDeviceYear == 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        // Задача 3
        System.out.println("Задача 3");
    }
}