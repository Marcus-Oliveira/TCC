/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.designare.action;

import br.com.designare.DAO.UsuarioDAO;
import br.com.designare.model.Usuario;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author kenedy
 */
public class Cadastro extends ActionSupport {
    Usuario usuario = new Usuario();

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    public Cadastro() {
    }
    
    public String execute() throws Exception {
        UsuarioDAO dao = new UsuarioDAO();
        dao.incluir(usuario);
        return SUCCESS;
    }
    
}
