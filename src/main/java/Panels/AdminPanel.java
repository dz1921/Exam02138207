package Panels;




import javax.swing.*;
import java.awt.*;

public class AdminPanel extends Panel {
    public AdminPanel(Patient patient){
        super(patient);
    }

    @Override
    public void addToPanel(){
        int i = 0;

        for (Patient patient : patients){
            JLabel jLabel = new JLabel("Patient: " + patient.getName() + ": MRI: " + patient.getMRIExamination().getFieldstr() + " Tesla " + patient.getMRIExamination().getDate() + ": BP: " + patient.getBPExamination().getTerm() + ", " + patient.getBPExamination().getDate(),SwingConstants. CENTER);
            add(jLabel);
            i++;
        }
        setLayout(new GridLayout(i,1));
    }
}
