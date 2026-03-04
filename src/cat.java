import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.io.File; // Required for file path

public class cat {

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Image Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        String imagePath = "C:/Users/2402498/IdeaProjects/ECPE205-ACTIVITYGIT/catpics/hisnameis.jfif";
        ImageIcon icon = new ImageIcon(imagePath);
        JLabel label = new JLabel(icon);

        frame.add(label);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    static void main() {
        createAndShowGUI();
    }
}

