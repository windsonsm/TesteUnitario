/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeunitario;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Windson
 */
public class ValidaDadosTest {
    
    ValidaDados v;
    
    public ValidaDadosTest() {
    }
    
    @Before
    public void setUp() {
        v = new ValidaDados();
    }

    @Test
    public void testValidarCNPJ() {
        assertEquals(true, v.validarCNPJ("22688303000181"));
    }
    @Test
    public void testValidarCNPJ1() {
        assertEquals(true, v.validarCNPJ("22688303000"));
    }
    @Test
    public void testValidarCNPJ2() {
        assertEquals(true, v.validarCNPJ("65292383000189"));
    }

    @Test
    public void testValidarCPF() {
        assertEquals(true, v.validarCPF("08895174607"));
    }
    @Test
    public void testValidarCPF1() {
        assertEquals(true, v.validarCPF("67748910634"));
    }
    @Test
    public void testValidarCPF2() {
        assertEquals(true, v.validarCPF("13575741697"));
    }
    
}
