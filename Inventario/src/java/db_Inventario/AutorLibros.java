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
@Table(name = "autor_libros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AutorLibros.findAll", query = "SELECT a FROM AutorLibros a")
    , @NamedQuery(name = "AutorLibros.findByIdAutorlibros", query = "SELECT a FROM AutorLibros a WHERE a.idAutorlibros = :idAutorlibros")
    , @NamedQuery(name = "AutorLibros.findByNombreAutorlibros", query = "SELECT a FROM AutorLibros a WHERE a.nombreAutorlibros = :nombreAutorlibros")
    , @NamedQuery(name = "AutorLibros.findByApellidoAutorlibros", query = "SELECT a FROM AutorLibros a WHERE a.apellidoAutorlibros = :apellidoAutorlibros")})
public class AutorLibros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_autorlibros")
    private Integer idAutorlibros;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nombre_autorlibros")
    private String nombreAutorlibros;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "apellido_autorlibros")
    private String apellidoAutorlibros;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAutorlibros")
    private Collection<Libros> librosCollection;

    public AutorLibros() {
    }

    public AutorLibros(Integer idAutorlibros) {
        this.idAutorlibros = idAutorlibros;
    }

    public AutorLibros(Integer idAutorlibros, String nombreAutorlibros, String apellidoAutorlibros) {
        this.idAutorlibros = idAutorlibros;
        this.nombreAutorlibros = nombreAutorlibros;
        this.apellidoAutorlibros = apellidoAutorlibros;
    }

    public Integer getIdAutorlibros() {
        return idAutorlibros;
    }

    public void setIdAutorlibros(Integer idAutorlibros) {
        this.idAutorlibros = idAutorlibros;
    }

    public String getNombreAutorlibros() {
        return nombreAutorlibros;
    }

    public void setNombreAutorlibros(String nombreAutorlibros) {
        this.nombreAutorlibros = nombreAutorlibros;
    }

    public String getApellidoAutorlibros() {
        return apellidoAutorlibros;
    }

    public void setApellidoAutorlibros(String apellidoAutorlibros) {
        this.apellidoAutorlibros = apellidoAutorlibros;
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
        hash += (idAutorlibros != null ? idAutorlibros.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AutorLibros)) {
            return false;
        }
        AutorLibros other = (AutorLibros) object;
        if ((this.idAutorlibros == null && other.idAutorlibros != null) || (this.idAutorlibros != null && !this.idAutorlibros.equals(other.idAutorlibros))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db_Inventario.AutorLibros[ idAutorlibros=" + idAutorlibros + " ]";
    }
    
}
