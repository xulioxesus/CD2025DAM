import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LibroTest {

    @Test
    fun `crear Libro guarda sus campos`() {
        val libro = Libro(
            nombre = "1984",
            tipo = "Novela",
            editorial = "Debolsillo",
            anio = 1949
        )
        assertEquals("1984", libro.nombre)
        assertEquals("Novela", libro.tipo)
        assertEquals("Debolsillo", libro.editorial)
        assertEquals(1949, libro.anio)
        assertTrue(libro.autores.isEmpty())
    }

    @Test
    fun `Libro puede tener varios autores`() {
        val libro = Libro("Libro colectivo", "Ensayo", "Editorial X", 2020)

        // OJO: para evitar ciclos (Libro <-> Autor) no añadimos el libro a autor.libros en este test
        val autor1 = Autor("Autor Uno", "Española", 1970)
        val autor2 = Autor("Autor Dos", "Argentina", 1965)

        libro.autores.add(autor1)
        libro.autores.add(autor2)

        assertEquals(2, libro.autores.size)
        assertSame(autor1, libro.autores[0])
        assertSame(autor2, libro.autores[1])
    }
}