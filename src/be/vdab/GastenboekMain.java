/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab;

import be.vdab.gastenboek.Gastenboek;
import be.vdab.gastenboek.GastenboekEntry;
import be.vdab.gastenboek.GastenboekManager;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author arne.simons
 */
public class GastenboekMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GastenboekManager gbm = new GastenboekManager();
        Scanner sc = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        scString.useDelimiter("\n");
        
        System.out.print("Gastenboek: 1=Tonen, 2=Schrijven, 9=Stop : ");
        int keuze = sc.nextInt();
        while (keuze != 9) {
            switch (keuze) {
                case 1:
                    List<GastenboekEntry> gbList = gbm.getGastenboek().getGastenboekEntries();
                    System.out.println("Aantal entries : " + gbList.size());
                    for (Iterator<GastenboekEntry> i = gbList.iterator(); i.hasNext(); ) {
                        GastenboekEntry gbe = i.next();
                        System.out.println("Op " + gbe.getDatum() + " schreef " + gbe.getSchrijver() + " het volgende: " + gbe.getBoodschap());
                    }
                    break;
                case 2:
                    System.out.print("Uw naam : ");
                    String naam = scString.next();
                    System.out.print("Uw commentaar : ");
                    String commentaar = scString.next();
                    gbm.schrijfGastenboekEntry(new GastenboekEntry(naam, commentaar));
                    break;
            }
            System.out.print("Gastenboek: 1=Tonen, 2=Schrijven, 9=Stop : ");
            keuze = sc.nextInt();
        }
        
        // Op het einde schrijven we het gastenboek pas weg
        gbm.schrijfGastenboek();
        
    }
    
}
