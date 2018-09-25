/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_clases_objetos;

import java.util.Scanner;

/**
 *
 * @author Bryan Rivera Villaseñor
 */
public class EVA1_3_CLASES_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Crear objetos de clases: instanciacion
        //declarar variable
        //nombre de la clase, nombre del objeto
        EVA1_3_CLASES_OBJETOS pObjetoPpal; //declarando un objeto
        //asignacion de memoria (crear la instancia)
        pObjetoPpal = new EVA1_3_CLASES_OBJETOS ();// constructor
        System.out.println("El objeto tiene: " + pObjetoPpal);
        EVA1_3_CLASES_OBJETOS pObj2 = new EVA1_3_CLASES_OBJETOS();//instanciacion
        ////
        simple pObjSim1 = new simple();
        //Scanner
        Scanner bCap = new Scanner (System.in);
    }
    
}
//Clase sin estado (Variables)
//ni comportamiento (metodos)
class simple{
    
}
