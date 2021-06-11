package fr.miage.projet.parking2021.metier;

public class Parking {
    private int numParking;
    private String nomParking = "";
    private  int codePostal;
    private int prix;
    private String description ="";
    private int numCommune;

    public Parking(){

    }

    public int getNumParking() {
        return numParking;
    }

    public void setNumParking(int numParking) {
        this.numParking = numParking;
    }

    public String getNomParking() {
        return nomParking;
    }

    public void setNomParking(String nomParking) {
        this.nomParking = nomParking;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int  prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumCommune() {
        return numCommune;
    }

    public void setNumCommune(int numCommune) {
        this.numCommune = numCommune;
    }
}
