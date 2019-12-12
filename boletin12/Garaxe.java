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
    private int tiempoEstacionado;
    private double precio;
    private double dineroRecibido;
    
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
    public void comprobarGaraxe(int p_numeroCoches){
       plazasGaraxe =1;
        System.out.println("Coche nuevo ");
        
                
            if (plazasGaraxe == numeroCoches){            
                System.out.println("Garaxe cheo");            
            }else{
                System.out.println("Plazas Dispoñibles");
                numeroCoches++;
            }                         
        }
     public int setHorasEstacionado(){
          do{
            tiempoEstacionado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de horas que el vehiculo paso estacionado"));
            if(tiempoEstacionado <= 0)
                JOptionPane.showMessageDialog(null,"El numero introducido es incorrecto. intentalo de nuevo");
        }while(tiempoEstacionado <= 0);    
        return tiempoEstacionado;    
    }
      public double pagar(){
        do {
            dineroRecibido = Double.parseDouble(JOptionPane.showInputDialog("El total a pagar es de: " +precio+ "\nIntroduce la cantidad de dinero entregada por el cliente"));
            if (dineroRecibido < precio)
                JOptionPane.showMessageDialog(null,"El importe dado por el cliente es menor que el precio a pagar. Intentalo de nuevo");
        }while (dineroRecibido < precio);
        return dineroRecibido;
    }
     public double calcularPrecio(){
        if (tiempoEstacionado > 3)
            precio = 1.5 + (tiempoEstacionado - 3) * 0.2; 
        else{    
            precio = 1.5;
        }
        return precio;
    }
     public void facturaSaida(){
        setHorasEstacionado();calcularPrecio();pagar();
        JOptionPane.showMessageDialog(null,"FACTURA: \nMatricula coche: " +matricula+ "\nTiempo: " +tiempoEstacionado+ "horas\nPrecio: "
                +precio+ "€\nCartos recibidos: " +dineroRecibido+ "€\nCartos devoltos: " +(Math.round((dineroRecibido - precio)*100d)/100d)+ "€");
        
        
    }
}
