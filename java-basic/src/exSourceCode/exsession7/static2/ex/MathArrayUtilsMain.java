package exSourceCode.exsession7.static2.ex;


import static exSourceCode.exsession7.static2.ex.MathArrayUtils.average;
import static exSourceCode.exsession7.static2.ex.MathArrayUtils.max;
import static exSourceCode.exsession7.static2.ex.MathArrayUtils.min;
import static exSourceCode.exsession7.static2.ex.MathArrayUtils.sum;

public class MathArrayUtilsMain {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum=" + sum(values));
        System.out.println("average=" + average(values));
        System.out.println("min=" + min(values));
        System.out.println("max=" + max(values));
    }
}
