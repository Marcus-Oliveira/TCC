/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.designare.test;

import br.com.designare.DAO.ComponenteDAO;
import br.com.designare.model.Componente;
import br.com.designare.model.Diagrama;
import br.com.designare.model.Projeto;
import br.com.designare.model.Usuario;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author kenedy
 */
public class TestaComponenteDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        ComponenteDAO dao = new ComponenteDAO();
        Usuario usuario = new Usuario(9);
        Projeto projeto = new Projeto(2,usuario);
        Diagrama diagrama = new Diagrama(1,projeto);
        //Componente componente = new Componente(diagrama);
        
        //testa inclusão
//        componente.setNome("Manter Produto");
//        componente.setLigacao(1);
//        componente.setTipo("Caso de Uso");
//        componente.setAssociacao("Simples");
//        dao.incluir(componente);
        
        //testa lista
        //Armazenar os produtos usando o método lista
         //List<Componente> componentes = dao.listaComponente(diagrama);
         
         //imprime as informações dos produtos:
//         for (Componente componente : componentes) { //for each
//         System.out.println("Id: " + componente.getId());
//         System.out.println("Nome: " + componente.getNome());
//         System.out.println("Ligação: " + componente.getLigacao());         
//         System.out.println("Tipo: " + componente.getTipo());
//         System.out.println("Associação: " + componente.getAssociacao());         
//         System.out.println("Diagrama: " + componente.getDiagrama().getId());
//         }  
         
        //testa lista componentes do tipo Ator
        //Armazenar os produtos usando o método lista
//         List<Componente> atores = dao.listaAtor(diagrama);
//         
//         //imprime as informações dos produtos:
//         for (Componente componente : atores) { //for each
//         System.out.println("Id: " + componente.getId());
//         System.out.println("Nome: " + componente.getNome());
//         System.out.println("Ligação: " + componente.getLigacao());         
//         System.out.println("Tipo: " + componente.getTipo());
//         System.out.println("Associação: " + componente.getAssociacao());         
//         System.out.println("Diagrama: " + componente.getDiagrama().getId());
//         }
         
        //testa lista componentes do tipo Caso de Uso
        //Armazenar os produtos usando o método lista
//         List<Componente> casoDeUso = dao.listaCasodeUso(diagrama);
//         
//         //imprime as informações dos produtos:
//         for (Componente componente : casoDeUso) { //for each
//         System.out.println("Id: " + componente.getId());
//         System.out.println("Nome: " + componente.getNome());
//         System.out.println("Ligação: " + componente.getLigacao());         
//         System.out.println("Tipo: " + componente.getTipo());
//         System.out.println("Associação: " + componente.getAssociacao());         
//         System.out.println("Diagrama: " + componente.getDiagrama().getId());
//         } 
        
//        //testa alteração
//        Componente componente = new Componente(2,diagrama);
//        componente.setNome("Manter Cliente");
//        componente.setLigacao(1);
//        componente.setTipo("Caso de Uso");
//        componente.setAssociacao("Simples");
//        dao.alterar(componente); 
        
//        //testa exclusão
        Componente componente = new Componente(2,diagrama);
        dao.excluir(componente);        
    }
    
}
