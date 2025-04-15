import controllers.MetodosBusqueda;
import views.ShowConsole;
import models.Persona;

public class App {
    public static void main(String[] args) {

        ShowConsole consola = new ShowConsole();

        Persona[] personas = new Persona[7];
        personas[0] = new Persona(101, "Juan");
        personas[1] = new Persona(102, "Maria");
        personas[2] = new Persona(103, "Carlos");
        personas[3] = new Persona(104, "Ana");
        personas[4] = new Persona(105, "Luis");
        personas[5] = new Persona(106, "Sofia");
        personas[6] = new Persona(107, "Pedro");

        MetodosBusqueda mB = new MetodosBusqueda(personas);

        /*int[] numeros = { 2, 5, 7, 3, 9, 4 };

        int valorBuscado = 4;
        consola.showMessage("Buscando el numero " + valorBuscado + "...");

        int resultado = mB.busquedaLineal(numeros, valorBuscado);

        if (resultado != -1) {
            consola.showMessage("Numero encontrado en la posicion: " + resultado);
        } else {
            consola.showMessage("El numero no fue encontrado.");
        }*/
    }
}
