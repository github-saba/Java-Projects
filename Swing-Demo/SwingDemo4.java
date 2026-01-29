import javax.swing.*;
import java.awt.*;

public class SwingDemo4 {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SwingDemo4().createAndShowGUI());
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("My App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel(new GridBagLayout());

        JLabel label = new JLabel("Hello World");
        JButton changeButton = new JButton("Change Text");
        JButton resetButton = new JButton("Reset");

        // Add components
        panel.add(changeButton);
        panel.add(resetButton);
        panel.add(label);
        frame.add(panel);

        // Lambda-based event listeners
        changeButton.addActionListener(e -> label.setText("Welcome Java Swing"));
        resetButton.addActionListener(e -> label.setText("Hello World"));

        frame.setVisible(true);
    }
}
