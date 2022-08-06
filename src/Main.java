public class Main {
    public static void main(String[] args) {
        // Задача 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Выберите операционную систему: 0 - iOS, 1 - Android");
        }


        // Задача 2
        int clientDeviceYear = 2013;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("«Установите версию приложения для iOS по ссылке»");
        }
        else if(clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке»");
        }
        else if(clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("«Установите версию приложения для Android по ссылке»");
        }
        else if(clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("«Установите версию приложения для Android по ссылке»");
        }

        // Задача 3

        int year = 2022;
        if((year%4==0 && year%100 != 0) || year%400==0){
            System.out.println(year + " год является високосным.");
        }
        else{
            System.out.println(year + " год не является високосным.");
        }

        // Задача 4

        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance>20){
            day = day+1;
        }
        if (deliveryDistance>60){
            day = day + 1;
        }
            System.out.println("Потребуется дней: " + day);


        // Задача 5
        int monthNumber = 1;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

        // Задача 6

        int age = 27;
        int salary = 90_000;
        double limit;
        if( age >=23){
            if(salary>=50_000 && salary < 80_000){
                limit = 3 * salary * 1.2;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей.");
            }
            else if(salary>=80_000){
                limit = 3 * salary * 1.5;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей.");
            }
            else{
                limit = 3 * salary;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей.");
            }
        }
        if(age < 23){
            if(salary>=50_000 && salary < 80_000){
                limit = 2 * salary * 1.2;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей.");
            }
            else if(salary>=80_000){
                limit = 2 * salary * 1.5;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей.");
            }
            else{
                limit = 2 * salary;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей.");
            }
        }


        // Задача 7

       // переменные age и salary инициализированы в задаче 6
        int wantedSum = 330_000;
        double percent = 10;
        int periodMonth = 12;
        if(age<23){
            if(salary > 80_000){
                percent = percent + 1 - 0.7;}
            else {
                percent = percent + 1;
            }
        }
        else if(age>=23 && age<30){
            if(salary > 80_000){
                percent = percent + 0.5 - 0.7;}
            else {
                percent = percent + 0.5;
            }
        }
        double creditSum = wantedSum + wantedSum * percent / 100;
        double paymentMonth = creditSum / periodMonth;
        if(paymentMonth > salary/2){
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + paymentMonth+ " рублей. Платеж по кредиту " + wantedSum + " рублей. Отказано.");
        }
        else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + paymentMonth+ " рублей. Платеж по кредиту " + wantedSum + " рублей. Одобрено.");
        }

    }
}
