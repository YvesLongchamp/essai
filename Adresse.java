/**
 * Cette classe repr�sente une <b>adresse <font color=red>postale</font> </b>
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
     * Cr�e une nouvelle adresse
     * @param n num�ro
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
     * fournit une repr�sentation textuelle de l'adresse
     * @param prefix vrai pour que le code postal soit pr�fix� par un 'F', faux pour ne pas avoir de pr�fixe
     * @return une cha�ne de caract�res repr�sentant l'adresse sous le format habituellement employ� sur les enveloppes
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
