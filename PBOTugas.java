/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.tugas;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class PBOTugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;
        input = JOptionPane.showInputDialog("Anda Sedang belajar apa?");
        JOptionPane.showMessageDialog(null, "Belajar "+input+" sangat mudah","Message",JOptionPane.INFORMATION_MESSAGE);
        
            }
    
}
