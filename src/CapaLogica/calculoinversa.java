/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CapaLogica;

import java.awt.Component;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author alirio
 */

public class calculoinversa {
   public int N,i,j,h;
   public double pivote;
   public double matriz[][];

    public void calculoinversa(){


        /*creamos el pedazo de la matriz total que pertenece a la matri
         de hadamard*/


        double H[][] = new double[N *2][N] ;

      H[0][0] = 1;
      for (int n = 1; n < N; n += n) {
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               H[i+n][j]   =  H[i][j];
               H[i][j+n]   =  H[i][j];
               H[i+n][j+n] = H[i][j]*-1;
            }
         }
      }

      /*finalizacion de la creacion  del pedazo de la matriz total
       que pertenece a la matri de hadamard*/



      /*creamos el otro pedazo de la matriz que corresponde  a la matriz
       diagonal de unos y los demas ceros*/
         for (i=N;i<N*2;i++){
            for (j=0;j<N;j++){

                if(i == (j + N)){
                    H[i][j] = 1;
                }

                if(i != (j + N)){
                    H[i][j] = 0;
                }

            }
        }

            /*finalizacion de la creacion del otro pedazo de la matriz que corresponde  a la matriz
       diagonal de unos y los demas ceros*/

        /*finalizacion de la creacion de la matriz total*/


        /*muestra de la matriz que se creo*/

         for (j=0;j<N;j++){
            for (i=0;i<N*2;i++){
                 System.out.print(H[i][j]+" ");
            }
            System.out.println();
        }


        /*finalizacion de ma muestra de la matriz que se creo*/

         System.out.println();


/*Ponemos el timer que contara cuantos segundos se demora*/

            long tini=0; //tiempo inicial
            double tiempot=0; // tiempo total
            tini=System.nanoTime();


        /*Corrimiento de la matriz para la parte de abajo es decir
         los numero que van debajo de los unos de la diagonal que
         son los que queremos generar */


        for(i=0;i<N;i++){
            for(j=0;j<N;j++){

                if(i==j)
                {
                    int rec = i;
                    h=j;
                    pivote = H[i][j];
                    for(i=j;i<(N*2);i++)
                    {
                        H[i][j] = H [i][j] * (1 / pivote);
                    }
                    i = rec;
                }


                if(j>i){
                    pivote = H[i][j];
                    int rec = i;
                    for(i=0;i<N*2;i++){
                        H[i][j] = H [i][j] -(pivote * H[i][h]);
                    }
                    i = rec;

                }
            }
        }

        /*finalizacion delCorrimiento de la matriz para la parte de abajo es decir
         los numero que van debajo de los unos de la diagonal que
         son los que queremos generar */


          /*Corrimiento de la matriz para la parte de arriba es decir
         los numero que van arriba de los unos de la diagonal que
         son los que queremos generar */

int n=N;

         for(j=n-1;j>=0;j--){
             for(i=n-1;i>=0;i--){

                 if(i>j){
                     pivote = H [i][j];
                     h = i;
                     for(i=((n*2)-1);i>=0;i--){
                         H[i][j] = H[i][j] - (pivote * H[i][h]);
                     }
                     i=h;
                 }
             }
         }

         /*finalizacion de la matriz para la parte de arriba es decir
         los numero que van arriba de los unos de la diagonal que
         son los que queremos generar */

  /*finalizacion del timer de conteo*/

            tiempot=Double.valueOf(System.nanoTime()-tini)*0.000000001;


        /*vemos la matriz final*/

        for (j=0;j<n;j++){
            for (i=0;i<n*2;i++){
                 System.out.print(H[i][j]+" ");
            }
            System.out.println();
        }

/*muestra de cuanto tiempo se demoro*/
            String dialogtitle = "Tiempo Gastado";
            String dialogmessaje ="El Tiempo gastado en el calculo fue: " + tiempot + " " + "segundos" ;
            int dialogtype = JOptionPane.PLAIN_MESSAGE;
            dialogtype= JOptionPane.INFORMATION_MESSAGE;
            JOptionPane.showMessageDialog((Component)null,dialogmessaje, dialogtitle,dialogtype);

    }


}
