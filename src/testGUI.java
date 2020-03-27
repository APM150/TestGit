import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.io.File;

public class testGUI extends JFrame {
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JMenuItem testMenuItem;

    public testGUI() {
        super("test");
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);


        testMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                fc.setDialogTitle("Test save");
                int result = fc.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File fileToSave = fc.getSelectedFile();
                    System.out.println("Save as file: " + fileToSave.getAbsolutePath());
                }
            }
        });
    }

    public static void main(String[] args) {
        testGUI test = new testGUI();
    }
}
