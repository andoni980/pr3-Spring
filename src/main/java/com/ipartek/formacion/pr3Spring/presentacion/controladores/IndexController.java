package com.ipartek.formacion.pr3Spring.presentacion.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ipartek.formacion.pr3Spring.servicios.UsuarioService;

@Controller
@RequestMapping("/")
public class IndexController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public String productos(Model modelo) {
		System.out.println(usuarioService.getAllProductos().toString());
		modelo.addAttribute("productos", usuarioService.getAllProductos());
		return "productos";
	}
	
	@GetMapping("{idProducto}")
	public String detalleProducto(Model modelo, @PathVariable("idProducto") Long idProducto){
		modelo.addAttribute("", usuarioService.getProductoById(idProducto));
		return "detalle-producto";
	}
}
