/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier3;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Anexo2 {
   
    public static int mcd(int n,int b, int a){
        
       if(b==0)
           return a;
       else
           return mcd(b, a % b);//no se continuar
   }
}
        
    }
    
            
}
