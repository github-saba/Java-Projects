import javax.swing.*;
import java.awt.*;

public class SwingDemo2 {
    public static void main(String[] args) {
        // Always start Swing apps on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("My App");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            // Use a layout that allows multiple components (e.g., FlowLayout)
            frame.setLayout(new FlowLayout());

            JButton button = new JButton("Click on me");
            JLabel label = new JLabel("Hello World");

            frame.add(button);
            frame.add(label);

            frame.setVisible(true);
        });
    }
}
