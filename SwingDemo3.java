import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // Needed for ActionListener

public class SwingDemo3 implements ActionListener {

    private JLabel label;
    private JButton changeButton;
    private JButton resetButton;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SwingDemo3().createAndShowGUI());
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("My App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        label = new JLabel("Hello World");
        changeButton = new JButton("Change Text");
        resetButton = new JButton("Reset");

        // Add buttons and label to the panel
        panel.add(changeButton);
        panel.add(resetButton);
        panel.add(label);
        frame.add(panel);

        // Register ActionListener for both buttons
        changeButton.addActionListener(this);
        resetButton.addActionListener(this);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource(); // Find which button was clicked

        if (source == changeButton) {
            label.setText("Welcome to Java Swing");
        } else if (source == resetButton) {
            label.setText("Hello World");
        }
   }
}
