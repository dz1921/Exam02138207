import Examinations.BPExamination;
import Examinations.MRIExamination;
import Panels.*;
import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class PanelControl extends JPanel {
    public PanelControl(){
        setLayout(new GridLayout(2,1));

        Patient pat1 = new Patient("Daphne Von Oram", "https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg", 62);
        BPExamination mybp = new BPExamination(LocalDate.of(2023,9,23), 130,70, "ST");
        MRIExamination mymri = new MRIExamination(LocalDate.of(2023,9,15), "https://martinh.netfirms.com/BIOE60010/mri1.jpg", 2);
        pat1.assignBPExamination(mybp);
        pat1.assignMRIExamination(mymri);

        DoctorsPanel doctorsPanel = new DoctorsPanel(pat1);
        AdminPanel adminPanel = new AdminPanel(pat1);


        Patient pat2 = new Patient("Sebastian Compton", "https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg", 31);
        BPExamination mybp2 = new BPExamination(LocalDate.of(2023,11,20), 150, 80, "VST");
        MRIExamination mymri2 = new MRIExamination(LocalDate.of(2023,11,19), "https://martinh.netfirms.com/BIOE60010/mri2.jpg", 4);
        pat2.assignMRIExamination(mymri2);
        pat2.assignBPExamination(mybp2);
        doctorsPanel.addPatient(pat2);
        adminPanel.addPatient(pat2);

        doctorsPanel.addToPanel();
        adminPanel.addToPanel();
        add(doctorsPanel);
        add(adminPanel);



    }
}
