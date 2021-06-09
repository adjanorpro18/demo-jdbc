package fr.diginamic.xml;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.util.Iterator;

public class TestConfigurationsXML {
    public static void main(String[] args) throws ConfigurationException {

        Configurations configs = new Configurations();
        try {
            XMLConfiguration config = configs.xml("configurations.xml");
            String nomBase = config.getString("database[@nom]");
            System.out.println(nomBase);
            String hostDatabase = config.getString("database.host");
        } catch (ConfigurationException e) {
            System.err.println("Le fichier est introuvable");
        }

        PropertiesConfiguration config = configs.properties("configurations.xml");
        Iterator<String> it = config.getKeys();
        while (it.hasNext()) {
            String cle = it.next();
            String valeur = config.getString("key");

            System.out.println(cle + ":" + valeur);
        }
    }
}
