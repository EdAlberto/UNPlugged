package unplugged

class Comentario {
	
	Date fecha
	String contenido
	
	Usuario usuario
	Video video
	
	static belongsTo = [Video, Usuario]
	
    static constraints = {
		fecha(nullable: false)
		contenido(nullable: false)
    }
}
