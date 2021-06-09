package fr.diginamic.props;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ResourceBundle;

public class TestConfigurationProps {
    public static void main(String[] args) {

        ResourceBundle config = ResourceBundle.getBundle("configurations");
        String databaseName = config.getString("nom");

        System.out.println(databaseName);

        Enumeration<String> cles = config.getKeys();
        while(cles.hasMoreElements()){
            String cle = cles.nextElement();
            String valeur = config.getString(cle);
            System.out.println(cle + ": " + valeur);
        }




    }

}
