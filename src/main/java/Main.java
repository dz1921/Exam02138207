
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;


public class Main {
    public static void main(String[] args){
        Frame frame = new Frame("Examination Results");
        frame.setSize(1000,1000);

        PanelControl panelControl = new PanelControl();

        frame.add(panelControl);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {	// Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });





    }

}

