/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeunitario;

/**
 *
 * @author Windson
 */
public class TesteUnitario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ValidaDados v = new ValidaDados();
        System.out.println(v.validarCNPJ("22688303000180"));
        System.out.println(v.validarCPF("08895174609"));
    }
    
}
