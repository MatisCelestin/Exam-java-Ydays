package ExamPratique;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //liste fourmis 
        List<Fourmis> listFourmis = new ArrayList<>();
        listFourmis.add(new Chasseresse(2, 10));
        listFourmis.add(new Nourrice(1, 8));
        listFourmis.add(new Ouvriere(3, 7));

        // foumiliere
        Fourmiliere fourmiliere = new Fourmiliere(listFourmis);

        // Affichage  informations fourmilière
        System.out.println("Informations initiales de la fourmilière :");
        System.out.println(fourmiliere);

        // Action fourmilière
        fourmiliere.action();

        // Affichage informations après action
        System.out.println("\nInformations après action sur la fourmilière :");
        System.out.println(fourmiliere);
    }
}