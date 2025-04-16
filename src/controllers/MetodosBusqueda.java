package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodosBusqueda {
    private ShowConsole showConsole;
    private Persona[] people;

    public MetodosBusqueda(Persona[] persons) {
        showConsole = new ShowConsole();
        this.people = persons;
        showPersonByCode();
    }

    public int busquedaLineal(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i;
            }
        }
        return -1;
    }

    public int findPersonaByCode(int code) {

        for (int i = 0; i < people.length; i++) {
            if (people[i].getCode() == code) {
                return i;
            }
        }
        return -1;
        // Retorna la posicion del valor buscado
        /*
         * for (Persona persona : people) {
         * int cont=0;
         * if(){
         * return cont;
         * }
         * cont++;
         * }
         * return -1;
         */
    }

    public void showPersonByCode() {
        int codetoFind = showConsole.getCode();
        int indexPersona = findPersonaByCode(codetoFind);
        if (indexPersona >= 0) {
            showConsole.showMessage("Persona encontrada");
            //showConsole.showMessage(people[indexPersona].toString());
            //→Podemos usar ek showConsole o sout para imprimir el indexPersona
            System.out.println(people[indexPersona]);
        } else {
            showConsole.showMessage("Persona con codigo" + codetoFind + "no encontrada");
        }
    }
}
