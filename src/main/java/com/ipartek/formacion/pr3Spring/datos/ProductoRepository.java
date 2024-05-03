package com.ipartek.formacion.pr3Spring.datos;

import org.springframework.data.repository.CrudRepository;

import com.ipartek.formacion.pr3Spring.entidades.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long> {

}
