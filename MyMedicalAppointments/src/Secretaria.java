public class Secretaria {
    Patient pacientes;
    Doctor  doctor;

    Secretaria(Patient pacientes, Doctor doctor){
        this.pacientes = pacientes;
        this.doctor = doctor;
    }

    public Patient getPacientes() {
        return pacientes;
    }

    public void setPacientes(Patient pacientes) {
        this.pacientes = pacientes;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}