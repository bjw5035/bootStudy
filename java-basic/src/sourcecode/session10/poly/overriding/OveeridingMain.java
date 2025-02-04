package sourcecode.session10.poly.overriding;

public class OveeridingMain {

    public static void main(String[] args) {

        // �ڽ� ������ �ڽ� �ν��Ͻ� ����
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();
        System.out.println(" =============================== ");

        // �θ� ������ �θ� �ν��Ͻ� ����
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();
        System.out.println(" =============================== ");

        // �θ� ������ �ڽ� �ν��Ͻ� ����(������ ����)
        Parent poly = new Child();
        System.out.println("Poly -> Child");
        System.out.println("value = " + poly.value); // ������ �������̵�x

        // �������̵� �� ���� �켱������ �������� ������ Child.method�� ���
        poly.method();  // �޼��� �������̵�o
        System.out.println(" =============================== ");

    }

}
