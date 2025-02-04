package sourcecode.ex;

public class Method1Ref {

    public static void main(String[] args) {
        int sum1 = add(1, 2);
        System.out.println(sum1);

        int sum2 = add(3, 4);
        System.out.println(sum2);

        int i = add2(5, 6);
        System.out.println(i);

        int j = add2(6, 7);
        System.out.println(j);
    }

    private static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    private static int add2(int c, int d) {
        int sum = c * d;
        return sum;
    }

}
