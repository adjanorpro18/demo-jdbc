package fr.diginamic.entites;

public class Fournisseur {
    private int id;
    private String nom;

    /**
     * Constructeur de la classe fournisseur
     * @param id
     * @param nom
     */
    public Fournisseur(int id, String nom) {
        super();
        this.id = id;
        this.nom = nom;
    }

    /**
     * Getters et Setters
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
