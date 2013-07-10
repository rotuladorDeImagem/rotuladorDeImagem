/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import gerarTelas.GerenciadorDeImagens;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.rules.TestName;

/**
 *
 * @author Thiago
 */
public class GerenciadorDeImagensTest {
    
    public GerenciadorDeImagensTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
        GerenciadorDeImagens gdi = new GerenciadorDeImagens();
        
        gdi.goTo(null);
        
        
    }
    
    //nao sei se funciona
    public class NameRuleTest {
        @Rule
        public TestName name = new TestName();

        @Test
        public void testA() {
            assertEquals("testA", name.getMethodName());
        }

        @Test
        public void testB() {
            assertEquals("testB", name.getMethodName());
        }
    }
    
    // A Regra ExpectedException permite a especificação 
    // de teste de tipos de exceção esperada e mensagens:
    public static class HasExpectedException {

        @Rule
        public ExpectedException thrown = ExpectedException.none();

        @Test
        public void throwsNothing() {
        }

        @Test
        public void throwsNullPointerException() {
            thrown.expect(NullPointerException.class);
            throw new NullPointerException();
        }

        @Test
        public void throwsNullPointerExceptionWithMessage() {
            thrown.expect(NullPointerException.class);
            thrown.expectMessage("Aconteceu?");            
            throw new NullPointerException("O que aconteceu?");
        }
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}