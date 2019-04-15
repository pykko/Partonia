package fr.gns.entites;

public class Case {
    
    private int ligne ;
    private int colonne ;
    
    private Pion pion ;

    public Case() {
        super() ;
    }

    public Case( int ligne , int colonne ) {
        this.ligne = ligne;
        this.colonne = colonne;
    }

    public int getLigne() {
        return ligne;
    }

    public void setLigne(int ligne) {
        this.ligne = ligne;
    }

    public int getColonne() {
        return colonne;
    }

    public void setColonne(int colonne) {
        this.colonne = colonne;
    }

    public Pion getPion() {
        return pion;
    }

    public void setPion(Pion pion) {
        this.pion = pion;
    }
    
    @Deprecated
    public void poserPion( Pion pion ){
        /*
        if( pion.getPosition() != null ){
            pion.getPosition().setPion( null );
        }
        */
        this.pion = pion ;
        //this.pion.setPosition( this ) ;
    }
    
    public boolean estOccupee(){
        if( this.pion != null ){
            return true ;
        }
        return false ;
    }
    
    public boolean estLibre(){
        if( this.pion == null ){
            return true ;
        }
        return false ;
    }

    @Override
    @Deprecated
    public boolean equals(Object obj) {
        
        final Case other = (Case) obj;
        if (this.ligne != other.ligne) {
            return false;
        }
        if (this.colonne != other.colonne) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Case{" + "ligne=" + ligne + ", colonne=" + colonne + '}';
    }
    
}
