class Multa(
    val prestamo: Prestamo,
    val fechaInicio: Int,
    var fechaFin: Int
) {

    fun calcularFechaFin() {
        // Ejemplo: la multa dura 7 días
        fechaFin = fechaInicio + 7
    }
}