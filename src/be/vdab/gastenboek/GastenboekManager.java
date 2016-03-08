/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.gastenboek;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author arne.simons
 */
public class GastenboekManager {
    private Gastenboek gb =  new Gastenboek();

    public GastenboekManager() {
        leesGastenboek();
    }

    public Gastenboek getGastenboek() {
        return gb;
    }
    
    public void schrijfGastenboekEntry(GastenboekEntry gbe) {
        gb.add(gbe);
    }    
        
    public void schrijfGastenboek() {    
        try (FileOutputStream fos =  new FileOutputStream("D:/JPF/gastenboek.obj");    
             ObjectOutputStream oos = new ObjectOutputStream(fos);) {  
            oos.writeObject(gb); 
        } 
        catch (IOException e) {
            System.out.println("Gastenboek kan niet worden weggeschreven");
        }
    }
    
    public void leesGastenboek() {
        try (FileInputStream fis =  new FileInputStream("D:/JPF/gastenboek.obj"); 
             ObjectInputStream ois = new ObjectInputStream(fis);) {  
            gb = (Gastenboek)ois.readObject();              
        }  
        catch (ClassNotFoundException e) { 
            System.out.println("Klasse niet gevonden"); 
        }
        catch (IOException e) { 
            System.out.println("Kan gastenboek niet vinden, start met nieuw gastenboek");
            gb = new Gastenboek();
        }
    }
}
