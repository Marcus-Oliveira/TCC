package br.com.designare.DAO;

import br.com.designare.jdbc.ConnectionFactory;
import br.com.designare.model.Diagrama;
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
public class DiagramaDAO {
    //Conexão com o BD
    private Connection connection;
    public DiagramaDAO () throws ClassNotFoundException {
        this.connection = new ConnectionFactory().getConnection();
    }
    //Inclui diagramas no BD
    public void incluir (Diagrama diagrama) throws SQLException{
        //Query SQL
        String sql = "insert into diagrama "+"(nome,tipo,projeto_idprojeto)"+"values (?,?,?)";
        try{
            //Prepared Statement para a inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            //Seta o valores
            stmt.setString(1,diagrama.getNome());
            stmt.setString(2, diagrama.getTipo());
            stmt.setLong(3, diagrama.getProjeto().getId());

            //Executa Statement
            stmt.execute();
            stmt.close();   
        }catch (SQLException e){
            throw new RuntimeException(e);
        }     
    } 
    
//Lista os diagramas do projeto 
    public List <Diagrama> listaDiagrama(Projeto projeto) throws SQLException{
        //Query SQL
        String sql = "select * from diagrama where projeto_idprojeto = ?"; 
        try{
        // diagramas: array que armazena a lista de registros 
        List<Diagrama> diagramas = new ArrayList<Diagrama>();
        
        //Prepared Statement para a consulta
        PreparedStatement stmt = this.connection.prepareStatement(sql);
        stmt.setLong(1, projeto.getId()); //Seta o parametro da clausula where da query SQL
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
           // Istancia do objeto projeto
           Diagrama diagrama = new Diagrama(rs.getLong("iddiagrama"),projeto);
           diagrama.setNome(rs.getString("nome"));
           diagrama.setTipo(rs.getString("tipo"));

           // adiciona o projeto na lista de projetos
           diagramas.add(diagrama);
        }
        rs.close();
        stmt.close();
        return diagramas;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }        
    }    
}
