package br.com.designare.DAO;

import br.com.designare.jdbc.ConnectionFactory;
import br.com.designare.model.Componente;
import br.com.designare.model.Diagrama;
import br.com.designare.model.Projeto;
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
public class ComponenteDAO {
    //Conexão com o BD
    private Connection connection;
    public ComponenteDAO () throws ClassNotFoundException {
        this.connection = new ConnectionFactory().getConnection();
    }
    //Inclui componentes no BD
    public void incluir (Componente componente) throws SQLException{
        //Query SQL
        String sql = "insert into componente "+"(nome,ligacao,tipo,associacao,diagrama_iddiagrama)"+"values (?,?,?,?,?)";
        try{
            //Prepared Statement para a inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            //Seta o valores
            stmt.setString(1,componente.getNome());
            stmt.setLong(2, componente.getLigacao());            
            stmt.setString(3, componente.getTipo());
            stmt.setString(4, componente.getAssociacao());            
            stmt.setLong(5, componente.getDiagrama().getId());

            //Executa Statement
            stmt.execute();
            stmt.close();   
        }catch (SQLException e){
            throw new RuntimeException(e);
        }     
    }    

    //Lista os componentes do diagrama 
    public List <Componente> listaComponente(Diagrama diagrama) throws SQLException{
        //Query SQL
        String sql = "select * from componente where diagrama_iddiagrama = ?"; 
        try{
        // componentes: array que armazena a lista de registros 
        List<Componente> componentes = new ArrayList<Componente>();
        
        //Prepared Statement para a consulta
        PreparedStatement stmt = this.connection.prepareStatement(sql);
        stmt.setLong(1, diagrama.getId()); //Seta o parametro da clausula where da query SQL
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
           // Istancia do objeto projeto
           Componente componente = new Componente(rs.getLong("idcomponente"),diagrama);
           componente.setNome(rs.getString("nome"));
           componente.setLigacao(rs.getLong("ligacao"));
           componente.setTipo(rs.getString("tipo"));
           componente.setAssociacao(rs.getString("associacao"));

           // adiciona o projeto na lista de projetos
           componentes.add(componente);
        }
        rs.close();
        stmt.close();
        return componentes;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }        
    }  
    
    //Lista os componentes do tipo Ator 
    public List <Componente> listaAtor(Diagrama diagrama) throws SQLException{
        //Query SQL
        String sql = "select * from componente where diagrama_iddiagrama = ? and tipo = 'Ator'"; 
        try{
        // componentes: array que armazena a lista de registros 
        List<Componente> componentes = new ArrayList<Componente>();
        
        //Prepared Statement para a consulta
        PreparedStatement stmt = this.connection.prepareStatement(sql);
        stmt.setLong(1, diagrama.getId()); //Seta o parametro da clausula where da query SQL
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
           // Istancia do objeto projeto
           Componente componente = new Componente(rs.getLong("idcomponente"),diagrama);
           componente.setNome(rs.getString("nome"));
           componente.setLigacao(rs.getLong("ligacao"));
           componente.setTipo(rs.getString("tipo"));
           componente.setAssociacao(rs.getString("associacao"));

           // adiciona o projeto na lista de projetos
           componentes.add(componente);
        }
        rs.close();
        stmt.close();
        return componentes;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }        
    }
    
    //Lista os componentes do tipo Caso de Uso 
    public List <Componente> listaCasodeUso(Diagrama diagrama) throws SQLException{
        //Query SQL
        String sql = "select * from componente where diagrama_iddiagrama = ? and tipo = 'Caso de Uso'"; 
        try{
        // componentes: array que armazena a lista de registros 
        List<Componente> componentes = new ArrayList<Componente>();
        
        //Prepared Statement para a consulta
        PreparedStatement stmt = this.connection.prepareStatement(sql);
        stmt.setLong(1, diagrama.getId()); //Seta o parametro da clausula where da query SQL
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
           // Istancia do objeto projeto
           Componente componente = new Componente(rs.getLong("idcomponente"),diagrama);
           componente.setNome(rs.getString("nome"));
           componente.setLigacao(rs.getLong("ligacao"));
           componente.setTipo(rs.getString("tipo"));
           componente.setAssociacao(rs.getString("associacao"));

           // adiciona o projeto na lista de projetos
           componentes.add(componente);
        }
        rs.close();
        stmt.close();
        return componentes;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }        
    } 
    
    //Altera o projeto do usuario
    public void alterar(Componente componente){
        String sql = "update componente set nome=?, ligacao=?, tipo=?, associacao=? where idcomponente = ? and diagrama_iddiagrama = ?";
        try {
            //Prepared Statement para a alteração
            PreparedStatement stmt = connection.prepareStatement(sql);
                                    
            stmt.setString(1, componente.getNome());
            stmt.setLong(2, componente.getLigacao());
            stmt.setString(3, componente.getTipo());
            stmt.setString(4, componente.getAssociacao());            
            stmt.setLong(5, componente.getId()); //Seta o parametro 1 da clausula where da query SQL
            stmt.setLong(6, componente.getDiagrama().getId()); //Seta o parametro 2 da clausula where da query SQL
            stmt.execute();//Executa
         }
         catch (SQLException e) {
            throw new RuntimeException(e);
         }
    }  
    
    //Altera o projeto do usuario
    public void excluir(Componente componente){
        String sql = "delete from componente where idcomponente = ? and diagrama_iddiagrama = ?";
        try {
            //Prepared Statement para a alteração
            PreparedStatement stmt = connection.prepareStatement(sql);
                                                
            stmt.setLong(1, componente.getId()); //Seta o parametro 1 da clausula where da query SQL
            stmt.setLong(2, componente.getDiagrama().getId()); //Seta o parametro 2 da clausula where da query SQL
            stmt.execute();//Executa
         }
         catch (SQLException e) {
            throw new RuntimeException(e);
         }
    }    
}
