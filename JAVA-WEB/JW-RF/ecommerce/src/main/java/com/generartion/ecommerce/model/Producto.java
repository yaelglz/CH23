package com.generartion.ecommerce.model;

public class Producto {
	
	private Long id;
	private String nombre;
	private String descripcion;
	private String uRL_Imagen;
	private double precio;
	
	//Constructor vacio para el JAckson(serealizar y deserealizar un objeto JAVA a JSON)
	public Producto() {

	}

	//Constructor con todos los campos
	public Producto(Long id, String nombre, String descripcion, String uRL_Imagen, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.uRL_Imagen = uRL_Imagen;
		this.precio = precio;
	}

	//Getters - Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getuRL_Imagen() {
		return uRL_Imagen;
	}

	public void setuRL_Imagen(String uRL_Imagen) {
		this.uRL_Imagen = uRL_Imagen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	//toString(sobreescritura de metodos)
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", uRL_Imagen="
				+ uRL_Imagen + ", precio=" + precio + "]";
	}
}


