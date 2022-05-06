package com.example.AbrilServiciol.Repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.AbrilServiciol.Model.Productos;

@Repository
public class ProductoRepositorioImpl implements ProductoRepositorio {
	
	public List<Productos> listar = new ArrayList<Productos>();

	@Override
	public void guardarProducto(Productos producto) {
		// TODO Auto-generated method stub
		listar.add(producto);

	}

	@Override
	public void editarProducto(Productos producto) {
		// TODO Auto-generated method stub
		listar.remove(obtenerProductosId(producto.getIdProducto()));
		listar.add(producto);

	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		listar.remove(obtenerProductosId(id));

	}

	@Override
	public List<Productos> listarProductos() {
		// TODO Auto-generated method stub
		return listar;
	}

	@Override
	public Productos obtenerProductosId(Integer id) {
//		if (id != null) {
//			for (Productos productos : listar) {
//				
//				if(productos.getIdProducto() == id)
//				   return productos;
//				else
//				   return null;
//				
//			}
//		}else {
//		return null;
//		
//		}
		
		return listar.stream().filter(producto -> producto.getIdProducto() == id).findFirst().orElse(null);
		
	}

}
