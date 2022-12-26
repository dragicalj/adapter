/* Projektant.java
 * @autor  prof. dr Sinisa Vlajic,
 * Univerzitet u Beogradu
 * Fakultet organizacionih nauka 
 * Katedra za softversko inzenjerstvo
 * Laboratorija za softversko inzenjerstvo
 * 06.11.2017
 */

package Adaptee;

import AbstractProductA.*;
import AbstractProductB.*;
import AbstractProductC.*;


public abstract class Projektant { // Adaptee
      class SoftverskiSistem 
           {  EkranskaForma ef; 
              BrokerBazePodataka bbp; 
              Kontroler kon; 
           }
      
       SoftverskiSistem ss;
               
       abstract public void kreirajEkranskuFormu();   
       abstract public void kreirajBrokerBazePodataka ();
       abstract public void kreirajKontroler ();
       abstract public void kreirajSoftverskiSistem();
       abstract public void prikaziEkranskuFormu();
}
