/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.designare.action;

import br.com.designare.DAO.UsuarioDAO;
import br.com.designare.model.Usuario;
import com.opensymphony.xwork2.ActionSupport;
import static javax.ws.rs.client.Entity.form;
import org.apache.struts2.dispatcher.mapper.ActionMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import static javax.ws.rs.client.Entity.form;

/**
 *
 * @author kenedy
 */
public class Cadastro extends ActionSupport {

    private String nome;
    private String email;
    private String senha;
    private String error_message;

    private Usuario usuario = new Usuario();

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cadastro() {
    }

    public String execute() throws Exception {
        //try {
            UsuarioDAO dao = new UsuarioDAO();
            usuario.setNome(nome);
            usuario.setEmail(email);
            usuario.setSenha(senha);
            dao.incluir(usuario);
            return SUCCESS;
        //} catch (java.lang.RuntimeException e) {
          //  error_message = e.getMessage();
            //return ERROR;
        //}

    }

}
