/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_Inventario;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author charly
 */
@Entity
@Table(name = "peliculas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Peliculas.findAll", query = "SELECT p FROM Peliculas p")
    , @NamedQuery(name = "Peliculas.findByIdPelicula", query = "SELECT p FROM Peliculas p WHERE p.idPelicula = :idPelicula")
    , @NamedQuery(name = "Peliculas.findByTituloPelicula", query = "SELECT p FROM Peliculas p WHERE p.tituloPelicula = :tituloPelicula")
    , @NamedQuery(name = "Peliculas.findByDuracionPelicula", query = "SELECT p FROM Peliculas p WHERE p.duracionPelicula = :duracionPelicula")
    , @NamedQuery(name = "Peliculas.findByBackCover", query = "SELECT p FROM Peliculas p WHERE p.backCover = :backCover")
    , @NamedQuery(name = "Peliculas.findByFrontCover", query = "SELECT p FROM Peliculas p WHERE p.frontCover = :frontCover")})
public class Peliculas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pelicula")
    private Integer idPelicula;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "titulo_pelicula")
    private String tituloPelicula;
    @Basic(optional = false)
    @NotNull
    @Column(name = "duracion_pelicula")
    private int duracionPelicula;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "back_cover")
    private String backCover;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "front_cover")
    private String frontCover;
    @JoinColumn(name = "id_idioma", referencedColumnName = "id_idioma")
    @ManyToOne(optional = false)
    private Idioma idIdioma;
    @JoinColumn(name = "id_subtitulos", referencedColumnName = "id_subtitulos")
    @ManyToOne(optional = false)
    private Subtitulos idSubtitulos;
    @JoinColumn(name = "id_actor", referencedColumnName = "id_actor")
    @ManyToOne(optional = false)
    private Actor idActor;
    @JoinColumn(name = "id_rating", referencedColumnName = "id_rating")
    @ManyToOne(optional = false)
    private Rating idRating;
    @JoinColumn(name = "id_genero", referencedColumnName = "id_genero")
    @ManyToOne(optional = false)
    private Genero idGenero;

    public Peliculas() {
    }

    public Peliculas(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public Peliculas(Integer idPelicula, String tituloPelicula, int duracionPelicula, String backCover, String frontCover) {
        this.idPelicula = idPelicula;
        this.tituloPelicula = tituloPelicula;
        this.duracionPelicula = duracionPelicula;
        this.backCover = backCover;
        this.frontCover = frontCover;
    }

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public int getDuracionPelicula() {
        return duracionPelicula;
    }

    public void setDuracionPelicula(int duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }

    public String getBackCover() {
        return backCover;
    }

    public void setBackCover(String backCover) {
        this.backCover = backCover;
    }

    public String getFrontCover() {
        return frontCover;
    }

    public void setFrontCover(String frontCover) {
        this.frontCover = frontCover;
    }

    public Idioma getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(Idioma idIdioma) {
        this.idIdioma = idIdioma;
    }

    public Subtitulos getIdSubtitulos() {
        return idSubtitulos;
    }

    public void setIdSubtitulos(Subtitulos idSubtitulos) {
        this.idSubtitulos = idSubtitulos;
    }

    public Actor getIdActor() {
        return idActor;
    }

    public void setIdActor(Actor idActor) {
        this.idActor = idActor;
    }

    public Rating getIdRating() {
        return idRating;
    }

    public void setIdRating(Rating idRating) {
        this.idRating = idRating;
    }

    public Genero getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Genero idGenero) {
        this.idGenero = idGenero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPelicula != null ? idPelicula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peliculas)) {
            return false;
        }
        Peliculas other = (Peliculas) object;
        if ((this.idPelicula == null && other.idPelicula != null) || (this.idPelicula != null && !this.idPelicula.equals(other.idPelicula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db_Inventario.Peliculas[ idPelicula=" + idPelicula + " ]";
    }
    
}
