/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.designare.test;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author marcus
 */
public class TesteAction extends ActionSupport{
    
    public TesteAction() {
    }
    
    public String execute() throws Exception {
        //throw new UnsupportedOperationException("Not supported yet.");
        return TesteAction.SUCCESS ;
    }
    
}
