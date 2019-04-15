package fr.gns.entites;

public class Pion {
    
    private int numero ;
    
    private Couleur couleur ;
    private Case position ;

    public Pion() {
        super() ;
    }

    public Pion(int numero, Couleur couleur) {
        this.numero = numero;
        this.couleur = couleur;
    }

    public Pion(int numero , Couleur couleur , Case position ) {
        this.numero = numero ;
        this.couleur = couleur ;
        this.position = position ;
        //this.position.setPion( this ) ;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public Case getPosition() {
        return position;
    }

    public void setPosition( Case position ) {
        this.position = position ;
    }
    
    public void poser( Case position ){
        this.position = position ;
        //this.position.setPion( this ) ;
    }
    
    @Override
    public String toString() {
        return "Pion{" + "numero=" + numero + ", couleur=" + couleur + ", position=" + position + '}';
    }
    
}
