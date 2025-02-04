package sourcecode.ex;

public class CarEx {

    private static int totalExCars;
    private String car;

    public CarEx(String car) {
        this.car = car;
        totalExCars++;
    }

    static void showTotalExCars() {
        System.out.println(totalExCars);
    }

}
