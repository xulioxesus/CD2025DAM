data class Libro(
    val nombre: String,
    val tipo: String,
    val editorial: String,
    val anio: Int,
    val autores: MutableList<Autor> = mutableListOf()
)