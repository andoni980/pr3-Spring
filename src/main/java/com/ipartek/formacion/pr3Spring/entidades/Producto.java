package com.ipartek.formacion.pr3Spring.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "productos")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message="El campo nombre no puede estar vacio")
	@NotBlank
	@Size(min=3, max=120, message="Tiene que tener al menos 3 caracteres")
	@Column(name = "nombre")
	private String nombre;
	
	@Lob
	@NotNull(message = "El campo descripción no puede estar vacio")
	@NotBlank
	@Builder.Default
	@Column(name = "descripcion")
	private String descripcion = "No contiene descripción";
	
	@NotNull(message="El campo fecha de caducidad no puede estar vacio")
	@Future(message="La fecha de caducidad debe ser futura")
	@Column(name = "fecha_caducidad")
	private LocalDate fechaCaducidad;
	
	@NotNull(message="El campo precio no puede estar vacio")
	@Min(0)
	@Column(name = "precio")
	private BigDecimal precio;
	
	@NotNull(message = "El campo descuento no puede estar vacio")
	@Min(0)
	@Column(name = "descuento")
	@Builder.Default
	private Integer descuento = 0;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;
	
	
}
