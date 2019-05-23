import java.awt.*;
import java.util.Random;

public class MouseMove {
    public static final int FIVE_SECONDS = 5000;
    public static final int MAX_Y = 400;
    public static final int MAX_X = 400;
    private static Point point = new Point();

    public static void main(String... args) throws Exception {
        System.out.println("Use Ctrl+C to exit the program");
        System.out.println("Or move mouse to top left corner of screen");
        Robot robot = new Robot();
        Random random = new Random();
        while (true) {
            if (point.getLocation().equals(MouseInfo.getPointerInfo().getLocation())) {
                break;
            }
            robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
            Thread.sleep(FIVE_SECONDS);
            if (point.getLocation().equals(MouseInfo.getPointerInfo().getLocation())) {
                break;
            }
        }
    }
}
