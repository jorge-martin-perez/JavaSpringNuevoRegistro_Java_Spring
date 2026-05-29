package es.accenture.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.accenture.entidades.Usuario;

/**
 * Clase Controlador. 
 * La clase que maneja las peticiones HTTP.
 * 
 * @author jorge martin perez moreno
 * @version 1.0
 *
 */
@Controller
@RequestMapping("/usuarios") // prefijo comun para todas las URLs
public class ControladorGestionUsuarios {

	/**
	 * Este metodo muestra el formulario de registro.
	 * 
	 * @param modelo
	 * @return "NuevoRegistro.jsp" la vista a mostrar
	 */
	@GetMapping("/nuevo")
	public String nuevoUsuario(Model modelo) {

//		objeto vacío para el data binding del formulario
		modelo.addAttribute("usuario", new Usuario());

		return "NuevoRegistro";
	}

	/**
	 * Este metodo procesa el login.
	 * 
	 * @param user
	 * @param modelo
	 * @return "Bienvenida.jsp" la vista a mostrar
	 */
	@PostMapping("/login")
	public String login(@RequestParam("usuario") String user, Model modelo) {

//		Pasamos el user a la vista para mostrarlo
		modelo.addAttribute("user", user);

		return "Bienvenida";
	}

	/**
	 * Este metodo recibe datos del formulario y guarda.
	 * 
	 * @param usuario
	 * @param modelo
	 * @return
	 */
	@PostMapping("/guardar")
	public String guardarUsuario(@ModelAttribute("usuario") Usuario usuario, Model modelo) {

//		Usuario ya tiene todos los datos del formulario
		modelo.addAttribute("usuario", usuario);

		return "ConfirmarDatos";
	}

}
