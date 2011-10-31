package prueba

class Usuario {
String nombre
	String apellido
	Date fechaNacimiento
	String correo
	String telefono

    static constraints = {
		nombre(blank:false)
		apellido(blank:false)
		correo(blank:false, email:true)
		fechaNacimiento()
		telefono(matches:"[0-9]{10}", blank:false)
    }
    
    static mapping = {
        table 'usuarios'
    }
    
    String toString() {
        return nombre
    }
}