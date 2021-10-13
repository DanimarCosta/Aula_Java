/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Pessoa;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * private int id; private String nome; private String preferencia; private
 * String genero; private String streaming;
 */
public class PessoaDAO {

    public void save(Pessoa pessoa) {
        String sql = "INSERT INTO pessoa(nome,preferencia,"
                + "streaming)"
                + " VALUES(?,?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            //Cria uma conexão com o banco
            conn = ConnectionFactory.createConnectionToPostgreSQL();

            //Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(sql);

            //Adiciona o valor do primeiro parâmetro da sql
            pstm.setString(1, pessoa.getNome());
            //Adicionar o valor do segundo parâmetro da sql
            pstm.setString(2, pessoa.getPreferencia());
            //Adiciona o valor do terceiro parâmetro da sql
            pstm.setString(3, pessoa.getStreaming());

            //Executa a sql para inserção dos dados
            pstm.execute();

        } catch (Exception e) {

            e.printStackTrace();
        } finally {

            //Fecha as conexões
            try {
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
    }

    public void excluir_ID(int id_exluir) {
        String sql = "DELETE FROM pessoa WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToPostgreSQL();

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, id_exluir);

            pstm.execute();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {

            try {
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

    }

    public void excluir_todos() {
        String sql = "DELETE FROM pessoa ";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToPostgreSQL();
            pstm = conn.prepareStatement(sql);
            pstm.execute();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {

            try {
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

    }

    public List<Pessoa> buscarTudo() {

        String sql = "SELECT * FROM pessoa";

        List<Pessoa> lista_pessoas = new ArrayList<Pessoa>();

        Connection conn = null;
        PreparedStatement pstm = null;
        //Classe que vai recuperar os dados do banco de dados
        ResultSet rset = null;

        try {
            conn = ConnectionFactory.createConnectionToPostgreSQL();

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
                pessoa.setStreaming(rset.getString("streaming"));

                //Adiciono o contato recuperado, a lista de contatos
                lista_pessoas.add(pessoa);
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

        return lista_pessoas;
    }

    public List<Pessoa> buscarPorNome(String nomebusca) {

        String sql = "SELECT * FROM pessoa where nome like '%" + nomebusca + "%'";

        List<Pessoa> lista_pessoas = new ArrayList<Pessoa>();

        Connection conn = null;
        PreparedStatement pstm = null;
        //Classe que vai recuperar os dados do banco de dados
        ResultSet rset = null;

        try {
            conn = ConnectionFactory.createConnectionToPostgreSQL();

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
                pessoa.setStreaming(rset.getString("streaming"));

                //Adiciono o contato recuperado, a lista de contatos
                lista_pessoas.add(pessoa);
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

        return lista_pessoas;
    }

    public List<Pessoa> buscarPorID(int idbusca) {

        String sql = "SELECT * FROM pessoa where id = " + idbusca;

        List<Pessoa> lista_pessoas = new ArrayList<Pessoa>();

        Connection conn = null;
        PreparedStatement pstm = null;
        //Classe que vai recuperar os dados do banco de dados
        ResultSet rset = null;

        try {
            conn = ConnectionFactory.createConnectionToPostgreSQL();

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
                pessoa.setStreaming(rset.getString("streaming"));

                //Adiciono o contato recuperado, a lista de contatos
                lista_pessoas.add(pessoa);
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

        return lista_pessoas;
    }

    public List<Pessoa> buscarPorPreferencia(String busca) {

        String sql = "SELECT * FROM pessoa where preferencia like '%" + busca + "%'";

        List<Pessoa> lista_pessoas = new ArrayList<Pessoa>();

        Connection conn = null;
        PreparedStatement pstm = null;
        //Classe que vai recuperar os dados do banco de dados
        ResultSet rset = null;

        try {
            conn = ConnectionFactory.createConnectionToPostgreSQL();

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
                pessoa.setStreaming(rset.getString("streaming"));

                //Adiciono o contato recuperado, a lista de contatos
                lista_pessoas.add(pessoa);
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

        return lista_pessoas;
    }

}
