/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author sistemas
 */
public class Operaciones {
    public String Suma(int n1, int n2){
        int resul=n1+n2;
        return String.valueOf(resul);
        //return resul+"";
                
    }
    
    public String resta (int n1, int n2){
        int resul = n1 - n2;
        return String.valueOf(resul);
        
    }
    
    public String multiplicacion(int n1, int n2){
        int resul = n1 * n2;
        return String.valueOf(resul);
        
    }
    public String division (int n1, float n2){
        float resul = n1 / n2;
        return String.valueOf(resul);   
    }
}
