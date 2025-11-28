import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Assignment6 extends Frame {

    private TextField textField1;
    private Button countButton,resetButton;
    static int count=0;

    public Assignment6() { //constructor
        // Set up the frame
        setTitle("Assignment-6");
        setSize(300, 250);
         this.addWindowListener(new WindowAdapter() {
            // Anonymous class to override windowClosing event
            public void windowClosing(WindowEvent e)
            {
                // Call dispose method
                System.exit(0);

            }
        });
        setLayout(null);

        // Create text fields and button
        textField1 = new TextField();
        textField1.setEditable(false); // Result field should not be editable
        countButton = new Button("Count");
        resetButton = new Button("Reset");

        // Set bounds for the components
         textField1.setBounds(30, 50, 130, 30);

        countButton.setBounds(180, 50, 80, 30);
 resetButton.setBounds(50, 100, 80, 30);

        // Add components to the frame

         add(textField1);
        add(countButton);
 add(resetButton);
 textField1.setText(Integer.toString(count));
         // Add action listener to the count button  
         countButton.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 try {
  textField1.setText(Integer.toString(++count));


                 } catch (NumberFormatException ex) {
                    textField1.setText("Invalid Input");
                 }
             }
         });
 // Add action listener to the add button  
         resetButton.addActionListener(new ActionListener() {

             public void actionPerformed(ActionEvent e) {
                 try {
                      count=0;
  textField1.setText(Integer.toString(count));
                 } catch (NumberFormatException ex) {
                    textField1.setText("Invalid Input");
                 }
             }
         });

    }

    public static void main(String[] args) {
        Assignment6 frame = new Assignment6();
        frame.setVisible(true);
    }
}
