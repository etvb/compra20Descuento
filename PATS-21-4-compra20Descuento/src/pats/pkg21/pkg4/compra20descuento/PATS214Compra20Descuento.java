/*
 *Ejercicio 4: En la plaza se hace un 20% de descuento a los clientes, cuya
 * compra supere los $300 pesos. ¿Cual será la cantidad que pagará una persona
 * por su compra?
*/
package pats.pkg21.pkg4.compra20descuento;

import javax.swing.JOptionPane;


public class PATS214Compra20Descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final short condicionDescuento = 300;
        float compraTotal, subTotal, descuento;
        
        subTotal =Integer.parseInt( JOptionPane.showInputDialog("Ingresa la suma de la compra"));
        
        if(subTotal > condicionDescuento){
            
            descuento = subTotal * .20F;
            compraTotal = subTotal - descuento;
            JOptionPane.showMessageDialog(null, "Tiene DESCUENTO de: " + "$" + descuento + "Su Total a pagar es: " + "$" + compraTotal);
        }else{
            JOptionPane.showMessageDialog(null, "Total a pagar: " + subTotal);
            
        }
            
        
        
    }
    
}
