package study;

import java.util.Scanner;

public class Exception02 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작~");
        Scanner sc = new Scanner(System.in);


        try{
            //예외가 발생할 소지가 있는 코드를 작성.
            System.out.print("숫자 입력 : ");
            int a = sc.nextInt();
            System.out.print("숫자 입력 : ");
            int b = sc.nextInt();


            System.out.println(" a / b = " + (a / b));

            //try문에서 예외가 발생 됬을 때만 catch문 실행
        } catch(Exception e){
            //예외가 발생했을 때 처리 코드 작성
            //예외가 발생해도 코드 끝까지 진행
            System.out.println("예외가 발생 했습니다.");
            //예외 발생 이유를 문자열로 리턴
            System.out.println(e.getMessage());
            //예외 발생 위치, 이유를 출력 -> 통상적으로 많이씀
            e.printStackTrace();
        }

        System.out.println("프로그램 종료~");

    }
}
