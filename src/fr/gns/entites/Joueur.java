package fr.gns.entites;

public class Joueur {
    
    private int numero ;
    private String nom ;

    public Joueur() {
        super() ;
    }

    public Joueur(int numero, String nom) {
        super() ;
        this.numero = numero;
        this.nom = nom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Joueur{" + "numero=" + numero + ", nom=" + nom + '}';
    }
    
}
