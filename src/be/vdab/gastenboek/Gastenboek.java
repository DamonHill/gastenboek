/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.gastenboek;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arne.simons
 */
public class Gastenboek implements Serializable {
    public static final long serialVersionUID = 1L;
    private List<GastenboekEntry> gastenboek = new ArrayList<>();
    
    public Gastenboek() {
    }
    
    public void add(GastenboekEntry gbe) {
        gastenboek.add(gbe);
    }
    
    public List<GastenboekEntry> getGastenboekEntries() {
        return gastenboek;
    }
    
}
