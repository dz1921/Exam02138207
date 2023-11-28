import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AdminPanel extends JPanel {
    private ArrayList<Patient> patients;
    public AdminPanel(Patient patient){
        this.patients = new ArrayList<>();
        patients.add(patient);
    }
    public void addPatient(Patient patient) {
        patients.add(patient);
    }
    public void addToPanel(){
        int i = 0;

        for (Patient patient : patients){
            JLabel jLabel = new JLabel("Patient: " + patient.getName() + ": MRI: " + patient.getMRIExamination().getFieldstr() + " Tesla " + patient.getMRIExamination().getDate() + ": BP: " + patient.getBPExamination().getTerm() + ", " + patient.getBPExamination().getDate());
            add(jLabel);
            i++;
        }
        setLayout(new GridLayout(i,1));
    }
}
