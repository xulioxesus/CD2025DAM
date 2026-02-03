import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AutorTest {

    @Test
    fun `crear Autor guarda sus campos`() {
        val autor = Autor(nombre = "Autor Uno", nacionalidad = "Española", fechaNacimiento = 1970)
        assertEquals("Autor Uno", autor.nombre)
        assertEquals("Española", autor.nacionalidad)
        assertEquals(1970, autor.fechaNacimiento)
        assertTrue(autor.libros.isEmpty())
    }

    @Test
    fun `Autor puede tener varios libros`() {
        val autor = Autor("Autor Uno", "Española", 1970)

        // OJO: para evitar ciclos (Autor <-> Libro) no añadimos el autor a libro.autores en este test
        val libro1 = Libro("Libro 1", "Novela", "Editorial X", 2000)
        val libro2 = Libro("Libro 2", "Ensayo", "Editorial Y", 2010)

        autor.libros.add(libro1)
        autor.libros.add(libro2)

        assertEquals(2, autor.libros.size)
        assertSame(libro1, autor.libros[0])
        assertSame(libro2, autor.libros[1])
    }
}