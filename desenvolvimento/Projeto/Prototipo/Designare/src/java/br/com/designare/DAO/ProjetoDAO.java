package br.com.designare.DAO;

import br.com.designare.jdbc.ConnectionFactory;
import br.com.designare.model.Projeto;
import br.com.designare.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kenedy
 */
public class ProjetoDAO {
    //Conexão com o BD
    private Connection connection;
    public ProjetoDAO () throws ClassNotFoundException {
        this.connection = new ConnectionFactory().getConnection();
    }
    //Inclui projetos no BD
    public void incluir (Projeto projeto) throws SQLException{
        //Query SQL
        String sql = "insert into projeto "+"(nome,usuario_idusuario)"+"values (?,?)";
        try{
            //Prepared Statement para a inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            //Seta o valores
            stmt.setString(1,projeto.getNome());
            stmt.setLong(2, projeto.getUsuario().getId());

            //Executa Statement
            stmt.execute();
            stmt.close();   
        }catch (SQLException e){
            throw new RuntimeException(e);
        }     
    }   
    
    //Lista os projetos do usuário 
    public List <Projeto> listaProjeto(Usuario usuario) throws SQLException{
        //Query SQL
        String sql = "select * from projeto where usuario_idusuario = ?"; 
        try{
        // projetos: array que armazena a lista de registros 
        List<Projeto> projetos = new ArrayList<Projeto>();
        
        //Prepared Statement para a consulta
        PreparedStatement stmt = this.connection.prepareStatement(sql);
        stmt.setLong(1, usuario.getId()); //Seta o parametro da clausula where da query SQL
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
           // Istancia do objeto projeto
           Projeto projeto = new Projeto(rs.getLong("idprojeto"),usuario);
           projeto.setNome(rs.getString("nome"));
           projeto.setData_criacao(rs.getString("create_time"));

           // adiciona o projeto na lista de projetos
           projetos.add(projeto);
        }
        rs.close();
        stmt.close();
        return projetos;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }        
    }
    
    //Consulta de projeto do usuário
    public Projeto consultar (long id, Usuario usuario) throws SQLException{           
        //Query SQL
        String sql = " SELECT nome, create_time FROM projeto WHERE idprojeto = ? and usuario_idusuario = ?";        
        try {   
            //Prepared Statement para a consulta
            PreparedStatement stmt = this.connection.prepareStatement(sql); 

            Projeto projeto = null;

            stmt.setLong(1, id); //Seta o parametro 1 da clausula where da query SQL
            stmt.setLong(2, usuario.getId()); //Seta o parametro 2 da clausula where da query SQL
            ResultSet rs = stmt.executeQuery();  
            if (rs.next()) {
                // Istancia do objeto usuario
                projeto = new Projeto(id, usuario);
                projeto.setNome(rs.getString("nome"));
                projeto.setData_criacao(rs.getString("create_time"));                
            }
            stmt.close();
                return projeto;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    //Altera o projeto do usuario
    public void alterar(Projeto projeto){
        String sql = "update projeto set nome=? where idprojeto = ? and usuario_idusuario = ?";
        try {
            //Prepared Statement para a alteração
            PreparedStatement stmt = connection.prepareStatement(sql);
                                    
            stmt.setString(1, projeto.getNome());
            stmt.setLong(2, projeto.getId()); //Seta o parametro 1 da clausula where da query SQL
            stmt.setLong(3, projeto.getUsuario().getId()); //Seta o parametro 2 da clausula where da query SQL
            stmt.execute();//Executa
         }
         catch (SQLException e) {
            throw new RuntimeException(e);
         }
    }  
}
