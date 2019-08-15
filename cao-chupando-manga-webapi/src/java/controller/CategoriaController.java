/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import cao.chupando.manga.domain.dao.ICategoriaDAO;
import cao.chupando.manga.domain.dao.list.CategoriaDAOImpl;
import cao.chupando.manga.domain.entidades.Categoria;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author gustavo
 */
@Path("/categoria")
public class CategoriaController {
    
    private ICategoriaDAO
            banco = new CategoriaDAOImpl();
    
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Categoria> index(){
        return banco.consultar();
    }
 
    @GET
    @Path("/select/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Categoria select(@PathParam("id") int pk){
        System.out.println("Parametro:"+pk);
        for(Categoria cat: banco.consultar()){
            if(cat.getId() == pk){
                return cat;
            }
        }
        String json = "{\"id\":"+pk+"}";
        return null;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/cadastrar/{nome}")
    public String cadastrar(@PathParam("nome") String nome){
        try{
            System.out.println("Cadastrando");
            Categoria nova = new Categoria();
            nova.setNome(nome);
            
            banco.inserir(nova);
        } catch(Exception erro){
            return "{\"status\": 0}";
        }
        String ret = "{\"status\": 1}";
        return ret;
    }
}
