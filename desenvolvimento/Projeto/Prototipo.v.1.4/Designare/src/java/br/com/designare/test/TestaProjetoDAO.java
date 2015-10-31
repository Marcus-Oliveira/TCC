/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.designare.test;

import br.com.designare.DAO.ProjetoDAO;
import br.com.designare.model.Projeto;
import br.com.designare.model.Usuario;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author kenedy
 */
public class TestaProjetoDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        ProjetoDAO dao = new ProjetoDAO();
        Usuario usuario = new Usuario(9);
//        Projeto projeto = new Projeto(usuario);

        //testa inclusão
//        projeto.setNome("Projeto4");
//        dao.incluir(projeto);

        //testa consulta
//        Projeto projeto = dao.consultar(3,usuario);
//        System.out.println(projeto.getNome());
//        System.out.println(projeto.getData_criacao());
        
        //testa lista
        //Armazenar os produtos usando o método lista
//        System.out.println("Usuario: " + usuario.getId());
//         List<Projeto> projetos = dao.listaProjeto(usuario);
//         
//         //imprime as informações dos produtos:
//         for (Projeto projeto : projetos) { //for each
//         System.out.println("Id: " + projeto.getId());
//         System.out.println("Nome: " + projeto.getNome());
//         System.out.println("Data: " + projeto.getData_criacao());
//         System.out.println("Usuario: " + projeto.getUsuario().getId());
//         } 
        
        //testa alteração
        Projeto projeto = new Projeto(2,usuario);
        projeto.setNome("Projeto_11");
        dao.alterar(projeto);
    }   
}
