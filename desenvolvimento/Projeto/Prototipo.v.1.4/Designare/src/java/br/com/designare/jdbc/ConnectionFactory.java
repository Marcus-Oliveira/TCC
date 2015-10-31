package br.com.designare.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author kenedy
 */
public class ConnectionFactory {
    public Connection getConnection() throws ClassNotFoundException {
        try {
            String url ="jdbc:mysql://localhost:3306/designare";
            String usuario = "root";
            String senha = "root";
            Class.forName("com.mysql.jdbc.Driver"); 
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
