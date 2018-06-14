/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import caseWorker.*;

/**
 *
 * @author 2105247816
 */
public class clientUnits {

    public clientUnits( String myUnits, String date, String result, String note ){
        Units = myUnits;
        Date = date;
        Result = result;
        Notes = note;
 
 } 
    /**
     * @return the Units
     */
    public String getUnits() {
        return Units;
    }

    /**
     * @param Units the Units to set
     */
    public void setUnits(String Units) {
        this.Units = Units;
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * @return the Result
     */
    public String getResult() {
        return Result;
    }

    /**
     * @param Result the Result to set
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * @return the Notes
     */
    public String getNotes() {
        return Notes;
    }

    /**
     * @param Notes the Notes to set
     */
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }
      
  
     

    private String Units;
    private String Date;
    private String Result;
    private String Notes;
}
