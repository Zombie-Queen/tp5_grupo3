package principal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entidad.Usuario;
import negocio.UsuarioNegocio;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("resources/Beans.xml");
		UsuarioNegocio p1 = (UsuarioNegocio)appContext.getBean("UsuarioNegocio");

		((ConfigurableApplicationContext)(appContext)).close();
	}	
}
