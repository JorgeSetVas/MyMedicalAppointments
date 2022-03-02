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
}
