package br.com.designare.DAO;

import br.com.designare.jdbc.ConnectionFactory;
import br.com.designare.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kenedy
 */
public class UsuarioDAO {
    //Conexão com o BD
    private Connection connection;
    public UsuarioDAO () throws ClassNotFoundException {
        this.connection = new ConnectionFactory().getConnection();
    }
    //Inclui usuários no BD
    public void incluir (Usuario usuario) throws SQLException{
        //Query SQL
        String sql = "insert into usuario "+"(nome, email,senha)"+"values (?,?,?)";
        try{
            //Prepared Statement para a inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            //Seta o valores
            stmt.setString(1,usuario.getNome());
            stmt.setString(2,usuario.getEmail());
            stmt.setString(3,usuario.getSenha());

            //Executa Statement
            stmt.execute();
            stmt.close();   
        }catch (SQLException e){
            throw new RuntimeException(e);
        }     
    }
    
    
    
    //Lista os usuários do DB
    public List <Usuario> listaUsuario() throws SQLException{
        //Query SQL
        String sql = "select * from usuario"; 
        try{
        // usuarios: array que armazena a lista de registros 
        List<Usuario> usuarios = new ArrayList<Usuario>();
        
        //Prepared Statement para a consulta
        PreparedStatement stmt = this.connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
           // Istancia do objeto usuario
           Usuario usuario = new Usuario(rs.getLong("idusuario"));
           usuario.setNome(rs.getString("nome"));
           usuario.setEmail(rs.getString("email"));
           usuario.setSenha(rs.getString("senha"));

           // adiciona o usuario na lista de usuarios
           usuarios.add(usuario);
        }
        rs.close();
        stmt.close();
        return usuarios;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }        
    }
    
    //Consulta de usuário
    public Usuario consultar (int id) throws SQLException{           
        //Query SQL
        String sql = " SELECT nome,email,senha FROM usuario WHERE idusuario = ?";        
        try {   
            //Prepared Statement para a consulta
            PreparedStatement stmt = this.connection.prepareStatement(sql); 

            Usuario usuario = null;

            stmt.setLong(1, id);//Seta o parametro da clausula where da query SQL
            ResultSet rs = stmt.executeQuery();  
            if (rs.next()) {
                // Istancia do objeto usuario
                usuario = new Usuario(id);
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
            }
            stmt.close();
                return usuario;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //Altera o usuário
    public void alterar(Usuario usuario){
        String sql = "update usuario set nome=?, email=?, senha=? where idusuario=?";
        try {
            //Prepared Statement para a alteração
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.setLong(4, usuario.getId());
            stmt.execute();//Executa
         }
         catch (SQLException e) {
            throw new RuntimeException(e);
         }
    }  
    
}
