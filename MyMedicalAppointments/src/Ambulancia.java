public class Ambulancia {

    Doctor doctor;
    Patient patient;
    Enfermera enfermera;

    Ambulancia(Doctor doctor, Patient patient, Enfermera enfermera){
        this.doctor = doctor;
        this.patient = patient;
        this.enfermera = enfermera;

    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Enfermera getEnfermera() {
        return enfermera;
    }

    public void setEnfermera(Enfermera enfermera) {
        this.enfermera = enfermera;
    }
}
