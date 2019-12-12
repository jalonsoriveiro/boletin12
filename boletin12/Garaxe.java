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
    
    private int numeroCoches;
    private String matricula;
    private int plazasGaraxe;
    private int tiempoAparcado;
    private double precio;
    private double dineroPagado;
    
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
        numeroCoches = numeroCoches;                
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
       plazasGaraxe =5;
        System.out.println("Coche nuevo ");                        
            if (plazasGaraxe == numeroCoches){            
                System.out.println("garaje lleno");            
            }else{
                System.out.println("Plazas Disponibles");
                numeroCoches++;
            }                         
    }
     public int setHorasAparcado(){
          do{
            tiempoAparcado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de horas que el vehiculo paso estacionado"));
            if(tiempoAparcado <= 0)
                JOptionPane.showMessageDialog(null,"El numero introducido es incorrecto. intentalo de nuevo");
        }while(tiempoAparcado <= 0);    
        return tiempoAparcado;    
    }
      public double realizarPago(){
        do {
            dineroPagado = Double.parseDouble(JOptionPane.showInputDialog("El total a pagar es de: " +precio+ "\ncantidad de dinero entregada por el cliente"));
            if (dineroPagado < precio)
                JOptionPane.showMessageDialog(null,"El importe es menor que el precio a pagar. Intentalo de nuevo");
        }while (dineroPagado < precio);
        return dineroPagado;
    }
      
     public double calcularPrecio(){
        if (tiempoAparcado > 3)
            precio = 1.5 + (tiempoAparcado - 3) * 0.2; 
        else{    
            precio = 1.5;
        }
        return precio;
    }
     public void factura(){
       /*LLamar metodos*/
         setHorasAparcado();
        calcularPrecio();
        realizarPago();
        JOptionPane.showMessageDialog(null,"\nMatricula coche: " +matricula+ "\nTiempo: " +tiempoAparcado+ "horas\nPrecio: "
                +precio+ "€\nDinero recibidos: " +dineroPagado+ "€\nDinero devoltos: " +(Math.round((dineroPagado - precio)*100d)/100d)+ "€");
        
        
    }
}
