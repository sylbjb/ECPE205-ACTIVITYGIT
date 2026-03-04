import javax.swing.*;
import java.awt.*;

public class popolMode extends JFrame {
    Container con = this.getContentPane();
    JTextField text;
    JLabel e;




    public popolMode(){
        con.setLayout(new GridBagLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Order Screen");

        e = new JLabel("HI Guys");
        addComponent(0,0,1,1,0,0,GridBagConstraints.CENTER,e);




        setSize(600, 800);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    public void addComponent(int x, int y, int width, int height, double weightx, double weighty, int fill, Component c){
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = x;
        constraints.gridy = y;
        constraints.gridwidth = width;
        constraints.gridheight = height;

        constraints.weightx = weightx;
        constraints.weighty = weighty;
        constraints.fill = fill;

        constraints.insets = new Insets(5,5,5,5);

        con.add(c, constraints);
    }



}


