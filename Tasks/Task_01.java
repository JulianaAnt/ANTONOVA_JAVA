package com.company;

public class Task_01 {

    public static void main(String[] args) {
            int x = 15867;
                System.out.println("Сумма - " + x +" руб.");
                System.out.println("Количество купюр:");
            int sum5000 = x/5000;
                System.out.println("5000 руб. - " + sum5000);
            int sum2000 = (x-(5000*sum5000))/2000;
                System.out.println("2000 руб. - " + sum2000);
            int sum1000 = (x-(5000*sum5000))/1000;
                System.out.println("1000 руб. - " + sum1000);
            int sum500 = (x-(5000*sum5000))/500;
                System.out.println("500  руб. - " + sum500);
            int sum200 = (x-500-(5000*sum5000))/200;
                System.out.println("200  руб. - " + sum200);
            int sum100 = (x-500-200-(5000*sum5000))/100;
                System.out.println("100  руб. - " + sum100);
            int sum50 = (x-500-200-100-(5000*sum5000))/50;
                System.out.println("50   руб. - " + sum50);
            int sum10 = (x-500-200-100-50-(5000*sum5000))/10;
                System.out.println("10   руб. - " + sum10);
             int sum5 = (x-500-200-100-50-10-(5000*sum5000))/5;
                System.out.println("5    руб. - " + sum5);
             int sum1 = (x-500-200-100-50-10-5-(5000*sum5000))/1;
                System.out.println("1    руб. - " + sum1);
    }
}
