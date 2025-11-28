import java.awt.*;
import java.awt.event.*;

public class Assignment3 extends Frame implements ActionListener {
    TextField t;
    Button b1, b2;

    Assignment3() {
        setSize(400, 300);
        setLayout(null);

        t = new TextField("Welcome");
        t.setBounds(100, 100, 120, 30);

        b1 = new Button("Show");
        b1.setBounds(80, 200, 70, 30);

        b2 = new Button("Hide");
        b2.setBounds(180, 200, 70, 30);

        add(t);
        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
            t.setVisible(true);
        if(e.getSource()==b2)
            t.setVisible(false);
    }

    public static void main(String args[]) {
        new Assignment3();
    }
}
