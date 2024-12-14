import java.util.Scanner;
import java.util.ArrayList;
public class VillanJuanCarlosMain {
    // atributos Globales.
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
    VillanJuanCarlosMain programa = new VillanJuanCarlosMain();
    programa.iniciar();
    }
    /**
     * Metodo principal desde la cual gestionaremos el flujo del programa como los anteriores trabajos
     *
     */
    public void iniciar(){
    bienvenida();
    ejecutarApp();

    }

    public void bienvenida(){
        System.out.println("********************************");
        System.out.println("** Bienvenido a Event Planer ***");
        System.out.println("********************************");
    }


    public static void mostrarMenu(){
        System.out.println("\nBienvenido a Event Planner. Seleccione una opción");
        System.out.println("[1] Añadir evento");
        System.out.println("[2] Borrar evento");
        System.out.println("[3] Listar eventos");
        System.out.println("[4] Marcar/desmarcar tarea de un evento");
        System.out.println("[5] Salir");

    }

    /*
    Creamos el metodo ejecutarApp la cual orquestara nuestra main y conectara con las \
    demas clases siguiendo principios de OOP
     */
    
    public void ejecutarApp(){
        int option;
        do{
            mostrarMenu();
            option = getOption();

            switch (option){

                case 1:
                    addEvent();
                    break;
                case 2:
                    deleteEvent();
                    break;
                case 3:
                    listEvents();
                    break;
                case 4:
                    toggleTaskCompletion();
                    break;
                case 5:
                    System.out.println("Saliendo de la aplicacion");
                    break;
                default:
                    System.out.println("La opcion no es correcta, intenta otra vez ");

            }
        }while(option != 5);
        input.close();
    }
    private static int getOption() {
        System.out.println("Ingresa tu eleccion: ");
        return Integer.parseInt(input.nextLine());

    }

    private static void deleteEvent() {
    }

    private static  void addEvent() {
    }
    private static void listEvents(){

    }

    private static void  toggleTaskCompletion(){

    }



}