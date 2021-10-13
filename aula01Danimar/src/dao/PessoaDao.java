package dao;

import aula03.Pessoa;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */

/**
    private int id;
    private String nome;
    private String preferencia;
    private String genero;
    private String streaming;
*/
public class PessoaDao {
    public void save(Pessoa pessoa){
        String sql = "INSERT INTO pessoa(id,nome,preferencia"
                + "genero, streaming"
                + "VALUES(?,?,?,?)";
       
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try{
            conn = ConnectionFactory.createConnectionToMysql();
            pstm = conn.prepareStatement(sql);
            
            // Recebe os valores       
            pstm.setString(1, pessoa.getNome());

            pstm.setString(2, pessoa.getPreferencia());

            pstm.setString(3, pessoa.getGenero());
            
            pstm.setString(4, pessoa.getStreaming());
            
            //Executa a sql para inserção dos dados
            pstm.execute();
            } 
        
        catch (Exception e) {
            e.printStackTrace();
        } 
        
        finally {
            //Fecha as conexões
            try {
                if (pstm != null) {
                    pstm.close();
                }
                
                if (conn != null) {
                    conn.close();
                }
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void exluir_ID(int id_excluir){   
    }
    public void excluir_todos(){
        String sql = "Delete FROM pessoa";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try{
            conn = ConnectionFactory.createConnectionToMysql();
            pstm = conn.prepareStatement(sql);
            
            // Recebe os valores       
            pstm.setString(1, pessoa.getNome());

            // pstm.setString(2, pessoa.getPreferencia());

            //pstm.setString(3, pessoa.getGenero());
            
            pstm.setString(4, pessoa.getStreaming());
            
            //Executa a sql para inserção dos dados
            pstm.execute();
            } 
        
        catch (Exception e) {
            e.printStackTrace();
        } 
        
        finally {
            //Fecha as conexões
            try {
                if (pstm != null) {
                    pstm.close();
                }
                
                if (conn != null) {
                    conn.close();
                }
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public List<Pessoa> buscarTudo(){
        String sql = "SELECT * FROM contato";

        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        Connection conn = null;
        PreparedStatement pstm = null;

        //Classe que vai recuperar os dados do banco de dados
        ResultSet rset = null;
        try {
            conn = ConnectionFactory.createConnectionToMysql();
            pstm = conn.prepareStatement(sql);
            rset = pstm.executeQuery();

            //Enquanto existir dados no banco de dados, faça
            while (rset.next()) {
                Pessoa pessoa = new Pessoa();

                //Recupera o id do banco e atribui ele ao objeto
                pessoa.setId(rset.getInt("id"));

                //Recupera o nome do banco e atribui ele ao objeto
                pessoa.setNome(rset.getString("nome"));

                //Recupera a idade do banco e atribui ele ao objeto
                pessoa.setPreferencia(rset.getString("preferencia"));

                //Recupera a data do banco e atribui ela ao objeto
                pessoa.setGenero(rset.getString("genero"));

                //Recupera a data do banco e atribui ela ao objeto
                pessoa.setStreaming(rset.getString("streaming"));

                //Recupera a data do banco e atribui ela ao objeto
                pessoas.add(pessoa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return pessoas;
}
}