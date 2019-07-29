package tn.com.biat.account_service.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document(collection = "comptes")
public class Compte {


    @Id
    private String id;

    //Informations générales:
    private String nom;
    private String prenom;
    private String nomJF;
    private String email;
    private String code_client;
    private String gender;
    private String credit_immediat;

    //Coordonnées
    private String pays;
    private String adresse;
    private String gouvernorat;
    private String tel_mobile;
    private String tel_domicile;
    /*
    -Propriétaire
    - Locataire
    - Logement de fonction
    - Hébergé(e) par un tiers
    */
    private String situationDomicile;



    //etat civil

    private Date date_naissance;
    private String pays_naissance;
    private String gouvernorat_naissance;
    private String nationalite;
    private String seconde_nationalite;



    /*Situation familiale
     - Marié(e)
     - Célibataire
     - Marié(e)
     - Veuf(e)
     - Autres
     */
    private String situation_familiale;

    //Situation professionelle
    private String domaine;
    private String profession;
    private String type_compte;
    //professionel
    private float revenu_net_mensuel;


    //morale

    private Date date_creation;
    private Date fin_exercice;
    private String code_activite;
    private float chiffre_affaire;
    private int nbr_salaries;
    private float payes_activite;


    //Alimentatioon du compte
	/*
	  a. En domiciliant mes revenus / salaires,
	  b. En alimentant mon compte par des virements externes
	  c. Autres
	 */
    private String type_alimentation;

    //Service a utiliser
	/*
	 a. Prélèvements
	 b. Crédit consommation
	 c. Crédit immobilier
	 d. Virements
	 e. Epargne
	 */

    private String type_service ;

    private String type_carte;


    //Documents
    private String copie_CIN;
    private String fiche_paie;
    private String facture;

    //Etat du compte
    private String etat_du_compte;
    private boolean enabled;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomJF() {
        return nomJF;
    }

    public void setNomJF(String nomJF) {
        this.nomJF = nomJF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode_client() {
        return code_client;
    }

    public void setCode_client(String code_client) {
        this.code_client = code_client;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getGouvernorat() {
        return gouvernorat;
    }

    public void setGouvernorat(String gouvernorat) {
        this.gouvernorat = gouvernorat;
    }

    public String getTel_mobile() {
        return tel_mobile;
    }

    public void setTel_mobile(String tel_mobile) {
        this.tel_mobile = tel_mobile;
    }

    public String getTel_domicile() {
        return tel_domicile;
    }

    public void setTel_domicile(String tel_domicile) {
        this.tel_domicile = tel_domicile;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getPays_naissance() {
        return pays_naissance;
    }

    public void setPays_naissance(String pays_naissance) {
        this.pays_naissance = pays_naissance;
    }

    public String getGouvernorat_naissance() {
        return gouvernorat_naissance;
    }

    public void setGouvernorat_naissance(String gouvernorat_naissance) {
        this.gouvernorat_naissance = gouvernorat_naissance;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getSeconde_nationalite() {
        return seconde_nationalite;
    }

    public void setSeconde_nationalite(String seconde_nationalite) {
        this.seconde_nationalite = seconde_nationalite;
    }

    public String getSituation_familiale() {
        return situation_familiale;
    }

    public void setSituation_familiale(String situation_familiale) {
        this.situation_familiale = situation_familiale;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getType_compte() {
        return type_compte;
    }

    public void setType_compte(String type_compte) {
        this.type_compte = type_compte;
    }

    public float getRevenu_net_mensuel() {
        return revenu_net_mensuel;
    }

    public void setRevenu_net_mensuel(float revenu_net_mensuel) {
        this.revenu_net_mensuel = revenu_net_mensuel;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }

    public Date getFin_exercice() {
        return fin_exercice;
    }

    public void setFin_exercice(Date fin_exercice) {
        this.fin_exercice = fin_exercice;
    }

    public String getCode_activite() {
        return code_activite;
    }

    public void setCode_activite(String code_activite) {
        this.code_activite = code_activite;
    }

    public float getChiffre_affaire() {
        return chiffre_affaire;
    }

    public void setChiffre_affaire(float chiffre_affaire) {
        this.chiffre_affaire = chiffre_affaire;
    }

    public int getNbr_salaries() {
        return nbr_salaries;
    }

    public void setNbr_salaries(int nbr_salaries) {
        this.nbr_salaries = nbr_salaries;
    }

    public float getPayes_activite() {
        return payes_activite;
    }

    public void setPayes_activite(float payes_activite) {
        this.payes_activite = payes_activite;
    }

    public String getType_alimentation() {
        return type_alimentation;
    }

    public void setType_alimentation(String type_alimentation) {
        this.type_alimentation = type_alimentation;
    }

    public String getType_service() {
        return type_service;
    }

    public void setType_service(String type_service) {
        this.type_service = type_service;
    }

    public String getCopie_CIN() {
        return copie_CIN;
    }

    public void setCopie_CIN(String copie_CIN) {
        this.copie_CIN = copie_CIN;
    }

    public String getFiche_paie() {
        return fiche_paie;
    }

    public void setFiche_paie(String fiche_paie) {
        this.fiche_paie = fiche_paie;
    }

    public String getFacture() {
        return facture;
    }

    public void setFacture(String facture) {
        this.facture = facture;
    }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }

    public String getCredit_immediat() { return credit_immediat; }

    public void setCredit_immediat(String credit_immediat) { this.credit_immediat = credit_immediat; }

    public String getSituationDomicile() { return situationDomicile; }

    public void setSituationDomicile(String situationDomicile) { this.situationDomicile = situationDomicile; }

    public String getType_carte() { return type_carte; }

    public void setType_carte(String type_carte) { this.type_carte = type_carte; }

    public String getEtat_du_compte() { return etat_du_compte; }

    public void setEtat_du_compte(String etat_du_compte) { this.etat_du_compte = etat_du_compte; }

    public boolean isEnabled() { return enabled; }

    public void setEnabled(boolean enabled) { this.enabled = enabled; }
}
