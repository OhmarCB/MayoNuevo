package com.example.AbrilServiciol.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.AbrilServiciol.Model.Productos;
import com.example.AbrilServiciol.Servicio.ProductoServicio;

@RestController
@RequestMapping("/producto/v1")
public class ProductoControlador {
	
	@Autowired
	private ProductoServicio servicio;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Productos>> listarProducto(){
		
		return new ResponseEntity<List<Productos>> (servicio.listarProductos(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/guardar" , method = RequestMethod.POST)
	public  ResponseEntity<Void> guardar(@RequestBody Productos producto){
		
		servicio.guardarProducto(producto);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Productos> listarPorId(@PathVariable Integer id) {
		
		Productos p = servicio.obtenerProductoId(id);
		if(p != null)
			return new ResponseEntity<Productos>(p, HttpStatus.OK);
					
		return new ResponseEntity<Productos>(HttpStatus.NOT_FOUND);
		
	}
	
	@RequestMapping(path ="/editar", method = 	RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody Productos producto	) {
		
		Productos p = servicio.obtenerProductoId(producto.getIdProducto());
		if(p != null) {
			servicio.editarProducto(producto);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}			
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}	
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
		
		Productos p = servicio.obtenerProductoId(id);
		if(p != null) {
			servicio.eliminarProducto(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}			
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
	}
	
	
	

}
