package Examinations;

import java.time.LocalDate;

public class BPExamination extends Examination {
    private int syspres;
    private int diapres;
    private String term;

    public BPExamination(LocalDate date, int syspres, int diapres, String term){
        super(date);
        this.syspres = syspres;
        this.diapres= diapres;
        this.term = term;
    }
    public int getSyspres(){
        return syspres;
    }
    public int getDiapres(){
        return diapres;
    }
    public String getTerm(){
        return term;
    }
}
