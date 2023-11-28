import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import Examinations.*;

public class Patient {
    private String name;
    private URL picture;
    private int age;
    private MRIExamination mriExamination;
    private BPExamination bpExamination;

    public Patient(String name, String linkpicture, int age){
        this.age = age;
        this.name = name;
        this.picture = null;
        try{
            this.picture = new URL(linkpicture);
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }

    }

    public void assignBPExamination(BPExamination myBP){
        bpExamination = myBP;
    }
    public void assignMRIExamination(MRIExamination myMRI){
        mriExamination = myMRI;
    }
    public int getAge(){
        return age;
    }
    public URL getPicture(){
        return picture;
    }
    public String getName(){
        return name;
    }
    public MRIExamination getMRIExamination(){
        return mriExamination;
    }
    public BPExamination getBPExamination(){
        return bpExamination;
    }
}
