package entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import negocio.UsuarioNegocio;

@Entity
@Table(name="User")
public class Usuario implements Serializable, IUsuario{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="pass")
	private String contrasenia;
	
	//Constructor vacio
	public Usuario()
	{
		
	}


	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "usuario=" + usuario + ", contrasenia=" + contrasenia + "]";
	}
	
	public void initUsuario() {
		System.out.println("Se inicializa bean");
	}
	
	public void destroyUsuario() {
		System.out.println("Se cierra bean");
	}


	public void agregarUsuario(Usuario usuario) {
		
	    UsuarioNegocio usuarioNegocio = new UsuarioNegocio();
	    boolean estado= usuarioNegocio.agregarUsuario(usuario);
	    if(estado)
	    	System.out.println("Se agrego correctamente");
	    else
	    	System.out.println("No se pudo agregar, el usuario ya existe en la BD");
		
	}

}
