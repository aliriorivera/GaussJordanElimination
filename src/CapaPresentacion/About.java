/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CapaPresentacion;

/**
 *
 * @author alirio
 */

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class About {

	private JFrame yo;
	private JLabel label1,label2,label3,label4;
	private JTextArea area;

	About (){
		yo = new JFrame("�� AUTORES ��");
		yo.setLayout(new BorderLayout());
		yo.setBackground(new Color(230,227,210));


		ImageIcon imagen1 = new ImageIcon("escudo.jpg");



		label2 = new JLabel(imagen1);
		label2.setBackground(new Color(230,227,210));

        area = new JTextArea("\n"+"\n"+
                "                            Programa diseñado por:"+"\n"+
				"                           Alirio Rivera Cuervo "+"\n"+
                "                           Yesid Javier Hidalgo Huertas"+"\n"+
                "                           Jorge Rojas Olaya"+"\n"+
                "                     Estudiantes ingenieria de sistemas"+"\n"+
				"                      Universidad Nacional de Colombia.");
		area.setBackground(new Color(230,227,210));

		
		yo.add(label2,BorderLayout.NORTH);

		yo.add(area,BorderLayout.CENTER);

		yo.setSize(410,300);
        yo.setLocation(400, 350);
		yo.setResizable(false);
		yo.setVisible(true);


	}


}
