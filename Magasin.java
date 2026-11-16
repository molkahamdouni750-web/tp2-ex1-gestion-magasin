package tp2ex1gestionmagasin;


public class Magasin {

    private int capacite;
    private Article[] stock;
    private int nbarticle;

    
    public Magasin(int capacite) {
        this.capacite = capacite;
        stock = new Article[capacite];
        nbarticle = 0;
    }

    
    public void Ajout(Article a) {
        if (nbarticle < capacite) {
            stock[nbarticle] = a;
            nbarticle++;
        } else {
            System.out.println("Stock plein !");
        }
    }

    
    public void Inventaire() {
        for (int i = 0; i < nbarticle; i++) {
            System.out.println(stock[i].toString());
            System.out.println("----------------");
        }
    }
}

