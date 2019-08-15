/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cao.chupando.manga.domain.dao.postgresql;

import cao.chupando.manga.domain.dao.ICategoriaDAO;
import cao.chupando.manga.domain.entidades.Categoria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gustavo
 */
public class CategoriaDAOImplPostgreSQL 
        implements ICategoriaDAO {

    @Override
    public void inserir(Categoria ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
