import javax.swing.*;
import java.awt.*;

public class kuppaMode extends JFrame{
    Container container;
    JLabel kuppa = new JLabel("I am kuppa");


    public kuppaMode(){

        container = getContentPane();
        container.setLayout(new GridBagLayout());



        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
