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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author charly
 */
@Entity
@Table(name = "subtitulos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subtitulos.findAll", query = "SELECT s FROM Subtitulos s")
    , @NamedQuery(name = "Subtitulos.findByIdSubtitulos", query = "SELECT s FROM Subtitulos s WHERE s.idSubtitulos = :idSubtitulos")
    , @NamedQuery(name = "Subtitulos.findByIdiomaSubtitulos", query = "SELECT s FROM Subtitulos s WHERE s.idiomaSubtitulos = :idiomaSubtitulos")})
public class Subtitulos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_subtitulos")
    private Integer idSubtitulos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "idioma_subtitulos")
    private String idiomaSubtitulos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSubtitulos")
    private Collection<Peliculas> peliculasCollection;

    public Subtitulos() {
    }

    public Subtitulos(Integer idSubtitulos) {
        this.idSubtitulos = idSubtitulos;
    }

    public Subtitulos(Integer idSubtitulos, String idiomaSubtitulos) {
        this.idSubtitulos = idSubtitulos;
        this.idiomaSubtitulos = idiomaSubtitulos;
    }

    public Integer getIdSubtitulos() {
        return idSubtitulos;
    }

    public void setIdSubtitulos(Integer idSubtitulos) {
        this.idSubtitulos = idSubtitulos;
    }

    public String getIdiomaSubtitulos() {
        return idiomaSubtitulos;
    }

    public void setIdiomaSubtitulos(String idiomaSubtitulos) {
        this.idiomaSubtitulos = idiomaSubtitulos;
    }

    @XmlTransient
    public Collection<Peliculas> getPeliculasCollection() {
        return peliculasCollection;
    }

    public void setPeliculasCollection(Collection<Peliculas> peliculasCollection) {
        this.peliculasCollection = peliculasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSubtitulos != null ? idSubtitulos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subtitulos)) {
            return false;
        }
        Subtitulos other = (Subtitulos) object;
        if ((this.idSubtitulos == null && other.idSubtitulos != null) || (this.idSubtitulos != null && !this.idSubtitulos.equals(other.idSubtitulos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return idiomaSubtitulos;
    }
    
}
