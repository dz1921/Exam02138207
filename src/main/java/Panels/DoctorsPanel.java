package Panels;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class DoctorsPanel extends Panel {

    public DoctorsPanel(Patient patient){
        super(patient);
    }
    @Override
    public void addToPanel(){
        int i = 0;
        for (Patient patient : patients) {
            JLabel jpicture = new JLabel();
            URL picture = patient.getPicture();
            ImageIcon thisImageIcon = new ImageIcon(picture);
            jpicture.setIcon(thisImageIcon);
            add(jpicture);

            JLabel jpatient = new JLabel("<html>  Name: " + patient.getName() + "<br>   Age: " + patient.getAge()) ;
            add(jpatient);

            JLabel jmri = new JLabel();
            URL mri = patient.getMRIExamination().getMRIImage();
            ImageIcon mriImage = new ImageIcon(mri);
            jmri.setIcon(mriImage);
            add(jmri);

            int sys = patient.getBPExamination().getSyspres();
            int dia = patient.getBPExamination().getDiapres();
            JLabel jbp = new JLabel("  Blood pressure " + sys + " over " + dia);
            add(jbp);
            i++;
        }
        setLayout(new GridLayout(i, 4));
    }

}
