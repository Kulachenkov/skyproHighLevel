package com.company;

public class Main {

    public static void main(String[] args) {

        // taskSeven();
        int i = 0;
    }

    public static void taskFour (){
        int count = 0;


        while (count <30){
            count ++;
            if (count % 3 == 0 && count % 5 != 0){
                System.out.println(count + ": ping");
            }else if (count % 5 == 0 && count % 3 != 0){
                System.out.println(count + ": pong");
            }else if (count % 3 == 0 && count % 5 == 0){
                System.out.println(count + ": ping pong");
            }else{
                System.out.println(count + ":");
            }
        }

    }

    public static void taskFive(){
        int a = 0;
        int b = 1;
        int count = 0;

        while (count <4){
            if (count == 0){
                System.out.println(a);
                System.out.println(b);
            }
            count ++ ;
            a = a + b;
            b = a + b;
            System.out.println(a);
            System.out.println(b);

        }
    }

    public static void taskSix (){

        int age = 19;
        double  salary = 58000;
        double credit;


        if (age <= 23){
            credit = salary * 2;

            if (salary >= 50000 && salary < 80000){
                credit = 1.2 * credit;
                }else if(salary >= 80000) {
                credit = 1.5 * credit;
            }

        }else {
            credit = salary * 3;
            if (salary >= 50000 && salary < 80000){
                credit = 1.2 * credit;
            }else if(salary >= 80000) {
                credit = 1.5 * credit;
            }

        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + credit  + " рублей");

    }


    public static void taskSeven(){

        int age = 25;
        double salary = 60000;
        double wantedSum = 330000;
        double basePercent = 10;
        int period = 12;
        double monthPayment = 0;



        if (age <= 23) {
            basePercent += 1;
        } else if (age <= 30 && age > 23){
            basePercent += 0.5;
        }

        if (salary >= 80000){
            basePercent -= 0.7;
        }
        monthPayment = (wantedSum + wantedSum*(basePercent/100)) / 12;

        if (monthPayment > salary / 2){
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + salary / 2 + " рублей. Платеж по кредиту " + monthPayment +  " рублей. Отказано");
        }else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + salary / 2 + " рублей. Платеж по кредиту " + monthPayment +  " рублей. Одобрено");

        }
    }
}
