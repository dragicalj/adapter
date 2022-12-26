/* Panel.java
 * @autor  prof. dr Sinisa Vlajic,
 * Univerzitet u Beogradu
 * Fakultet organizacionih nauka 
 * Katedra za softversko inzenjerstvo
 * Laboratorija za softversko inzenjerstvo
 * 06.11.2017
 */


package AbstractProductA;



import java.awt.event.KeyEvent;
import java.util.Date;

// Promenljivo!!!
public abstract class Panel extends javax.swing.JPanel{
       
       public abstract String getSifraPrijave(); // Promenljivo!!!
       public abstract javax.swing.JTextField getSifraPrijave1(); // Promenljivo!!!
       public abstract String getSifraPredmeta(); // Promenljivo!!!
       public abstract String getBrojIndeksa(); // Promenljivo!!!
       public abstract String getOcena(); // Promenljivo!!!
       public abstract Date getDatum(); // Promenljivo!!!
       
       public abstract void setSifraPrijave(String SifraPrijave); // Promenljivo!!!
       public abstract void setSifraPredmeta(String SifraPredmeta); // Promenljivo!!!
       public abstract void setBrojIndeksa(String BrojIndeksa); // Promenljivo!!!
       public abstract void setOcena(String Ocena); // Promenljivo!!!
       public abstract void setDatum(Date Datum); // Promenljivo!!!
       
       public abstract void setPoruka(String Poruka);
       
       public abstract javax.swing.JButton getKreiraj(); 
       public abstract javax.swing.JButton getPromeni(); 
       public abstract javax.swing.JButton getObrisi(); 
       public abstract javax.swing.JButton getNadji();
       
       
       
}
