package fr.diginamic.props;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ResourceBundle;

public class TestConfigurationProps {
    public static void main(String[] args) {

        ResourceBundle config = ResourceBundle.getBundle("configurations");
        String databaseName = config.getString("nom");

        //recuperer le premier element
        System.out.println(databaseName);

        //Boucle pour iterer sur chaque element contenu dans le fichier properties

        Enumeration<String> cles = config.getKeys();
        while(cles.hasMoreElements()){
            String cle = cles.nextElement();
            String valeur = config.getString(cle);
            System.out.println(cle + ": " + valeur);
        }




    }

}
