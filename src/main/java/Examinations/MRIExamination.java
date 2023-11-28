package Examinations;

import Examinations.Examination;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;

public class MRIExamination extends Examination {
    private URL image;
    private int fieldstr;

    public MRIExamination(LocalDate date, String imagelink, int fieldstr){
        super(date);
        this.fieldstr = fieldstr;
        this.image = null;
        try{
            this.image = new URL(imagelink);
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }

    }


    public URL getMRIImage(){
        return image;
    }
    public int getFieldstr(){
        return fieldstr;
    }

}
