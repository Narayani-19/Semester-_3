// Assignment-7  (Using Button with ActionListener)
import java.awt.*;
import java.awt.event.*;
// Driver Class
public class Assignment7 {
       public static void main(String[] args)
    {
        // Create a frame
         Frame frame = new Frame("My Buttons");

         Label label=new Label("Welcome");
 label.setAlignment(Label.CENTER);      // optional
 label.setFont(new Font("Roboto Condensed Light", Font.BOLD, 20));    // optional

        // Create the buttons
         Button b1 = new Button("Red");
      Button b2 = new Button("Green");
 Button b3 = new Button("Blue");
        // Set the position of the button
       b1.setBounds(50, 80, 80, 40);
       b2.setBounds(150, 80, 80, 40);
  b3.setBounds(260, 80, 80, 40);
 label.setBounds(140, 120, 100, 80);

        // Add an action listener to the button b1
         b1.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e)

             {
                 label.setForeground(Color.red);
             }

         });
        // Add an action listener to the button b2
 b2.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e)
             {
                 label.setForeground(Color.green);
             }

  });
        // Add an action listener to the button b3
 b3.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e)
             {
                 label.setForeground(Color.blue);

             }

         });
            // Add window listener (To close the window by clicking on X  button)
         frame.addWindowListener(new WindowAdapter() {
            // Anonymous class to override windowClosing event
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
 // Add buttons to the frame
        frame.add(b1);
 frame.add(b2);
 frame.add(b3);
 frame.add(label);
 // Set the size, layout and visibility

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
