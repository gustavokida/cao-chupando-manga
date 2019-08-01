/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cao.chupando.manga.domain.entidades;

import java.util.Date;

/**
 *
 * @author gustavo
 */
public class AutorManga {
    private int id;
    private Date dataInicio;
    private Date DateFim;
    private Autor autor;
    private Manga manga;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDateFim() {
        return DateFim;
    }

    public void setDateFim(Date DateFim) {
        this.DateFim = DateFim;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Manga getManga() {
        return manga;
    }

    public void setManga(Manga manga) {
        this.manga = manga;
    }
    
    
}
