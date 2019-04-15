package fr.gns.entites;

public class Plateau {
    
    public static int NB_LIGNES = 10 ;
    public static int NB_COLONNES = 10 ;
    
    private Case [][] cases = new Case[ NB_LIGNES ][NB_COLONNES] ;

    public Plateau() {
        super() ;
        initialiser() ;
    }
    
    private void initialiser(){
        
        for( int i = 0 ; i < NB_LIGNES ; i++ ){
            for( int j = 0 ; j < NB_COLONNES ; j++  ){
                cases[ i ][ j ] = new Case( i + 1 , j + 1 ) ;
            }
        }
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