package Current.OverwritingPaintMethod2;

import javax.swing.*;

public class AMain {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.add(new DrawPanel());
        frame.setVisible(true);
    }
}
