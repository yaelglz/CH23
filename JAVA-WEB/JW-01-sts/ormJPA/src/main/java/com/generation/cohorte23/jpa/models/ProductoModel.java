package com.generation.cohorte23.jpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class ProductoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	private String nombreProducto;
	// private Long usuarioId;

	@ManyToOne
	private UsuarioModel usuario;

	/*@OneToMany(mappedBy = "producto")
	private ArrayList<DetalleOrdenModel> detalles;*/
	
	@OneToOne(mappedBy = "producto")
	private DetalleOrdenModel detalle;

	public ProductoModel() {
	}

	public ProductoModel(Long id, String nombreProducto) {
		this.id = id;
		this.nombreProducto = nombreProducto;
		// this.usuarioId = usuarioId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	/*
	 * public Long getUsuarioId() { return usuarioId; }
	 * 
	 * public void setUsuarioId(Long usuarioId) { this.usuarioId = usuarioId; }
	 */

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

	/*public ArrayList<DetalleOrdenModel> getDetalles() {
		return detalles;
	}

	public void setDetalles(ArrayList<DetalleOrdenModel> detalles) {
		this.detalles = detalles;
	}*/

}
