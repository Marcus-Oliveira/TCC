/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.designare.test;

import br.com.designare.model.Usuario;
import br.com.designare.DAO.UsuarioDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author kenedy
 */
public class TestaUsuarioDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here/        
        //Usuario usuario = new Usuario();
        UsuarioDAO dao = new UsuarioDAO();
        
//      //testa inclusão
//        Usuario usuario = new Usuario();
//        usuario.setNome("User10");
//        usuario.setEmail("teste@teste.com");
//        usuario.setSenha("12345");
//        dao.incluir(usuario);
        
        //testa consultar
        Usuario usuario = dao.consultar(9);
        System.out.println(usuario.getNome());
        System.out.println(usuario.getEmail());
        System.out.println(usuario.getSenha());
        
        //testa alteração
//        Usuario usuario = new Usuario(9);
//        //usuario.setId(1);
//        usuario.setNome("User_UML");
//        usuario.setEmail("user.uml@designare.com.br");
//        usuario.setSenha("admin");
//        dao.alterar(usuario);
        
//         //Armazenar os produtos usando o método lista
//         List<Usuario> usuarios = dao.listaUsuario();
//         
//         //imprime as informações dos produtos:
//         for (Usuario usuario : usuarios) { //for each
//         System.out.println("Id: " + usuario.getId());
//         System.out.println("Nome: " + usuario.getNome());
//         System.out.println("Email: " + usuario.getEmail());
//         System.out.println("Senha: " + usuario.getSenha());
//         }        
    }
    
}
