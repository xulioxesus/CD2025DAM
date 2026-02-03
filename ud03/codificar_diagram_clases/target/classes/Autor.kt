data class Autor(
    var nombre: String,
    var nacionalidad: String,
    var fechaNacimiento: Int,
    var libros: MutableList<Libro> = mutableListOf()
)