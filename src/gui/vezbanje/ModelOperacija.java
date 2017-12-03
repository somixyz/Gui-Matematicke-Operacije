/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui.vezbanje;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Milos Dragovic
 */
public class ModelOperacija {

    
    public ModelOperacija(JComboBox jComboBoxMatOperacija) {
        
        jComboBoxMatOperacija.setModel(new DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/" }));
    }
    
    
    
}
