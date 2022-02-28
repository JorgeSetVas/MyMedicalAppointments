import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor();
        myDoctor.name = "Luis Curán";
        myDoctor.showName();
        myDoctor.showId();

        Doctor myDocotrAnn = new Doctor();
        myDoctor.showId();

        showMenu();

    }
}