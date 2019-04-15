package fr.gns;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Partonia extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        MenuBar barreMenus = new MenuBar() ;
        
        Menu menuFichier = new Menu( "Fichier" ) ;
        MenuItem itemQuitter = new MenuItem( "Quitter" ) ;
        itemQuitter.setOnAction(
                (event) -> {
                    Platform.exit() ;
                }
        );
        menuFichier.getItems().add( itemQuitter ) ;
        
        Menu menuPartie = new Menu( "Partie" ) ;
        MenuItem itemNouvelle = new MenuItem( "Nouvelle partie" ) ;
        menuPartie.getItems().add( itemNouvelle ) ;
        
        barreMenus.getMenus().addAll( menuFichier , menuPartie ) ;
        
        BorderPane root = new BorderPane();
        root.setTop( barreMenus );
        
        Scene scene = new Scene( root , 300 , 250 );
        
        primaryStage.setTitle( "Partonia" );
        primaryStage.setScene( scene );
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
