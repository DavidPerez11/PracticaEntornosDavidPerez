package agendacontactos;

/**
 * Clase base para los contactos que se guardarán en una agenda telefónica
 * @author Carlos Herrero
 * @version 1.0
 *
 */
public class Contacto {
	
	//propiedades
	private String nombre;
	private String apellidos;
	private String telefono;
	
	//patromes para validar expresiones regulares
	
	final String PATRON_NOMBRE="^[A-Z][\\p{IsLatin}\\s\\-&]{1,49}$";
	final String PATRON_APE="^[A-Z][\\p{IsLatin}\\s\\-&]{1,99}$";
	final String PATRON_TELE="^([679]\\d{8})|(\\+\\d[\\d\\-]{19})$";
	
	//constructor
	public Contacto (String nom, String ape,  String tele){
		if (!nom.matches(PATRON_NOMBRE)) {
			throw new IllegalArgumentException("El nombre no cumple el patrón esperado");
		}
		
		if (!ape.matches(PATRON_APE)) {
			throw new IllegalArgumentException("El apellido no cumple el patrón esperado");
		}
		
		if (!tele.matches(PATRON_TELE)) {
			throw new IllegalArgumentException("El teléfono no cumple el patrón esperado");
		}
		
		this.nombre = nom;
		this.apellidos = ape;
		this.telefono = tele;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}


	public String getTelefono() {
		return telefono;
	}
	
	
}
