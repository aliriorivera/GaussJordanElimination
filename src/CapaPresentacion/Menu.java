/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CapaPresentacion;

/**
 *
 * @author alirio
 */


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JMenuBar{

	private JMenuItem i1,i2,i3,i4,i5;
	private About about;
	private Main ventana;

	Menu (){
		super();

		ImageIcon imagen = new ImageIcon("new.gif");
		ImageIcon imagen1 = new ImageIcon("salir.gif");
		ImageIcon imagen3 = new ImageIcon("acercade.gif");



		JMenu Archivo= new JMenu("Archivo");
		Archivo.setBackground(new Color(200,200,200));
		JMenu Edicion = new JMenu ("About");
		Archivo.setBackground(new Color(200,200,200));


		i3= new JMenuItem("Salir...",imagen1);
		i4= new JMenuItem("About...",imagen3);
		i5=new JMenuItem("new...",imagen);

		Archivo.add(i5);
		Archivo.add(i3);
		Edicion.add(i4);

		i4.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e)
            {
            	about = new About();
            }
        });

		i5.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e)
            {
            	ventana = new Main();
            }
        });

		i3.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e)
            {
            	System.out.println("has cerrado el programa satisfactoriamente"	);
            	System.out.println("gracias por utilizar nuestro programa  chaoooooooooo....."	);
            	System.exit(0);
            }
        });


		this.setBackground(new Color(210,0,100));
		this.setFont(new Font("Comic Sans MS",Font.PLAIN, 12));
		this.add(Archivo);
		this.add(Edicion);
	}

}