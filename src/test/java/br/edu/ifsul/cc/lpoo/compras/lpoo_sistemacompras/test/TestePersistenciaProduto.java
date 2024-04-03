/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.compras.lpoo_sistemacompras.test;

import br.edu.ifsul.cc.lpoo.compras.lpoo_sistemacompras.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.compras.lpoo_sistemacompras.model.Produto;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20222PF.CC0019
 */
public class TestePersistenciaProduto {
    
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    
    
    public TestePersistenciaProduto() {
    }
    
    @Before // o que fazer antes da persistencia
    public void setUp() {
        
        jpa.conexaoAberta();
        
        
    }
    
    @After // o que fazer depois da persistencia
    public void tearDown() {
        
        jpa.fecharConexao();
    }

    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
    public void testePersistenciaProduto() throws Exception{
        //criar objeto produto
        
        Produto p = new Produto();
        
        p.setDescricao("Computador");
        p.setValor(5000.00);
        
        //persistir objeto
        jpa.persist(p);
        
        //buscar objeto persistido
        Produto persistidoProduto = (Produto)jpa.find(Produto.class, p.getId());
        
        //verificar se objeto persistido é igual ao
        Assert.assertEquals(p.getDescricao(), persistidoProduto.getDescricao());
        
    }
}
