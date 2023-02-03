package study;

import com.sun.jdi.IntegerValue;

public class WrapperTest {
    public static void main(String[] args) {
        Wrapper01 w1 = new Wrapper01();

        String str = "java";
        w1.showData(str);

        Exception01 e = new Exception01();
        w1.showData(e);

        int num = 5;
        Integer num1  = Integer.valueOf(5);
        Double num2 = Double.valueOf(1.1);

        //num이 기본 자료형이라 원래 안되지만 자동으로 형 변환이 되어서 사용가능.
        w1.showData(num);

        //원래는 자료형이 달라서 안되지만 자동으로 형 변환이 된다.
        int b = num1;
        Integer c = 10;
    }
}
