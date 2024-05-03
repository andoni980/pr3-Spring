package com.ipartek.formacion.pr3Spring.servicios;

import com.ipartek.formacion.pr3Spring.entidades.Categoria;
import com.ipartek.formacion.pr3Spring.entidades.Producto;

public interface AdminService {

	Producto saveProducto(Producto producto);
	Producto updateProducto(Producto producto);
	void deleteProducto(Long id);
	
	Categoria saveCategoria(Categoria categoria);
	Categoria updateCategoria(Categoria categoria);
	void deleteCategoria(Long id);
}
