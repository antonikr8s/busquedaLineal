package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodosBusquedaBinaria {

    private Persona[] people;
    private ShowConsole pantalla;

    public MetodosBusquedaBinaria(Persona[] personas) {
        this.pantalla = new ShowConsole();
        this.people = personas;
        pantalla.showMessage("=======Metodos de Busqueda Binaria=======");
    }

    public int findPersonByCode(int code) {
        // →Metodo para implementar busqueda binaria
        int bajo = 0;
        int alto = people.length - 1;
        while(bajo<=alto){
            int central = bajo + (alto-bajo)/2;
            //int central =(bajo+alto)/2;

            if(people[central].getCode()==code){//si es igual
                return central;
            }
            if(people[central].getCode()<code){
                bajo=central+1;
            }else{
                alto=central-1;
            }
        }
        return -1;
    }
    public void showPersonByCode(){
        int codetoFind = pantalla.getCode();
        int indexPersona = findPersonByCode(codetoFind);
        if(indexPersona == -1){
            pantalla.showMessage("No hay una persona con ese codigo");
        }else{
            pantalla.showMessage("Persona con codigo " + codetoFind + " encontrada");
            pantalla.showMessage(people[indexPersona].toString());
        }
    }
    private int findPersonaByName(String name){
       //orddenamiento burbuja
        return -1;
    }
    private void showPersonByName(){
        
    }
}

