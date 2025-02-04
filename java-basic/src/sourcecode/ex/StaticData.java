package sourcecode.ex;

public class StaticData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        staticValue++;
    }

    public void instanceCall() {
        instanceValue++;
        staticValue++;
    }

    private void instanceMethod() {
        instanceValue++;
        staticValue++;
    }

    private static void staticMethod() {
        staticValue++;
    }

}
