import javax.lang.model.element.NestingKind;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * PARTE 1
 * Definiendo la clase VillanJuanCarlosEvent
 * */
public class VillanJuanCarlosEvent {
    private String title;
    private LocalDate date;
    private Priority priority;
    private ArrayList<VillanJuanCarlosEventTask> tasks;

    public enum Priority{
        HIGH, MEDIUM, LOW
    }

    public VillanJuanCarlosEvent(String title, LocalDate date, Priority priority) {
        this.title = title;
        this.date = date;
        this.priority = priority;
        this.tasks = new ArrayList<>();
    }

    public void addTask(VillanJuanCarlosEventTask task){
        tasks.add(task);
    }


    @Override
    public String toString(){
        /* Nuestro metodo String basado en toString/ usamos el @override para evitar errores post.
         * Usamos count para contar las tareas pero este dato se nos da en long por lo cual lo convertimos a int (int)
         * Usamos tanks.String propiedad que nos permite usar filter.
         * Posteriormente formateamos con los metodos de la clase String.format. %s y %d
         * Finalmente usamos la variables asociadas con junto la
         * */
        int tareascompletadas = (int) tasks.stream().filter(VillanJuanCarlosEventTask::isCompleted).count();
        return String.format(
             "Titulo: %s | Fecha: %s | Prioridad: %s | Tareas: %d%d completadas",
             title,date,priority,tareascompletadas, tasks.size()
        );

    }

    // estos serian los GETTERS
    public ArrayList<VillanJuanCarlosEventTask> getTasks(){
        return tasks;
    }

    public String getTitle(){
        return title;
    }







}
