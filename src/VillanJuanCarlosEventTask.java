public class VillanJuanCarlosEventTask {

    private String text;
    private boolean isCompleted;

    /**
     * Cuando creamos el contrucctor por defecto sera falso completada
     * @param text descipcion de la tarea
     * .
     *
     * */
    public VillanJuanCarlosEventTask(String text ) {
        this.text = text;
        this.isCompleted = false;
    }

    public void marcarCompletada(){
        isCompleted = true;
    }

    public String toString(){
        return "Tarea: " + text + " ✏ Completada:  " + (isCompleted ? "SI" : "NO");
    }

    public boolean isCompleted() {
        return isCompleted;
    }
}
