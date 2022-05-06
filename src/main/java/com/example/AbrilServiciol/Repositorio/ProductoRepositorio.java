package com.example.AbrilServiciol.Repositorio;

import java.util.List;

import com.example.AbrilServiciol.Model.Productos;

public interface ProductoRepositorio {
	
		public void guardarProducto(Productos producto);
		public void editarProducto(Productos producto);
		public void eliminarProducto(Integer id);
		public List<Productos> listarProductos();
		public Productos obtenerProductosId(Integer id);
		

}
