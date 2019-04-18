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

    public Partie( int numero ) {
        super() ;
        this.numero = numero;
    }
    
    public void initialiser(){
        
        Pion unPion ;
        
        int ligne = 2 ;
        int colonne = 1 ;
        
        pions.put( Couleur.JAUNE , new ArrayList<Pion>() ) ;
        pions.put( Couleur.NOIR , new ArrayList<Pion>() ) ;       
       
        for( int numeroPion = 1 ; numeroPion <= Partie.NB_PIONS_COULEUR ; numeroPion++ ){
            
            unPion = new Pion( numeroPion , Couleur.JAUNE ) ;
            pions.get( Couleur.JAUNE ).add( unPion ) ;
            this.plateau.placerPion( unPion , ligne , colonne ) ;
            
            unPion = new Pion( numeroPion , Couleur.NOIR ) ;           
            pions.get( Couleur.NOIR ).add( unPion ) ;
            this.plateau.placerPion( unPion , ligne + 2 , colonne ) ;
            
            colonne += 1 ;
            
            if( colonne > Plateau.NB_COLONNES ){
                ligne = 7 ;
                colonne = 1 ;
            }
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

    public List<Pion> getPions( Couleur couleur ) {
        return pions.get( couleur ) ;
    }
    
    
    public void deplacerPion(  ){
        
    }
    
    

    @Override
    public String toString() {
        return "Partie{" + "numero=" + numero + '}';
    }
    
}
