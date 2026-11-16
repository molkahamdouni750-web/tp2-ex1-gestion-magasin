package tp2ex1gestionmagasin;



import java.util.Scanner;

public class TestMagasin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Magasin m = new Magasin(10);

        System.out.println("Donner le nombre d'articles :");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Numero inventaire :");
            int num = sc.nextInt();

            System.out.println("Designation :");
            String des = sc.next();

            System.out.println("Couleur :");
            String cou = sc.next();

            System.out.println("Prix :");
            double prix = sc.nextDouble();

            System.out.println("Famille :");
            String fam = sc.next();

            Article a = new Article(num, des, cou, prix, fam);

            m.Ajout(a);
        }

        System.out.println("Inventaire du magasin :");
        m.Inventaire();

        sc.close();
    }
}



