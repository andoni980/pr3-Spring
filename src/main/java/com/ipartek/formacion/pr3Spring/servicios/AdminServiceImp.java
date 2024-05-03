package com.ipartek.formacion.pr3Spring.servicios;

import com.ipartek.formacion.pr3Spring.entidades.Categoria;
import com.ipartek.formacion.pr3Spring.entidades.Producto;

public class AdminServiceImp extends UsuarioServiceImp implements AdminService{

	@Override
	public Producto saveProducto(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	public Producto updateProducto(Producto producto) {
		producto.setId(null);
		return productoRepository.save(producto);
	}

	@Override
	public void deleteProducto(Long id) {
		productoRepository.deleteById(id);
	}

	@Override
	public Categoria saveCategoria(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}

	@Override
	public Categoria updateCategoria(Categoria categoria) {
		categoria.setId(null);
		return categoriaRepository.save(categoria);
	}

	@Override
	public void deleteCategoria(Long id) {
		categoriaRepository.deleteById(id);
	}

}
