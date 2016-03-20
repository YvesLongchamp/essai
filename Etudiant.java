/**
 * Cette classe représente un étudiant de Polytech.
 */
public class Etudiant extends Personne 
{
    private int promotion;

    /**
     * Crée un nouvel étudiant
     * @param n nom de famille
     * @param p prénom
     */
    public Etudiant(String n, String p) 
    {
	super(n, p);
    }
    /**
     * fournit la promotion, c'est-à-dire l'année où l'étudiant devrait obtenir son diplôme
     * @return la promotion
     */
    public int getPromotion() 
    {
	return promotion;    
    }
    
    /**
     * modifie l'année d'obtention du diplôme
     * @param p la promotion (année où l'étudiant devrait être diplômé), sous forme non abrégée (par exemple "2018", et non pas "18")
     */
    public void setPromotion(int p) 
    {
	promotion = p;    
    }
}
