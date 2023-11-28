package Examinations;

import java.time.LocalDate;

abstract public class Examination {
    protected LocalDate date;

    public Examination(LocalDate date){
        this.date = date;
    }

    public LocalDate getDate(){
        return date;
    }

}
