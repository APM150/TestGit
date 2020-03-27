import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class testGUI2 extends JFrame{
    private JTextField textField1;
    private JPanel panel1;
    private JButton button1;

    public testGUI2() {
        super("test2");
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = textField1.getText();

                setVisible(false);
            }
        });
    }
}
