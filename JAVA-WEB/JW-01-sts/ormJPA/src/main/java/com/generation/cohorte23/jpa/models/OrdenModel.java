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
@Table(name = "orden")
public class OrdenModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	private String nombreOrden;
	// private Long usuarioId;

	@ManyToOne
	private UsuarioModel usuario;

	/*@OneToMany(mappedBy = "orden")
	private ArrayList<DetalleOrdenModel> detalles;*/
	
	@OneToOne(mappedBy = "orden")
	private DetalleOrdenModel detalle;

	public OrdenModel() {
	}

	public OrdenModel(Long id, String nombreOrden) {
		this.id = id;
		this.nombreOrden = nombreOrden;
		// this.usuarioId = usuarioId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreOrden() {
		return nombreOrden;
	}

	public void setNombreOrden(String nombreOrden) {
		this.nombreOrden = nombreOrden;
	}

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

	/*
	 * public Long getUsuarioId() { return usuarioId; }
	 * 
	 * public void setUsuarioId(Long usuarioId) { this.usuarioId = usuarioId; }
	 */

}
