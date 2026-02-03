class Prestamo(
    val fechaInicio: Int,
    var fechaFin: Int,
    val copia: Copia,
    val lector: Lector
) {

    fun calcularFechaFin() {
        // Ejemplo simple: préstamo de 15 días
        fechaFin = fechaInicio + 15
    }

    fun generarMulta(): Boolean {
        // Lógica pendiente de implementar
        return false
    }
}
