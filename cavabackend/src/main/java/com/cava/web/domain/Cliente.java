package com.cava.web.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name = "clientes" )
public class Cliente{
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	private String correo;
	private String nombre;
	private String apellido;
	@Column( name = "tipo_documento" )
	private String tipoDocumento;
	@Column( name = "nrodocumento" )
	private String nroDocumento;
	private String telefono;
	private String password;
	private String rol;
	private String estado;
	@OneToOne
	@JoinColumn( name = "id_carro_compra", foreignKey = @ForeignKey( name = "FK_ID_CARRO_COMPRA" ))
	private CarroCompra carroCompra;
	
	public Cliente() {}

	public Cliente(Long id, String correo, String nombre, String apellido, String tipoDocumento, String nroDocumento,
			String telefono, String password, String rol, String estado, CarroCompra carroCompra) {
		super();
		this.id = id;
		this.correo = correo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.telefono = telefono;
		this.password = password;
		this.rol = rol;
		this.estado = estado;
		this.carroCompra = carroCompra;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public CarroCompra getCarroCompra() {
		return carroCompra;
	}

	public void setCarroCompra(CarroCompra carroCompra) {
		this.carroCompra = carroCompra;
	}
}