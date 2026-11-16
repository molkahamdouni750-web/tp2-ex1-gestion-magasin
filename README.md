# tp2-ex1-gestion-magasin
tp2: héritage et polymorphisme


Nom prénom: molka hamdouni

classDiagram


    class Article {
        -int numinventaire
        -String designation
        -String couleur
        -double prix
        -String famille
        +Article()
        +toString() String
        +memeFamille(Article) boolean
    }

    class Article_Lot {
        -int nombrePieces
        +Article_Lot()
        +toString() String
    }

    class Magasin {
        -int capacite
        -Article[] stock
        -int nbarticle
        +Magasin(int)
        +Ajout(Article) void
        +Inventaire() void
    }

    class TestMagasin {
        +main(String[]) void
    }

    Article <|-- Article_Lot
    Magasin o-- Article
    TestMagasin ..> Magasin



