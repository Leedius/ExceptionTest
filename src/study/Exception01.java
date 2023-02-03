package study;

import java.util.Scanner;

public class Exception01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        int a = sc.nextInt();
        System.out.print("숫자 입력 : ");
        int b = sc.nextInt();


        System.out.println(" a / b = " + (a / b));
        //입력받는 것을 종료한다.
        sc.close();
    }
}
