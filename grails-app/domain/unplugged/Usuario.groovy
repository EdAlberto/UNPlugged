package unplugged

class Usuario {
	
	String nombre
	String userName
	String password
	
	static hasMany = [videos: Video]
	
    static constraints = {
		nombre(nullable: false)
		userName(nullable: false, unique: true)
		password(nullable: false)
    }
}
