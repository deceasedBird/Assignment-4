import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        frame.setTitle("Theme Park Subway");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640,512);
        frame.setVisible(true);
        ImageIcon image = new ImageIcon("SubwayLogo.png");
        frame.setIconImage(image.getImage());
    }
}
