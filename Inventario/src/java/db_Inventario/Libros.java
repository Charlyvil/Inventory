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
@Table(name = "libros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Libros.findAll", query = "SELECT l FROM Libros l")
    , @NamedQuery(name = "Libros.findByIdLibro", query = "SELECT l FROM Libros l WHERE l.idLibro = :idLibro")
    , @NamedQuery(name = "Libros.findByIsbn", query = "SELECT l FROM Libros l WHERE l.isbn = :isbn")
    , @NamedQuery(name = "Libros.findByCantidad", query = "SELECT l FROM Libros l WHERE l.cantidad = :cantidad")
    , @NamedQuery(name = "Libros.findByAreaLibro", query = "SELECT l FROM Libros l WHERE l.areaLibro = :areaLibro")
    , @NamedQuery(name = "Libros.findByA\u00f1oPublicacion", query = "SELECT l FROM Libros l WHERE l.a\u00f1oPublicacion = :a\u00f1oPublicacion")
    , @NamedQuery(name = "Libros.findByTituloLibro", query = "SELECT l FROM Libros l WHERE l.tituloLibro = :tituloLibro")
    , @NamedQuery(name = "Libros.findByTipoLibro", query = "SELECT l FROM Libros l WHERE l.tipoLibro = :tipoLibro")
    , @NamedQuery(name = "Libros.findByAudioLibro", query = "SELECT l FROM Libros l WHERE l.audioLibro = :audioLibro")})
public class Libros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_libro")
    private Integer idLibro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "isbn")
    private int isbn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "area_libro")
    private String areaLibro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "a\u00f1o_publicacion")
    private String añoPublicacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "titulo_libro")
    private String tituloLibro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "tipo_libro")
    private String tipoLibro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "audio_libro")
    private boolean audioLibro;
    @JoinColumn(name = "id_rating", referencedColumnName = "id_rating")
    @ManyToOne(optional = false)
    private Rating idRating;
    @JoinColumn(name = "id_idioma", referencedColumnName = "id_idioma")
    @ManyToOne(optional = false)
    private Idioma idIdioma;
    @JoinColumn(name = "id_nivel", referencedColumnName = "id_nivel")
    @ManyToOne(optional = false)
    private Nivel idNivel;
    @JoinColumn(name = "id_autorlibros", referencedColumnName = "id_autorlibros")
    @ManyToOne(optional = false)
    private AutorLibros idAutorlibros;
    @JoinColumn(name = "id_editorial", referencedColumnName = "id_editorial")
    @ManyToOne(optional = false)
    private Editorial idEditorial;

    public Libros() {
    }

    public Libros(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public Libros(Integer idLibro, int isbn, int cantidad, String areaLibro, String añoPublicacion, String tituloLibro, String tipoLibro, boolean audioLibro) {
        this.idLibro = idLibro;
        this.isbn = isbn;
        this.cantidad = cantidad;
        this.areaLibro = areaLibro;
        this.añoPublicacion = añoPublicacion;
        this.tituloLibro = tituloLibro;
        this.tipoLibro = tipoLibro;
        this.audioLibro = audioLibro;
    }

    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getAreaLibro() {
        return areaLibro;
    }

    public void setAreaLibro(String areaLibro) {
        this.areaLibro = areaLibro;
    }

    public String getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(String añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getTipoLibro() {
        return tipoLibro;
    }

    public void setTipoLibro(String tipoLibro) {
        this.tipoLibro = tipoLibro;
    }

    public boolean getAudioLibro() {
        return audioLibro;
    }

    public void setAudioLibro(boolean audioLibro) {
        this.audioLibro = audioLibro;
    }

    public Rating getIdRating() {
        return idRating;
    }

    public void setIdRating(Rating idRating) {
        this.idRating = idRating;
    }

    public Idioma getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(Idioma idIdioma) {
        this.idIdioma = idIdioma;
    }

    public Nivel getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(Nivel idNivel) {
        this.idNivel = idNivel;
    }

    public AutorLibros getIdAutorlibros() {
        return idAutorlibros;
    }

    public void setIdAutorlibros(AutorLibros idAutorlibros) {
        this.idAutorlibros = idAutorlibros;
    }

    public Editorial getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(Editorial idEditorial) {
        this.idEditorial = idEditorial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLibro != null ? idLibro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Libros)) {
            return false;
        }
        Libros other = (Libros) object;
        if ((this.idLibro == null && other.idLibro != null) || (this.idLibro != null && !this.idLibro.equals(other.idLibro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return tituloLibro;
    }
    
}
