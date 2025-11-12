import javax.swing.*;
import java.awt.*;
public class SwingDemo1 {
    public static void main(String[] args) {
        // Always start Swing apps on the Event Dispatch Thread (EDT)

         SwingUtilities.invokeLater(() -> {
        	// This code runs on the Event Dispatch Thread
    	    JFrame frame = new JFrame("My App");
   	        frame.setSize(400, 300);
   	        frame.setVisible(true);
         });
   }
}
