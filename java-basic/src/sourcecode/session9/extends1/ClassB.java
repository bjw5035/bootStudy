package sourcecode.session9.extends1;

public class ClassB extends ClassA {

    public ClassB(int a) {
        super(); // �⺻ ������ ���� ����
        System.out.println("ClassB ������ a=" + a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB ������ a=" + a + ", b=" + b);

    }

}
