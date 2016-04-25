/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cadastrar.Cliente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author THIAGO-PC
 */
public class Teste {
    Cliente cli = new Cliente("422.164.838-42", "(18)3351-1076", "Teste", "Antonio Silveira Brasil", "Masculino"); 
    //Esses testes verificam se os conteudos do cadastro estao corretos    
    @Test      
    public void TesteCPF() {            
        assertEquals("422.164.838-42", cli.getCPF());
    }
    @Test
    public void TesteTel(){
         assertEquals("(18)3351-1076", cli.getTelefone());
    }
    @Test
    public void TesteNome(){
        assertEquals("Teste", cli.getNome());
    }
    @Test
    public void TesteEndereco(){
        assertEquals("Antonio Silveira Brasil", cli.getEndereco());
    }
    @Test
    public void TesteSexo(){
        assertEquals("Masculino", cli.getSexo());
    }
    //Esses testes validam se os campos do BD não serão "estourados"
    @Test
    public void TesteTelTamanho(){
        assertTrue(14 <= cli.getTelefone().length());
    }
    @Test
    public void TesteNomeTamanho(){
        assertTrue(cli.getNome().length() < 100);
    }
    @Test
    public void TesteEnderecoTamanho(){
        assertTrue(cli.getNome().length() < 50);
    }
    @Test
    public void TesteCPFTamanho(){
        assertEquals(14, cli.getCPF().length());
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
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

    /**
     * @return the CPF
     */
    
}
