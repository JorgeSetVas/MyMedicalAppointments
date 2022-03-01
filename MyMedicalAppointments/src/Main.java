import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();
        Doctor myDoctor = new Doctor("Carla Quino", "Pediatra");

        Patient patient = new Patient("Alejandra", "alejandra@holamail.com");

        System.out.println(myDoctor.getName());
        System.out.println(myDoctor.getSpeciality());

        System.out.println(patient.getName());
        System.out.println(patient.getEmail());

    }
}