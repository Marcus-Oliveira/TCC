/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.designare.test;

import br.com.designare.DAO.DiagramaDAO;
import br.com.designare.model.Diagrama;
import br.com.designare.model.Projeto;
import br.com.designare.model.Usuario;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author kenedy
 */
public class TestaDiagramaDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        DiagramaDAO dao = new DiagramaDAO();
        Usuario usuario = new Usuario(9);
        Projeto projeto = new Projeto(2,usuario);
        //Diagrama diagrama = new Diagrama(projeto);

        //testa inclusão
//        diagrama.setNome("UseCase01");
//        diagrama.setTipo("Caso de Uso");
//        dao.incluir(diagrama);
        
        //testa lista
        //Armazenar os produtos usando o método lista
         List<Diagrama> diagramas = dao.listaDiagrama(projeto);
         
         //imprime as informações dos produtos:
         for (Diagrama diagrama : diagramas) { //for each
         System.out.println("Id: " + diagrama.getId());
         System.out.println("Nome: " + diagrama.getNome());
         System.out.println("Tipo: " + diagrama.getTipo());
         System.out.println("Projeto: " + diagrama.getProjeto().getId());
         }         
    }
    
}
