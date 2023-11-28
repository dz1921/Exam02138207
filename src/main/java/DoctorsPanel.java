import Examinations.Examination;
import Examinations.MRIExamination;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;

public class DoctorsPanel extends JPanel {
    private ArrayList<Patient> patients;

    public DoctorsPanel(Patient patient){
        patients = new ArrayList<>();
        patients.add(patient);
    }
    public void addPatient(Patient patient){
        patients.add(patient);
    }
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
