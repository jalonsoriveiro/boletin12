/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12;

/**
 *
 * @author jalonsoriveiro
 */
public class Boletin12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Garaxe obj = new Garaxe();
    obj.setNumeroCoches(1);
        System.out.println(obj.getNumeroCoches());
    
    obj.setNumeroCoches(1);
    System.out.println(obj.getNumeroCoches());
    obj.factura();
    }
    
}
