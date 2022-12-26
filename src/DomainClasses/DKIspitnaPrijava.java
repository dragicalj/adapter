/* DKIspitnaPrijava.java
 * @autor  prof. dr Sinisa Vlajic,
 * Univerzitet u Beogradu
 * Fakultet organizacionih nauka 
 * Katedra za softversko inzenjerstvo
 * Laboratorija za softversko inzenjerstvo
 * 06.11.2017
 */

package DomainClasses;


import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Promenljivo!!!
public class DKIspitnaPrijava implements Serializable, GeneralDObject {
  
    private int SifraPrijave;
    private String BrojIndeksa;
    private int SifraPredmeta;
    private int Ocena;
    private java.util.Date Datum;
    
    public DKIspitnaPrijava() 
    {   SifraPrijave=0;			   
        BrojIndeksa="000000";			   
        SifraPredmeta=0;			   
        Ocena=5;			   
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
        Date dDatum = new Date();
        Datum = java.sql.Date.valueOf(sm.format(dDatum)); 
    }

    public DKIspitnaPrijava(int SifraPrijave, String BrojIndeksa, int SifraPredmeta, int Ocena, Date Datum)  	
    {   this.SifraPrijave = SifraPrijave;
        this.BrojIndeksa = BrojIndeksa;
        this.SifraPredmeta = SifraPredmeta;
        this.Ocena = Ocena;
        this.Datum = Datum;
    }   
    
    // Primarni kljuc		
    public DKIspitnaPrijava(int SifraPrijave)  	
    {   this.SifraPrijave = SifraPrijave;
    }

    public int getSifraPrijave(){ return SifraPrijave;} 
    public String getBrojIndeksa(){ return BrojIndeksa;} 
    public int getSifraPredmeta(){ return SifraPredmeta;} 
    public int getOcena(){ return Ocena;} 
    public Date getDatum(){ return Datum;} 

    public void setSifraPrijave(int SifraPrijave){this.SifraPrijave = SifraPrijave;}
    public void setBrojIndeksa(String BrojIndeksa){this.BrojIndeksa = BrojIndeksa;}
    public void setSifraPredmeta(int SifraPredmeta){this.SifraPredmeta = SifraPredmeta;}
    public void setOcena(int Ocena){this.Ocena = Ocena;}
    public void setDatum(Date Datum){this.Datum = Datum;}
    @Override
    public String getNameByColumn(int column)
        { String names[] = {"SifraPrijave","BrojIndeksa","SifraPredmeta","Ocena","Datum"}; 
          return names[column];
        }		
 
    @Override
    public GeneralDObject getNewRecord(ResultSet rs)  throws SQLException
    {return new DKIspitnaPrijava(rs.getInt("SifraPrijave"),rs.getString("BrojIndeksa"),rs.getInt("SifraPredmeta"),rs.getInt("Ocena"),rs.getDate("Datum"));} 
    @Override
    public String getAtrValue() {return SifraPrijave + ", " + (BrojIndeksa == null ? null : "'" + BrojIndeksa + "'") + ", " + SifraPredmeta + ", " + Ocena + ", " + "'" + Datum + "'";}
    @Override
    public String setAtrValue(){return "SifraPrijave=" + SifraPrijave + ", " + "BrojIndeksa=" + (BrojIndeksa == null ? null : "'" + BrojIndeksa + "'") + ", " + "SifraPredmeta=" + SifraPredmeta + ", " + "Ocena=" + Ocena + ", " + "Datum=" + "'" + Datum + "'";}
    @Override
    public String getClassName(){return "DKIspitnaPrijava";}
    @Override
    public String getWhereCondition(){return "SifraPrijave = " + SifraPrijave;}
}



    
    
    
