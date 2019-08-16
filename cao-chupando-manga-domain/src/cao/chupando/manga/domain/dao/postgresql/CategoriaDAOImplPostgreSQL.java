/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cao.chupando.manga.domain.dao.postgresql;

import cao.chupando.manga.domain.dao.ICategoriaDAO;
import cao.chupando.manga.domain.entidades.Categoria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gustavo
 */
public class CategoriaDAOImplPostgreSQL 
        implements ICategoriaDAO {
    
    private Connection criaConexao(){
        Connection conexao = null;
        try{
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/manga", "postgres", "123");
        } catch(Exception erro){
                erro.printStackTrace();
        }
        return conexao;
    }

    @Override
    public void inserir(Categoria ent) {
        Connection con = criaConexao();
        
        String sql = "insert into categoria (nome)" + "VALUES ('" + ent.getNome() + "')";
        
        try{
        con.createStatement().execute(sql);
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    @Override
    public void atualizar(Categoria ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Categoria> consultar() {
        try{
            List<Categoria> lista = new ArrayList<>();
            
            return lista;
        }catch(Exception erro){
            erro.printStackTrace();
        }
        return null;
    }
    
    
}
