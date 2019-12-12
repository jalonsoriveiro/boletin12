/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12;

import javax.swing.JOptionPane;

/**
 *
 * @author jalonsoriveiro
 */
public class Garaxe {
    
    private int numeroCoches=0;
    private String matricula;
    private int plazasGaraxe=2;
    public Garaxe(){                
    }
    public Garaxe(int p_numero_coches,String p_matricula){
        
        this.numeroCoches = p_numero_coches;
        this.matricula = p_matricula;                
    }

    public int getNumeroCoches() {
        return numeroCoches;
    }

    public void setNumeroCoches(int p_numeroCoches) {
        
        comprobarGaraxe(p_numeroCoches);
        this.numeroCoches = numeroCoches;
        
        
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPlazasGaraxe() {
        return plazasGaraxe;
    }

    public void setPlazasGaraxe(int plazasGaraxe) {
        this.plazasGaraxe = plazasGaraxe;
    }
    
     // Antes de deixar aparcar un coche.
     // Debemos comprobar que temos sitio para él,
     //en caso afirmativo poñemos unha mensase “ PLAZAS DISPOÑIBLES “ 
    //e rexistramos o coche . No caso contrario poríamos unha mensaxe “ 
    //COMPLETO “.
    public String comprobarGaraxe(int p_numeroCoches){
       plazasGaraxe =1;
        System.out.println("Coche nuevo ");
        
                
            if (plazasGaraxe == numeroCoches){            
                System.out.println("Garaxe cheo");            
            }else{
                System.out.println("Plazas Dispoñibles");
                numeroCoches++;
            }
        
        
        return null;
        
        
        }
    
}
