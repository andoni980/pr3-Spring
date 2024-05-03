package com.ipartek.formacion.pr3Spring.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.formacion.pr3Spring.datos.CategoriaRepository;
import com.ipartek.formacion.pr3Spring.datos.ProductoRepository;
import com.ipartek.formacion.pr3Spring.entidades.Categoria;
import com.ipartek.formacion.pr3Spring.entidades.Producto;

@Service
public class UsuarioServiceImp implements UsuarioService{

	@Autowired
	protected ProductoRepository productoRepository;
	
	@Autowired
	protected CategoriaRepository categoriaRepository;
	
	@Override
	public Iterable<Producto> getAllProductos() {
		return productoRepository.findAll();
	}

	@Override
	public Producto getProductoById(Long id) {
		return productoRepository.findById(id).get();
	}

	@Override
	public Iterable<Categoria> getAllCategorias() {
		return categoriaRepository.findAll();
	}

	@Override
	public Categoria getCategoriaById(Long id) {
		return categoriaRepository.findById(id).get();
	}


}
