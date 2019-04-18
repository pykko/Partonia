package fr.gns.entites;

import java.util.List;

public class Plateau {
    
    public static int NB_LIGNES = 10 ;
    public static int NB_COLONNES = 10 ;
    
    private Case [][] cases = new Case[ NB_LIGNES ][NB_COLONNES] ;

    public Plateau() {
        super() ;
        initialiser() ;
    }

    public Case[][] getCases() {
        return cases;
    }
    
    public Case getCase( int ligne , int colonne ){
        int i = ligne - 1 ;
        int j = colonne - 1 ;
        
        return this.cases[ i ][ j ] ;
    }
    
    private void initialiser(){
        
        for( int i = 0 ; i < NB_LIGNES ; i++ ){
            for( int j = 0 ; j < NB_COLONNES ; j++  ){
                cases[ i ][ j ] = new Case( i + 1 , j + 1 ) ;
            }
        }
    }
    
    
    public void placerPion( Pion pion , int ligne , int colonne ){
        int i = ligne - 1 ;
        int j = colonne - 1 ;
        
        Case caseCible = this.cases[ i ][ j ] ;
        caseCible.setPion( pion ) ;
        pion.setPosition( caseCible ) ;
    }
    
    public void placerPion( Pion pion , Case caseCible ){
        caseCible.setPion( pion ) ;
        pion.setPosition( caseCible ) ;
    }
    
    public boolean deplacerPion( Pion pion , int ligne , int colonne ){
        int i = ligne - 1 ;
        int j = colonne - 1 ;
        
        Case caseCible = this.cases[ i ][ j ] ;
        
        if( caseCible.estLibre() ){
            pion.getPosition().setPion( null ) ;
            caseCible.setPion( pion ) ;
            pion.setPosition( caseCible ) ;
        }
        
        return false ;
    }
    
    public boolean deplacerPion( Pion pion , Case caseCible ){
        
        if( caseCible.estLibre() ){
            pion.getPosition().setPion( null ) ;
            caseCible.setPion( pion ) ;
            pion.setPosition( caseCible ) ;
        }
        
        return false ;
    }    
    
    public Case getVoisine( Case uneCase , Direction direction ){
        
        int i = uneCase.getLigne() - 1 ;
        int j = uneCase.getColonne() - 1 ;
        
        if( direction == Direction.NORD && uneCase.getLigne() > 1 ){
            return cases[ i - 1 ][ j ] ;
        }
        else if( direction == Direction.SUD && uneCase.getLigne() < NB_LIGNES ){
            return cases[ i + 1 ][ j ] ;
        }
        else if( direction == Direction.OUEST && uneCase.getColonne() > 1 ){
            return cases[ i ][ j - 1 ] ;
        }
        else if( direction == Direction.EST && uneCase.getColonne() < NB_COLONNES ){
            return cases[ i ][ j + 1 ] ;
        }
        
        return null ; 
    }
    
}
