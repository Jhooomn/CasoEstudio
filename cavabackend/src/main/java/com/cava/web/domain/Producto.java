package com.cava.web.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name = "productos" )
public class Producto {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	private String nombre;
	private Integer cantidad;
	private Double precio;
	private String codigo;
	private Date created;
	@Temporal( TemporalType.DATE )
	private Date fechaVencimiento;
	@OneToOne
	@JoinColumn( name = "id_categoria", foreignKey = @ForeignKey(name = "FK_ID_CATEGORIA") )
	//@JsonManagedReference
	private CategoriaProducto categoria;
	@ManyToOne
	@JoinColumn( name = "id_vendedor", foreignKey = @ForeignKey( name = "FK_ID_VENDEDOR" ) )
	//@JsonManagedReference
	private Vendedor vendedor;
	@OneToMany( mappedBy = "producto", fetch = FetchType.LAZY )
	private List<CarroCompraItem> carroCompraItem;
	private String descripcion;
	private String foto;
	
	public Producto() {}
	
	public Producto(Long id, String nombre, Integer cantidad, Double precio, String codigo, Date created,
			Date fechaVencimiento, CategoriaProducto categoria, Vendedor vendedor,
			List<CarroCompraItem> carroCompraItem, String descripcion, String foto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.codigo = codigo;
		this.created = created;
		this.fechaVencimiento = fechaVencimiento;
		this.categoria = categoria;
		this.vendedor = vendedor;
		this.carroCompraItem = carroCompraItem;
		this.descripcion = descripcion;
		this.foto = foto;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public CategoriaProducto getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaProducto categoria) {
		this.categoria = categoria;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public List<CarroCompraItem> getCarroCompraItem() {
		return carroCompraItem;
	}
	public void setCarroCompraItem(List<CarroCompraItem> carroCompraItem) {
		this.carroCompraItem = carroCompraItem;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
}