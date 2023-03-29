package com.generartion.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Indico que mi clase Producto se convierte en una entidad JPA(persistencia de datos)

@Table(name = "Producto") //Especificar de forma correcta el nombre de la tabla

public class Producto {
	@Id//el campo id es la primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //el campo id sera generado automaticamente por la DB
    @Column(name="id", unique = true, nullable = false) //especifica el nombre de la columna en la DB
	//Atibutos
	private Long id;
	private String nombre;
	private String descripcion;
	private String uRL_Imagen;
	private double precio;
	
	//Constructor vacio para el JAckson(serealizar y deserealizar un objeto JAVA a JSON)
	public Producto() {

	}//contructor vacio

	//Constructor con todos los campos
	public Producto(Long id, String nombre, String descripcion, String uRL_Imagen, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.uRL_Imagen = uRL_Imagen;
		this.precio = precio;
	}//constructor con todos los parametros

	//Getters - Setters
	public Long getId() {
		return id;
	}//get id

	public void setId(Long id) {
		this.id = id;
	}//set id

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
	}//toString
}//clase Productos


