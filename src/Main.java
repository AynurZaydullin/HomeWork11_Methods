import java.time.LocalDate;

public class Main {
    /* Метод для "Задание 1".
    Метод для определения: является ли данный год високосным или нет.*/
    public static void isYearLeap(int year) {
        if ((((year % 400) == 0)) || (((year % 4) == 0) && ((year % 100) != 0))) {
            System.out.println(year + " — високосный год.");
            return;
        }
            System.out.println(year + " — не високосный год.");
    }

    /* Метод для "Задание 2". */
    // 0 - IOS, 1 - Android.
    public static void printApplicationInstallationOptions(int clientOS, int clientDeviceYear) {
            int currentYear = LocalDate.now().getYear();
            if (clientOS == 0 && clientDeviceYear < currentYear){
            System.out.println("Установите  lite-версию (облегченную версию) приложения для iOS по ссылке");
            } else if (clientOS == 0 && clientDeviceYear == currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1 && clientDeviceYear < currentYear) {
                System.out.println("Установите  lite-версию (облегченную версию) приложения для Android по ссылке");
            } else if (clientOS == 1 && clientDeviceYear == currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientDeviceYear < 1990 || clientDeviceYear > 2022) {
                System.out.println("Год выбран не верно");
            }
        }

    /* Метод для "Задание 3".*/
    public static void calculateDelivaryTime(int delivaryDistance) {
        int firstDistanceLimit = 20, secondDistanceLimit = 60, thirdDistanceLimit = 100;
        int delivaryTime = 0, oneHour = 1;
        int firstTimeInterval = oneHour, secondTimeInterval = 2*oneHour, thirdTimeInterval = 3*oneHour;
        if (delivaryDistance > 0 && delivaryDistance < firstDistanceLimit){
            delivaryTime = firstTimeInterval;
            System.out.println("Потребуется дней: " + delivaryTime);
        } else if (delivaryDistance >= firstDistanceLimit && delivaryDistance < (secondDistanceLimit)) {
            delivaryTime = secondTimeInterval;
            System.out.println("Потребуется дней: " + delivaryTime);
        } else if (delivaryDistance >= secondDistanceLimit && delivaryDistance < thirdDistanceLimit) {
            delivaryTime = thirdTimeInterval;
            System.out.println("Потребуется дней: " + delivaryTime);
        } else if (delivaryDistance <= 0) {
            System.out.println("Расстояние доставки не может быть меньше нуля или равно нулю.");
        } else {
            System.out.println("Расстояние слишком большое. Мы не сможем сделать доставку.");
        }
    }
    public static void main(String[] args) {
        //Задание 1.
        System.out.println("Задание 1.");
        /* Создается массив с годами для проверки работы метода isYearLeap(). */
        int[] year = {2000, 2021, 2024, 2100};
        for (int j : year) {
            isYearLeap(j);//вызывается сам проверяемый метод.
        }
        System.out.println();

        //Задание 2.
        System.out.println("Задание 2.");
        printApplicationInstallationOptions(0, 2022);
        printApplicationInstallationOptions(0, 2021);
        printApplicationInstallationOptions(0, 2023);
        printApplicationInstallationOptions(1, 2022);
        printApplicationInstallationOptions(1, 2021);
        printApplicationInstallationOptions(1, 2023);
        System.out.println();

        //Задание 3.
        System.out.println("Задание 3.");
        calculateDelivaryTime(0);
        calculateDelivaryTime(1);
        calculateDelivaryTime(25);
        calculateDelivaryTime(65);
        calculateDelivaryTime(81);
        calculateDelivaryTime(101);

    }
}