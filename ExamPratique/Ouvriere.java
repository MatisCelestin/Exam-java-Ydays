package ExamPratique;

import java.util.Random;

public class Ouvriere extends Fourmis {
    public Ouvriere(int age, int force) {
        super(age, force);
    }

    @Override
    public double deplacement(String environnement) {
        if (environnement.equals("sable")) {
            return 2.0;
        } else {
            return 1.0;
        }
    }

    @Override
    public String toString() {
        return "Ouvrière de " + this.age + " jours et de force " + this.force;
    }

    @Override
    public void nurse() {

    }

    public void agrandissement(Fourmiliere fourmiliere) {
        Random random = new Random();
        double chance = 0.1 / (double) this.age * 100.0; // chance de construire une nouvelle salle
        if (random.nextDouble() < chance) { // si on a de la chance
            fourmiliere.setNbSalles(fourmiliere.getNbSalles() + 1); // on construit une nouvelle salle
        }
    }
    @Override
    public String getRole() {
        return "Ouvriere";
    }

    @Override
    public void chasser() {

    }

    @Override
    public void agrandissement() {

    }

    @Override
    public String getMessage() {
        return null;
    }
}

