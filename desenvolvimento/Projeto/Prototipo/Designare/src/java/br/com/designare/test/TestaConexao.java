package br.com.designare.test;

import br.com.designare.jdbc.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author kenedy
 */
public class TestaConexao {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //Abre a conexão
        Connection c = new ConnectionFactory().getConnection();
        System.out.println("conexão aberta");
        
        //Fecha a conexão
        c.close();
        System.out.println("conexão fechada");
    }    
}
