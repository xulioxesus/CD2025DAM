import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CopiaTest {

    private fun libroBase(): Libro =
        Libro("1984", "Novela", "Debolsillo", 1949)

    @Test
    fun `crear Copia guarda identificador estado y libro`() {
        val libro = libroBase()
        val copia = Copia(identificador = 1, estado = "disponible", libro = libro)

        assertEquals(1, copia.identificador)
        assertEquals("disponible", copia.estado)
        assertSame(libro, copia.libro)
    }

    @Test
    fun `prestar cambia estado a prestada`() {
        val copia = Copia(1, "disponible", libroBase())
        copia.prestar()
        assertEquals("prestada", copia.estado)
    }

    @Test
    fun `devolver cambia estado a disponible`() {
        val copia = Copia(1, "prestada", libroBase())
        copia.devolver()
        assertEquals("disponible", copia.estado)
    }
}