package negocio;

import dao.UsuarioDao;
import entidad.Usuario;

public class UsuarioNegocio implements IUsuarioNegocio {

    private Usuario usuario;
    private UsuarioDao usuarioDao;

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void setUsuarioDao(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }
	
	public boolean agregarUsuario(Usuario usuario)
	{
		usuarioDao = new UsuarioDao();
		boolean existe = usuarioDao.Exist(usuario.getUsuario());
		if(existe == false)
		{
			usuarioDao.Add(usuario);
			return true;
		}
		return false;
	}
	

    public void initUsuarioNegocio() {
    	System.out.println("Comienzo a agregar usuario");
    	
        if (usuario == null) {
            System.out.println("No se encontraron datos en el bean");
            return;
        }
        
        boolean estado = agregarUsuario(usuario);
        if (estado) {
            System.out.println("Se agregó correctamente el usuario");
        } else {
            System.out.println("No se pudo agregar, el usuario ya existe en la BD");
        }
    }
    
    public void destroyUsuarioNegocio() {
    	System.out.println("Fin agregar usuario");
    }
}
