package unplugged

class Rol {
	String rol
	
	Usuario usuario
	MateriaEvento evento
	
	static belongsTo = [Usuario, MateriaEvento]
	
    static constraints = {
		rol(nullable: false)
    }
}
