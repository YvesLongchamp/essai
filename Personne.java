/**
 * Cette classe repr�sente une personne.
 *
 * @author Galtier
 */
public abstract class Personne 
{
    /**
     * le nom de famille
     */
    public String nom;
    /**
     * le pr�nom
     */
    private String prenom;
    /** 
     * l'adresse postale
     */
    private Adresse adresse;
    
    /**
     * Cr�e une nouvelle personne
     * @param n nom de famille
     * @param p pr�nom
     */
    public Personne(String n, String p) 
    {
	nom = n;
	prenom = p;    
    }
    
    /**
     * modifie l'adresse postale
     * @param a adresse postale
     */
    public void setAdresse(Adresse a) 
    {
	adresse  = a;    
    }
    
    /**
     * fournit l'adresse postale
     * @return l'adresse postale
     */
    public Adresse getAdresse() 
    {
	return adresse;    
    }
    
    /**
     * fournit le pr�nom
     * @return le pr�nom
     */
    public String getPrenom() 
    {
	return prenom;    
    }
    
    /**
     * affiche les informations sur la personne sous la forme habituellement employ�e sur les enveloppes
     */
    public void afficheEtiquette() 
    {
	System.out.println(nom.toUpperCase() + " " + prenom);
	System.out.println(adresse.formeTextuelle(true));    
    }
}
