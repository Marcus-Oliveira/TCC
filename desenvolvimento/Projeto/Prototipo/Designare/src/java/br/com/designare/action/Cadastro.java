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

    private Usuario userBean;
     
    public String execute() throws Exception {
        UsuarioDAO dao = new UsuarioDAO();
        dao.incluir(userBean);
        // add your login procedure here...
         
        return SUCCESS;
    }
 
    public Usuario getUserBean() {
        return userBean;
    }
 
    public void setUserBean(Usuario userBean) {
        this.userBean = userBean;
    }

}
