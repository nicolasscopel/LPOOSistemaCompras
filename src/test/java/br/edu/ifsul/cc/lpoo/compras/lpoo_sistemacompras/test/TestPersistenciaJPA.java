/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.compras.lpoo_sistemacompras.test;

import br.edu.ifsul.cc.lpoo.compras.lpoo_sistemacompras.dao.PersistenciaJPA;
import org.junit.Test;

/**
 *
 * @author 20222PF.CC0019
 */
public class TestPersistenciaJPA {
    
   // @Test
    public void testConexaoJPA() {
        //criar um objeto do tipo PersistenciaJPA.
        PersistenciaJPA jpa = new PersistenciaJPA();
        if (jpa.conexaoAberta()) {
            System.out.println("Conectou ao Banco de Dados por JPA");
            jpa.fecharConexao();
        } else {
            System.out.println("Nao conectou ao Banco de Dados");

        }
    }
    
}
