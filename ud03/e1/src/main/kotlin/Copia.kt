class Copia(
    var identificador: Int,
    var estado: String,
    var libro: Libro
) {

    fun prestar() {
        estado = "prestada"
    }

    fun devolver() {
        estado = "disponible"
    }
}