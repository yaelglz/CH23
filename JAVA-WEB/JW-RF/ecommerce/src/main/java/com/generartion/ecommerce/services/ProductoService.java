package com.generartion.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generartion.ecommerce.model.Producto;
import com.generartion.ecommerce.repositories.ProductoRepository;

@Service
public class ProductoService {

	// Creo el objeto de la clase ProductoRepository
	private final ProductoRepository productoRepository;

	// Cablear con el autowired
	@Autowired
	// Uso ese objeto como parametro de mi constructor
	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}

	// Create(Metodo para agregar un objeto del tipo Producto y guardarlo en la base
	// de datos)
	/*public void crearProducto() {

	}*/

	// Read (Leer una lista de productos)
	public List<Producto> leerProductos() {
		return productoRepository.findAll();
	}// toda la lista de productos

	// Read (leer un producto con un id especifico)
	public Producto getProducto(Long prodId) {
		return productoRepository.findById(prodId)
				.orElseThrow(() -> new IllegalStateException("El Producto " + "con el id " + prodId + " no existe."));
	}// getProducto

	// Update
	/*public void actualizarProducto() {

	}

	// Delete
	public void borrarProducto() {

	}*/
}
