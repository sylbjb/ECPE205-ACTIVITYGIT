import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.net.URL;

public class cat {

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Image Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        URL imageUrl = cat.class.getResource("/catpics/hisnameis.jfif");
        ImageIcon icon = new ImageIcon(imageUrl);
        JLabel imageLabel = new JLabel(icon);

        JLabel textLabel = new JLabel("His name is shithead and he is a single celled organism");

        frame.add(textLabel, BorderLayout.NORTH);
        frame.add(imageLabel, BorderLayout.CENTER);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    static void main() {
        createAndShowGUI();
    }
}