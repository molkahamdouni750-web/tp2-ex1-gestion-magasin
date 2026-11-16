package tp2ex1gestionmagasin;

public class Article {
	  private int numinventaire;
	   private String designation;
	   private String couleur;
	   private double prix;
	   private String famille;

	    
	    public Article(int numinventaire, String designation,
	            String couleur, double prix, String famille) {

	        this.numinventaire = numinventaire;
	        this.designation = designation;
	        this.couleur = couleur;
	        this.prix = prix;
	        this.famille = famille;
	    }

	   
	    public String toString() {
	        return "Num inventaire : " + numinventaire+ 
	        		"\nDesignation : " + designation+
	        		"\nCouleur : " + couleur+ 
	        		"\nPrix : " + prix+ 
	        		"\nFamille : " + famille;
	    }

	    
	    public boolean memeFamille(Article a) {
	        return this.famille.equals(a.famille);
	    }

}
