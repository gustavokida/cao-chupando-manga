/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author gustavo
 */
@Path("/categoria")
public class CategoriaController {
 
    @GET
    @Path("/")
    public String index(){
        return "teste";
    }
    
}
