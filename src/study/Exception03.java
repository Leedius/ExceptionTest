package study;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("프로그램 시작~");

        try{
            //try문에서는 예외가 발생되면 그 즉시 catch문으로 이동한다.
            System.out.print("숫자 입력 : ");
            int a = sc.nextInt();
            System.out.print("숫자 입력 : ");
            int b = sc.nextInt();
            System.out.println("a / b = " + (a / b));
            //Exception e : 예외 발생에 대한 정보가 담기는 객체
            //Exception는 모든 ""+Exception클래스의 상위 클래스
            //자료형 일치 catch()에 자료형이 일치 하지않으면 오류
        } catch(InputMismatchException e){
            System.out.println("입력값이 이상해요.");
            e.printStackTrace();
        } catch(ArithmeticException e){
            System.out.println("0으로 나누면 안되요.");
        } finally {
            //예외가 발생하든, 발생하지 않든 무조건 실행되는 코드
            sc.close();
        }

        System.out.println("프로그램 종료~");
    }
}
