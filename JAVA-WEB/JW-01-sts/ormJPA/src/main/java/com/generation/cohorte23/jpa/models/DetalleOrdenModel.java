package com.generation.cohorte23.jpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle_orden")
public class DetalleOrdenModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	private String nombreDetalleOrden;
	// private Long ordenId;
	// private Long productoId;

	/*@ManyToOne
	private ProductoModel producto;

	@ManyToOne
	private OrdenModel orden;*/
	
	@OneToOne
	private OrdenModel orden;
	
	@OneToOne
	private ProductoModel producto;

	public DetalleOrdenModel() {
	}

	public DetalleOrdenModel(Long id, String nombreDetalleOrden) {
		this.id = id;
		this.nombreDetalleOrden = nombreDetalleOrden;
		// this.ordenId = ordenId;
		// this.productoId = productoId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreDetalleOrden() {
		return nombreDetalleOrden;
	}

	public void setNombreDetalleOrden(String nombreDetalleOrden) {
		this.nombreDetalleOrden = nombreDetalleOrden;
	}

	/*public ProductoModel getProducto() {
		return producto;
	}

	public void setProducto(ProductoModel producto) {
		this.producto = producto;
	}*/

	/*public OrdenModel getOrden() {
		return orden;
	}

	public void setOrden(OrdenModel orden) {
		this.orden = orden;
	}*/

	/*
	 * public Long getOrdenId() { return ordenId; }
	 * 
	 * public void setOrdenId(Long ordenId) { this.ordenId = ordenId; }
	 * 
	 * public Long getProductoId() { return productoId; }
	 * 
	 * public void setProductoId(Long productoId) { this.productoId = productoId; }
	 */

}
