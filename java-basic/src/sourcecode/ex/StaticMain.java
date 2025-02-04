package sourcecode.ex;

public class StaticMain {
    public static void main(String[] args) {

        StaticData data = new StaticData();
        data.instanceCall();
        StaticData.staticCall();
        StaticData staticData = new StaticData();
        staticData.staticCall();

    }

}
