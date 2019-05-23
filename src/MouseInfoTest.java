import java.awt.*;

public class MouseInfoTest {

    private static Point point = new Point();

    public static void main(String[] args) {
//        PointerInfo object = MouseInfo.getPointerInfo();
//        System.out.println(object.getLocation());
        System.out.println(MouseInfo.getPointerInfo().getLocation());
        System.out.println(point.getLocation());
        System.out.println(point.getLocation().equals(MouseInfo.getPointerInfo().getLocation()));
        while (true) {
            System.out.println(MouseInfo.getPointerInfo().getLocation());
            if (point.getLocation().equals(MouseInfo.getPointerInfo().getLocation())) {
                break;
            }
        }
    }
}
