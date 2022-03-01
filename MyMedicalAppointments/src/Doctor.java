public class Doctor {

    //Atributos
    private static int id = 0; //Autoincrement
    private String name;
    private String speciality;

    Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
    }

    Doctor(String name, String speciality){
        this.name = name;
        this.speciality = speciality;
        System.out.println("El nombre del Doctor asignado es: "+name);
        id++;
    }

    //Comportamientos
    public void showName(){

        System.out.println("Name: " + name);
    }

    //Muestra el id del doctor
    public void showId(){

        System.out.println("ID Doctor: " + id);
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Doctor.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

}