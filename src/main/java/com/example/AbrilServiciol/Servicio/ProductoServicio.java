package com.example.AbrilServiciol.Servicio;

import java.util.List;

import com.example.AbrilServiciol.Model.Productos;

public interface ProductoServicio {
	public void guardarProducto(Productos producto);
	public void editarProducto(Productos producto);
	public void eliminarProducto(Integer id);
	public List<Productos> listarProductos();
	public Productos obtenerProductoId(Integer id);

}
