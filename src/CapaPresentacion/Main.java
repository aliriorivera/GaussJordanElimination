/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CapaPresentacion;

import CapaLogica.calculoinversa;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author alirio
 */
public class Main {

    private JFrame principal;
    private JButton primero;
    private JTextField filas;
    private JMenuBar bar = new Menu();
    private JLabel label,label2;

    Main(){
        principal = new JFrame("Inversa Metodo 'Gauss - Jordan'");
        principal.setLayout(new BorderLayout());
        primero = new JButton("Iniciar");
        filas = new JTextField("Digite el numero de filas = columnas");
        label2 = new JLabel("Matriz inversa metodo Gauss-Jordan");
        ImageIcon imagen = new ImageIcon("matriz.jpeg");
        label = new JLabel(imagen);
		label.setBackground(new Color(230,227,210));
        principal.add(label2,BorderLayout.WEST);
        principal.add(label,BorderLayout.NORTH);
        principal.add(filas,BorderLayout.SOUTH);
        principal.add(primero,BorderLayout.EAST);
        principal.setJMenuBar(bar);
        principal.setSize(500, 180);
        principal.setLocation(350, 400);
        principal.setVisible(true);

        primero.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e)
            {


               
                try {
                      if(Integer.parseInt(filas.getText())>1){

                        calculoinversa prim2 = new calculoinversa();
                        prim2.N = Integer.parseInt(filas.getText());
                        prim2.calculoinversa();
                      }
                      else{
                        String dialogtitle = "ERROR....";
                        String dialogmessaje ="El Valor Introducido Tiene Que ser un Numero mayor a 1 ";
                        int dialogtype = JOptionPane.PLAIN_MESSAGE;
                        dialogtype= JOptionPane.ERROR_MESSAGE;
                        JOptionPane.showMessageDialog((Component)null,dialogmessaje, dialogtitle,dialogtype);
                      }
                    }


                catch ( Exception excepcion ) {
                    String dialogtitle = "ERROR....";
                    String dialogmessaje ="El Valor Introducido Tiene Que ser un Numero mayor a 1 y multiplo de 2 ";
                    int dialogtype = JOptionPane.PLAIN_MESSAGE;
                    dialogtype= JOptionPane.ERROR_MESSAGE;
                    JOptionPane.showMessageDialog((Component)null,dialogmessaje, dialogtitle,dialogtype);
                    excepcion.printStackTrace();
                }
                
            }
        });
        
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Main();
    }

}
