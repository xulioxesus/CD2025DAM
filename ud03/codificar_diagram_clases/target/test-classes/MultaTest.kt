import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MultaTest {

    private fun prestamoBase(): Prestamo {
        val libro = Libro("1984", "Novela", "Debolsillo", 1949)
        val copia = Copia(100, "prestada", libro)
        val lector = Lector(1, "Ana", "García", "Calle Mayor 10")
        return Prestamo(fechaInicio = 1, fechaFin = 0, copia = copia, lector = lector)
    }

    @Test
    fun `crear Multa guarda prestamo y fechas`() {
        val prestamo = prestamoBase()
        val multa = Multa(prestamo = prestamo, fechaInicio = 30, fechaFin = 0)

        assertSame(prestamo, multa.prestamo)
        assertEquals(30, multa.fechaInicio)
        assertEquals(0, multa.fechaFin)
    }

    @Test
    fun `calcularFechaFin suma 7 dias`() {
        val multa = Multa(prestamo = prestamoBase(), fechaInicio = 30, fechaFin = 0)
        multa.calcularFechaFin()
        assertEquals(37, multa.fechaFin)
    }
}