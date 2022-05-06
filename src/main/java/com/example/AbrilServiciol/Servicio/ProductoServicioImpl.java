package com.example.AbrilServiciol.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.AbrilServiciol.Model.Productos;
import com.example.AbrilServiciol.Repositorio.ProductoRepositorio;

@Repository
public class ProductoServicioImpl implements ProductoServicio {
	
	@Autowired
	public ProductoRepositorio repositorio;

	@Override
	public void guardarProducto(Productos producto) {
		// TODO Auto-generated method stub
		repositorio.guardarProducto(producto);

	}

	@Override
	public void editarProducto(Productos producto) {
		// TODO Auto-generated method stub
		repositorio.editarProducto(producto);

	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		repositorio.eliminarProducto(id);

	}

	@Override
	public List<Productos> listarProductos() {
		// TODO Auto-generated method stub
		return repositorio.listarProductos();
	}

	@Override
	public Productos obtenerProductoId(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.obtenerProductosId(id);
	}

}
