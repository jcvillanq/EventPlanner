import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;



public class VillanJuanCarlosMain {
    // atributos Globales.
    static Scanner input = new Scanner(System.in);
    private static ArrayList<VillanJuanCarlosEvent> events = new ArrayList<>();

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
    Creamos el metodo ejecutarApp la cual orquestara toda la aplicacion.
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
                    markUnmarkTaskCompletion();
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


// add event
    private static  void addEvent() {
        System.out.println("Ingrese el título del evento:");
        String title = input.nextLine();

        System.out.println("Ingrese el año del evento:");
        int year = input.nextInt();

        System.out.println("Ingrese el mes del evento:");
        int month = input.nextInt();

        System.out.println("Ingrese el día del evento:");
        int day = input.nextInt();
        input.nextLine();

        LocalDate date = LocalDate.of(year, month, day);

        System.out.println("Ingrese la prioridad del evento (HIGH, MEDIUM, LOW):");
        VillanJuanCarlosEvent.Priority priority = VillanJuanCarlosEvent.Priority.valueOf(input.nextLine().toUpperCase());

        VillanJuanCarlosEvent event = new VillanJuanCarlosEvent(title, date, priority);

        System.out.println("¿Desea añadir tareas al evento? (sí/no)");
        String addTasks = input.nextLine().toLowerCase();
        while (addTasks.equals("sí")) {
            System.out.println("Ingrese la descripcion de la tarea:");
            String taskDescription = input.nextLine();
            event.addTask(new VillanJuanCarlosEventTask(taskDescription));
            System.out.println("¿Desea añadir otra tarea? (sí/no)");
            addTasks = input.nextLine().toLowerCase();
        }
        events.add(event);
        System.out.println("Evento añadido con exito.");
    }

    private static void deleteEvent() {
        System.out.println("Ingrese el título del evento a borrar:");
        String title = input.nextLine();

        boolean removed = events.removeIf(event -> event.getTitle().equals(title));

        if (removed) {
            System.out.println("Evento eliminado.");
        } else {
            System.out.println("No se encontro un evento con ese titulo.");
        }
    }

    private static void listEvents(){
        if (events.isEmpty()) {
            System.out.println("No hay eventos registrados.");
        } else {
            events.forEach(System.out::println);
        }
    }
    // esta parte ya no la puede hacer me parecio muy complicada
    private static void  markUnmarkTaskCompletion(){


        System.out.print("Aplicacion en contruccion/// disculpe las molestias. ");

    }

}