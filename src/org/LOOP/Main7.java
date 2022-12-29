package org.LOOP;

public class Main7 {
    public static void main(String[] args) {
        int year=2022;
        if(((year%4==0)&&(year%100!=0))||(year%400==0)){
            System.out.println("Leep year");
        }else {
            System.out.println("not year");
        }
    }
}
