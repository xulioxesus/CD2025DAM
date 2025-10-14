import calculadora.VistaCalculadora
import kotlin.test.*

class VistaCalculadoraTest {

    private val vista = VistaCalculadora()

    @Test
    fun testMostrarMensaxe() {
        // Non lanza excepcións
        vista.mostrarMensaxe("Proba de mensaxe")
    }

    @Test
    fun testMostrarResultado() {
        // Só verificamos que non falle
        vista.mostrarResultado(42.0)
    }

    @Test
    fun testMostrarErro() {
        vista.mostrarErro("Erro de proba")
    }
}