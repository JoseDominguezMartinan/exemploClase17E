/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraysobxetos;

import javax.swing.JOptionPane;

/**
 *
 * @author jdominguezmartinan
 */
public class ExemploArraysObxetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persoa[]persoas=new Persoa[4];
        String nome,dni;
        Metodos obxMetodos=new Metodos();
//        for(int i=0;i<persoas.length;i++){
//           nome=JOptionPane.showInputDialog("introduce o nome");
//           dni=JOptionPane.showInputDialog("inserte o dni");
//           persoas[i]=new Persoa(nome,dni);
//        }

        Persoa[]maisPersoas={new Persoa("jose","1"),new Persoa("kike","2")};
        obxMetodos.amosar(maisPersoas);
        
        
        
        }
    // metodo para crear array
         public Persoa[] crearArray(){
             Persoa []pers=new Persoa[5];
             String nome,dni;
           for(int i=0;i<pers.length;i++){
           nome=JOptionPane.showInputDialog("introduce o nome");
           dni=JOptionPane.showInputDialog("inserte o dni");
           pers[i]=new Persoa(nome,dni);
          
        }
        return pers;
         }


   
    
}
