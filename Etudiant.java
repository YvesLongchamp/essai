/**
 * Cette classe repr�sente un �tudiant de Polytech.
 */
public class Etudiant extends Personne 
{
    private int promotion;

    /**
     * Cr�e un nouvel �tudiant
     * @param n nom de famille
     * @param p pr�nom
     */
    public Etudiant(String n, String p) 
    {
	super(n, p);
    }
    /**
     * fournit la promotion, c'est-�-dire l'ann�e o� l'�tudiant devrait obtenir son dipl�me
     * @return la promotion
     */
    public int getPromotion() 
    {
	return promotion;    
    }
    
    /**
     * modifie l'ann�e d'obtention du dipl�me
     * @param p la promotion (ann�e o� l'�tudiant devrait �tre dipl�m�), sous forme non abr�g�e (par exemple "2018", et non pas "18")
     */
    public void setPromotion(int p) 
    {
	promotion = p;    
    }
}
