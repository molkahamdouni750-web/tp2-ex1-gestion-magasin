package tp2ex1gestionmagasin;

public class Article_Lot extends Article{
	private int nombrePieces;
	 
	public Article_Lot(int numinventaire, String designation,
	        String couleur, double prix, String famille, int nombrePieces) {

	    super(numinventaire, designation, couleur, prix, famille);

	    this.nombrePieces = nombrePieces;}
	
	public String toString() {
	    return super.toString() +
	            "\nNombre de pieces : " + nombrePieces;
	}

}
