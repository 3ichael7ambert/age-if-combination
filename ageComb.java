package Java.age-if-combination;

import  java.util.Scanner;

public class ageComb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age<=11) {
            System.out.println("Child");
        } else if (age>=12 && age <= 17) {
            System.out.println("Teen");
        }else {
            System.out.println("Adult");
        }
    }
}
