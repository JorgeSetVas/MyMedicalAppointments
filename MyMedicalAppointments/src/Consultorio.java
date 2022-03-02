public class Consultorio {

    Patient pacientes;
    Doctor  doctor;
    Enfermera enfermera;
    Secretaria secretaria;

    Consultorio(Patient pacientes, Doctor doctor, Enfermera enfermera, Secretaria secretaria){
        this.pacientes = pacientes;
        this.doctor = doctor;
        this.enfermera = enfermera;
        this.secretaria = secretaria;
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

    public Enfermera getEnfermera() {
        return enfermera;
    }

    public void setEnfermera(Enfermera enfermera) {
        this.enfermera = enfermera;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }
}
