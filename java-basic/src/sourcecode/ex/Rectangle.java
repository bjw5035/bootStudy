package sourcecode.ex;

public class Rectangle {
    int width;
    int height;

    static int calculateArea(int width, int height) {
        return width * height;
    }

    int calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }

    boolean calculateSquare(int width, int height) {
        return width == height;
    }

}
