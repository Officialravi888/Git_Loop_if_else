package org.LOOP;

//public class Main6 {
//    public static void main(String[] args) {
//        int a=10;
//        int b=18;
//
//        if(a>=12){
//            System.out.println("a");
//        } else if (b>=a) {
//            System.out.println("B");
//
//        }else{
//            System.out.println("C");
//        }
//
//    }
//}

class Main {
    public static void main(String[] args) {

        // declaring double type variables
        Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;

        // checks if n1 is greater than or equal to n2
        if (n1 >= n2) {
            if (n1 >= n3) {
                largest = n1;
            }

            else {
                largest = n3;
            }
        } else {
            if (n2 >= n3) {
                largest = n2;
            }

            else {
                largest = n3;
            }
        }

        System.out.println("Largest Number: " + largest);
    }
}