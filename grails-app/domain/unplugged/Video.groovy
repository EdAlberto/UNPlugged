package unplugged

class Video {
	
	Date fechaCreacion
	String lugar
	String titulo
	String direccion
	String ofrecidoPorNombre
	
	Usuario uploader
	Usuario offerer
	
	static belongsTo = [Usuario, Usuario]
	static hasMany = [temas: Tema]
	
    static constraints = {
		fechaCreacion(nullable: false)
		lugar(nullable: false)
		titulo(nullable: false)
		direccion(nullable: false)
		fechaCreacion(nullable: false)
		ofrecidoPorNombre(nullable: false)
    }
}
