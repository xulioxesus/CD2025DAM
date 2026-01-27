import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PrestamoTest {

    private fun libroBase(): Libro =
        Libro("1984", "Novela", "Debolsillo", 1949)

    private fun copiaBase(): Copia =
        Copia(100, "disponible", libroBase())

    private fun lectorBase(): Lector =
        Lector(1, "Ana", "García", "Calle Mayor 10")

    @Test
    fun `crear Prestamo necesita Copia y Lector`() {
        val copia = copiaBase()
        val lector = lectorBase()

        val prestamo = Prestamo(
            fechaInicio = 1,
            fechaFin = 0,
            copia = copia,
            lector = lector
        )

        assertEquals(1, prestamo.fechaInicio)
        assertEquals(0, prestamo.fechaFin)
        assertSame(copia, prestamo.copia)
        assertSame(lector, prestamo.lector)
    }

    @Test
    fun `calcularFechaFin suma 15 dias`() {
        val prestamo = Prestamo(
            fechaInicio = 10,
            fechaFin = 0,
            copia = copiaBase(),
            lector = lectorBase()
        )

        prestamo.calcularFechaFin()
        assertEquals(25, prestamo.fechaFin)
    }

    @Test
    fun `generarMulta devuelve false por defecto`() {
        val prestamo = Prestamo(
            fechaInicio = 10,
            fechaFin = 0,
            copia = copiaBase(),
            lector = lectorBase()
        )

        assertFalse(prestamo.generarMulta())
    }
}