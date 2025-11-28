import java.awt.*;
import java.awt.event.*;

public class Assignment4 extends Frame implements ActionListener {

    TextField t1, t2;
    Button b;

    Assignment4() {
        setSize(400,300);
        setLayout(null);

        Label l1 = new Label("Enter Text:");
        l1.setBounds(50,50,80,30);

        t1 = new TextField();
        t1.setBounds(150,50,120,30);

        b = new Button("Copy");
        b.setBounds(150,100,80,30);

        Label l2 = new Label("Copied Text:");
        l2.setBounds(50,150,80,30);

        t2 = new TextField();
        t2.setBounds(150,150,120,30);
        t2.setEditable(false);

        add(l1); add(t1);
        add(b);
        add(l2); add(t2);

        b.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        t2.setText(t1.getText());
    }

    public static void main(String args[]) {
        new Assignment4();
    }
}
