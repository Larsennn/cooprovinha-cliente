/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Util {
    public static boolean validaCampo(ArrayList<JTextField> campos) {
        boolean camposPreenchidos = true;
        for (JTextField campo : campos) {
            String nomeCampo = campo.getName();
            boolean campoPreenchido = false;
            if (!campo.getText().equals("")) {
                campoPreenchido = true;
            } else {
                JOptionPane.showMessageDialog(null, "O campo " + nomeCampo + " não foi preenchido.", "Erro", JOptionPane.ERROR_MESSAGE);
                campoPreenchido = false;
            }
            
            if (camposPreenchidos) {
                camposPreenchidos = campoPreenchido;
            }
        }
        
        return camposPreenchidos;
    }
}
