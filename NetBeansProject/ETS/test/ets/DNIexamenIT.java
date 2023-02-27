/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ets;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dam
 */
public class DNIexamenIT {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
@Test
public void testObtenerLetraDNIValido() {
    String letraEsperada = "T";
    String letraObtenida = DNIexamen.obtenerLetra(12345678);
    assertEquals(letraEsperada, letraObtenida);
}

@Test
public void testObtenerLetraDNIMaximo() {
    String letraEsperada = "E";
    String letraObtenida = DNIexamen.obtenerLetra(99999999);
    assertEquals(letraEsperada, letraObtenida);
}

@Test
public void testObtenerLetraDNIMinimo() {
    String letraEsperada = "T";
    String letraObtenida = DNIexamen.obtenerLetra(1);
    assertEquals(letraEsperada, letraObtenida);
}

@Test
public void testObtenerLetraDNILetraInvalida() {
    String letraEsperada = "X";
    String letraObtenida = DNIexamen.obtenerLetra(12345670);
    assertNotEquals(letraEsperada, letraObtenida);
}

@Test
public void testObtenerLetraDNINumeroNegativo() {
    String letraObtenida = DNIexamen.obtenerLetra(-12345678);
    assertNull(letraObtenida);
}

}