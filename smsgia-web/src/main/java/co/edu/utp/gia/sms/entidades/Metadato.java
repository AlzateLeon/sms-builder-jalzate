package co.edu.utp.gia.sms.entidades;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import static javax.persistence.FetchType.EAGER;

/**
 * Representa un element del formato RIS
 * 
 * @author Christian A. Candela
 * @author Luis Eduardo Sepúlveda
 * @author Grupo de Investigacion en Redes Informacion y Distribucion - GRID
 * @author Universidad del Quindío
 * @author Grupo de Investigacion en Inteligencia Artificial - GIA
 * @author Universidad Tecnológica de Pereira
 * @version 1.0
 * @since 5/06/2019
 *
 */
@Entity
@NamedQueries({

		@NamedQuery(name = Metadato.METADATO_GET_ALL, query = "select m from Metadato m where m.referencia.id = :id and m.identifier = :tipo ")

})
public class Metadato implements Serializable {
	/**
	 * Variable que representa el atributo serialVersionUID de la clase
	 */
	private static final long serialVersionUID = 4287992191212757639L;
	/**
	 * Consulta que permite obtener los metadatos de una referencia que pertenecen a
	 * un cierto tipo<br />
	 * <code>select m from Metadato m where m.referencia.id = :id and m.identifier = :tipo </code>
	 * 
	 */
	public static final String METADATO_GET_ALL = "Metadato.getAll";

	/**
	 * Variable que representa el atributo id de la clase
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer id;
	/**
	 * Variable que representa el identificador del elemento
	 */
	@Enumerated(STRING)
	private TipoMetadato identifier;

	/**
	 * Variable que representa el valor asiciado al elemento
	 */
	private String value;

	@ManyToOne(fetch = EAGER)
	private Referencia referencia;

	public Metadato() {
	}

	/**
	 * Metodo que permite inicializar los elementos de la clase Metadato
	 * 
	 * @param identifier
	 * @param value
	 * @param referencia
	 */
	public Metadato(TipoMetadato identifier, String value, Referencia referencia) {
		this.identifier = identifier;
		this.value = value;
		this.referencia = referencia;
	}

	/**
	 * Metodo que permite inicializar los elementos de la clase RISElement
	 * 
	 * @param name  Nombre del elemento RIS
	 * @param value Valor del elemento RIS
	 */
	public Metadato(TipoMetadato name, String value) {
		this.identifier = name;
		this.value = value;
	}

	/**
	 * Metodo que permite obtener el valor del atributo identifier
	 * 
	 * @return El valor del atributo identifier
	 */
	public TipoMetadato getIdentifier() {
		return identifier;
	}

	/**
	 * Metodo que permite asignar un valor al atributo identifier
	 * 
	 * @param TipoMetadato Valor a ser asignado al atributo identifier
	 */
	public void setIdentifier(TipoMetadato identifier) {
		this.identifier = identifier;
	}

	/**
	 * Metodo que permite obtener el valor del atributo value
	 * 
	 * @return El valor del atributo value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Metodo que permite asignar un valor al atributo value
	 * 
	 * @param value Valor a ser asignado al atributo value
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Metadato other = (Metadato) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
