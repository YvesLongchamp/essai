/**
 * Cette classe représente une <b>adresse <font color=red>postale</font> </b>
 * @author Galtier
 * @version 1.0
 */

public class Adresse 
{
    private int numero;
    private String rue;
    private String codePostal;
    private String ville;
    
    /**
     * Crée une nouvelle adresse
     * @param n numéro
     * @param r rue
     * @param cp code postal
     * @param v ville
     */
    public Adresse(int n, String r, String cp, String v) 
    {
	numero = n;
	rue = r;
	codePostal = cp;
	ville = v;    
    }
    
    /**
     * fournit une représentation textuelle de l'adresse
     * @param prefix vrai pour que le code postal soit préfixé par un 'F', faux pour ne pas avoir de préfixe
     * @return une chaîne de caractères représentant l'adresse sous le format habituellement employé sur les enveloppes
     */
    public String formeTextuelle(boolean prefix) 
    {
	String description = new String();
	description += numero + " " + rue + "\n";
	if (prefix)
	    description += "F";
	description += codePostal + " " + ville.toUpperCase();
	return description;    
    }
}
