import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LectorTest {

    @Test
    fun `crear Lector guarda sus campos`() {
        val lector = Lector(
            numSocio = 123,
            nombre = "Ana",
            apellidos = "García López",
            direccion = "Calle Mayor, 10"
        )

        assertEquals(123, lector.numSocio)
        assertEquals("Ana", lector.nombre)
        assertEquals("García López", lector.apellidos)
        assertEquals("Calle Mayor, 10", lector.direccion)
    }

    @Test
    fun `comprobarMultasPendientes devuelve false por defecto`() {
        val lector = Lector(1, "Ana", "García", "Calle Mayor 10")
        assertFalse(lector.comprobarMultasPendientes())
    }
}