/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_Inventario;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author charly
 */
@Entity
@Table(name = "rating")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rating.findAll", query = "SELECT r FROM Rating r")
    , @NamedQuery(name = "Rating.findByIdRating", query = "SELECT r FROM Rating r WHERE r.idRating = :idRating")
    , @NamedQuery(name = "Rating.findByRating", query = "SELECT r FROM Rating r WHERE r.rating = :rating")})
public class Rating implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_rating")
    private Integer idRating;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rating")
    private int rating;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRating")
    private Collection<Peliculas> peliculasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRating")
    private Collection<HojasTrabajo> hojasTrabajoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRating")
    private Collection<Revistas> revistasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRating")
    private Collection<Juegos> juegosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRating")
    private Collection<Libros> librosCollection;

    public Rating() {
    }

    public Rating(Integer idRating) {
        this.idRating = idRating;
    }

    public Rating(Integer idRating, int rating) {
        this.idRating = idRating;
        this.rating = rating;
    }

    public Integer getIdRating() {
        return idRating;
    }

    public void setIdRating(Integer idRating) {
        this.idRating = idRating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @XmlTransient
    public Collection<Peliculas> getPeliculasCollection() {
        return peliculasCollection;
    }

    public void setPeliculasCollection(Collection<Peliculas> peliculasCollection) {
        this.peliculasCollection = peliculasCollection;
    }

    @XmlTransient
    public Collection<HojasTrabajo> getHojasTrabajoCollection() {
        return hojasTrabajoCollection;
    }

    public void setHojasTrabajoCollection(Collection<HojasTrabajo> hojasTrabajoCollection) {
        this.hojasTrabajoCollection = hojasTrabajoCollection;
    }

    @XmlTransient
    public Collection<Revistas> getRevistasCollection() {
        return revistasCollection;
    }

    public void setRevistasCollection(Collection<Revistas> revistasCollection) {
        this.revistasCollection = revistasCollection;
    }

    @XmlTransient
    public Collection<Juegos> getJuegosCollection() {
        return juegosCollection;
    }

    public void setJuegosCollection(Collection<Juegos> juegosCollection) {
        this.juegosCollection = juegosCollection;
    }

    @XmlTransient
    public Collection<Libros> getLibrosCollection() {
        return librosCollection;
    }

    public void setLibrosCollection(Collection<Libros> librosCollection) {
        this.librosCollection = librosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRating != null ? idRating.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rating)) {
            return false;
        }
        Rating other = (Rating) object;
        if ((this.idRating == null && other.idRating != null) || (this.idRating != null && !this.idRating.equals(other.idRating))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db_Inventario.Rating[ idRating=" + idRating + " ]";
    }
    
}
