package com.ipartek.formacion.pr3Spring.servicios;

import com.ipartek.formacion.pr3Spring.entidades.Categoria;
import com.ipartek.formacion.pr3Spring.entidades.Producto;

public interface UsuarioService {

	Iterable<Producto> getAllProductos();
	Producto getProductoById(Long id);
	
	Iterable<Categoria> getAllCategorias();
	Categoria getCategoriaById(Long id);
}
