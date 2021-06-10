package fr.diginamic.jdbc;

import fr.diginamic.jdbc.dao.FournisseurDaoJdbc2;

public class TestSelect {
    public static void main(String[] args) {

        //FournisseurDaoJdbc fournisseurDaoJdbc = new FournisseurDaoJdbc();
        //fournisseurDaoJdbc.extraire();

        FournisseurDaoJdbc2 fournisseurDaoJdbc2 = new FournisseurDaoJdbc2();
        fournisseurDaoJdbc2.extraire();

    }
}
