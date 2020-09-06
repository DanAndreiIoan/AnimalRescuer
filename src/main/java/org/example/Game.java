package org.example;

public class Game {

    private Adoptor rescuer;
    private Animal animal;
    private MedicalStaff medic;

    public Adoptor getRescuer() {
        return rescuer;
    }

    public void setRescuer(Adoptor rescuer) {
        this.rescuer = rescuer;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public MedicalStaff getMedic() {
        return medic;
    }

    public void setMedic(MedicalStaff medic) {
        this.medic = medic;
    }
}


