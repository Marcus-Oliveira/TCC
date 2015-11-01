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

    private Usuario userBean;
     
    public String execute() throws Exception {
        try{
            UsuarioDAO dao = new UsuarioDAO();
            dao.incluir(userBean);
            return SUCCESS;
        }catch(java.lang.Exception e){
            return ERROR;
        }
        
    }
 
    public Usuario getUserBean() {
        return userBean;
    }
 
    public void setUserBean(Usuario userBean) {
        this.userBean = userBean;
    }

}
