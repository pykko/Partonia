package fr.gns.entites;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Partie {
    
    public static int NB_PIONS_COULEUR = 20 ;
    
    private int numero ;
    private Plateau plateau = new Plateau() ;
    private Map<Couleur,List<Pion>> pions = new HashMap<Couleur,List<Pion>>() ;

    public Partie(int numero) {
        super() ;
        this.numero = numero;
    }
    
    public void initialiser(){
        pions.put( Couleur.JAUNE , new ArrayList<Pion>() ) ;
        pions.put( Couleur.NOIR , new ArrayList<Pion>() ) ;       
       
        for( int numeroPion = 1 ; numeroPion <= Partie.NB_PIONS_COULEUR ; numeroPion++ ){
            pions.get( Couleur.JAUNE ).add( new Pion( numeroPion , Couleur.JAUNE ) ) ;
            pions.get( Couleur.NOIR ).add( new Pion( numeroPion , Couleur.NOIR ) ) ;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    @Override
    public String toString() {
        return "Partie{" + "numero=" + numero + '}';
    }
    
}
