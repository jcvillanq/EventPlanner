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
    private ArrayList<VillanJuanCarlosEventTask> task;

    public enum Priority{
        HIGH, MEDIUM, LOW
    }

    public VillanJuanCarlosEvent(String title, LocalDate date, Priority priority) {
        this.title = title;
        this.date = date;
        this.priority = priority;
        this.task = new ArrayList<>();
    }

    public void addTask(VillanJuanCarlosEventTask task){
        task.add(task);
    }



}
