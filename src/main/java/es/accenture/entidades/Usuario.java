package es.accenture.entidades;

/**
 * Clase entidad que nos permitira crear objetos de usuarios.
 * 
 * @author jorge martin perez moreno
 * @version 1.0
 */
public class Usuario {

//	Declarar atributos de la clase.
	private String nombre;
	private String apellido;
	private String user;
	private String password;
	private String email;
	private String direccion;
	private String telefono;

//	Constructor vacio.
	public Usuario() {

	}

//	──────────────────────── Metodos Getter y Setter ─────────────────────────
//	Metodos publicos para acceder y modificar los atributos privados.

	/**
	 * Metodo que devuelve el nombre.
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo para dar un valor o modificar el nombre.
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo que devuelve el apellido.
	 * 
	 * @return apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Metodo para dar un valor o modificar el apellido.
	 * 
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Metodo que devuelve el usuario.
	 * 
	 * @return user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * Metodo para dar un valor o modificar el usuario.
	 * 
	 * @param user
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * Metodo que devuelve el password.
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Metodo para dar un valor o modificar password.
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Metodo que devuelve el email.
	 * 
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Metodo para dar un valor o modificar email.
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Metodo que devuelve la direccion.
	 * 
	 * @return direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Metodo para dar un valor o modificar direccion.
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Metodo que devuelve el telefono.
	 * 
	 * @return telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Metodo para dar un valor o modificar telefono.
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
