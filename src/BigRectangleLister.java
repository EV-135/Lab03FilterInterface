import java.awt.Rectangle;
import java.util.ArrayList;


public class BigRectangleLister {
    public static void main(String args[]) {

        ArrayList<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(0, 0, 2, 2));
        rectangles.add(new Rectangle(0, 0, 3, 2));
        rectangles.add(new Rectangle(0, 0, 4, 3));
        rectangles.add(new Rectangle(0, 0, 5, 5));
        rectangles.add(new Rectangle(0, 0, 1, 4));
        rectangles.add(new Rectangle(0, 0, 6, 2));
        rectangles.add(new Rectangle(0, 0, 2, 1));
        rectangles.add(new Rectangle(0, 0, 7, 4));
        rectangles.add(new Rectangle(0, 0, 3, 3));
        rectangles.add(new Rectangle(0, 0, 8, 5));

        BigRectangleFilter filter = new BigRectangleFilter();

        System.out.println("Rectangles with perimeters greater than 10:");

        for (Rectangle rectangle : rectangles) {
            if (filter.accept(rectangle)){
                double perimeter = 2 * (rectangle.getWidth() + rectangle.getHeight());

                System.out.println("Rectangle:" + "Width = " + rectangle.width + " Height = " + rectangle.height + " | Perimeter = " + perimeter);
            }
        }
    }
}
