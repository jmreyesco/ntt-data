package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", segundoNombre=" + segundoNombre + ", apellido="
				+ apellido + ", segundoApellido=" + segundoApellido + ", telefono=" + telefono + ", direccion="
				+ direccion + ", ciudadResidencia=" + ciudadResidencia + ", email=" + email + ", tipoDocumento="
				+ tipoDocumento + ", numeroDocumento=" + numeroDocumento + ", createAt=" + createAt + "]";
	}

	@Id
	// @GeneratedValue(strategy=GenerationType.IDENTITY)
	@SequenceGenerator(name = "users_seq_gen", sequenceName = "users_id_seq", allocationSize = 5)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq_gen")
	private Long id;

	//Para prueba metodo create 
	//@Column(nullable = false)
	private String nombre;
	private String segundoNombre;

	private String apellido;
	private String segundoApellido;

	private String telefono;
	private String direccion;
	private String ciudadResidencia;

	private String email;
	@NotEmpty
	@Column(nullable = false)
	private String tipoDocumento;
	@NotEmpty
	@Column(nullable = false, unique = true)
	private String numeroDocumento;

	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudadResidencia() {
		return ciudadResidencia;
	}

	public void setCiudadResidencia(String ciudadResidencia) {
		this.ciudadResidencia = ciudadResidencia;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	private static final long serialVersionUID = 1L;
}
