package fr.diginamic.xml;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.util.Iterator;

public class TestConfigurationsXML {
    public static void main(String[] args) throws ConfigurationException {

        Configurations configurations = new Configurations();

        //définir les deux types de configurations
        XMLConfiguration configXML = configurations.xml("configurations.xml");
        PropertiesConfiguration configprops = configurations.properties("configurations.properties");

        //Boucle de parcours de la conf properties
        Iterator<String> itkeys = configprops.getKeys();
        while (itkeys.hasNext()) {
            String cle = itkeys.next();
            String valeur = configprops.getString("key");

            System.out.println(cle + ":" + valeur);
        }


        //Boucle de parcours de la conf XML
        itkeys = configXML.getKeys();
        while (itkeys.hasNext()) {
            String cle = itkeys.next();
            String valeur = configprops.getString("key");

            System.out.println(cle + ":" + valeur);
        }

    }
}
