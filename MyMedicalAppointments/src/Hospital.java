public class Hospital {

    Patient pacientes;
    Doctor  doctor;
    Enfermera enfermera;
    Secretaria secretaria;
    Consultorio consultorio;

    Hospital(Patient pacientes, Doctor doctor, Enfermera enfermera, Secretaria secretaria, Consultorio consultorio){
        this.pacientes = pacientes;
        this.doctor = doctor;
        this.enfermera = enfermera;
        this.secretaria = secretaria;
        this.consultorio = consultorio;
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

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
}