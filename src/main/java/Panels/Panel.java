package Panels;

import javax.swing.*;
import java.util.ArrayList;

abstract class Panel extends JPanel {
    protected ArrayList<Patient> patients;

    public Panel(Patient patient){
        patients = new ArrayList<>();
        patients.add(patient);
    }
    public void addPatient(Patient patient){
        patients.add(patient);
    }
    public void addToPanel(){
    }
}
