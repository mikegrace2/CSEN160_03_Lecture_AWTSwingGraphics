package Current.JCheckBox;

import javax.swing.*;
import java.awt.*;

public class AMain {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())){
                        try {
                            UIManager.setLookAndFeel(info.getClassName());
                            MainFrame myMainFrame = new MainFrame();
                            myMainFrame.show();
                            break;
                        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                                 | UnsupportedLookAndFeelException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
    }
}
