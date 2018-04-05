public class  test   { //klasa służąca jako program testowy

    public static void main(String[] args)
    {
        walec A = new walec(1, 4); // stworzenie obiektu klasy walec za
        A.opis();                       // pomocą konstruktora z parametrem
        int Ma=A.getMass();
        int Ra=A.getRadius();
        int Ia=A.inertiaMoment();
        int Isa=A.steiner(3);

        kula B = new kula(2,5);   // stworzenie obiektu klasy walec za
        B.opis();                      // pomocą konstruktora z parametrem
        int Mb=B.getMass();
        int Rb=B.getRadius();
        int Ib=B.inertiaMoment();
        int Isb=B.steiner(2);

        pret C = new pret(6,6);  // stworzenie obiektu klasy walec za
        C.opis();                     // pomocą konstruktora z parametrem
        int Mc=C.getMass();
        int Lc=C.getLength();
        int Ic=C.inertiaMoment();
        int Isc=C.steiner(1);

        walec tabw[] = new walec[2]; //tablica obiektów klasy walec
        for (int i=0; i<tabw.length; i++){

            tabw[i] = new walec(4,i+1);
            tabw[i].opis();
            tabw[i].getMass();
            tabw[i].getRadius();
            tabw[i].inertiaMoment();
            tabw[i].steiner(3);    //względem nowej osi d=3
        }

        kula tabk[] = new kula[2]; //tablica obiektów klasy kula
        for (int i=0; i<tabw.length; i++){

            tabk[i] = new kula(4,i+4);
            tabk[i].opis();
            tabk[i].getMass();
            tabk[i].getRadius();
            tabk[i].inertiaMoment();
            tabk[i].steiner(3);    //względem nowej osi d=3
        }

        pret tabp[] = new pret[2]; //tablica obiektów klasy pret
        for (int i=0; i<tabw.length; i++){

            tabp[i] = new pret(4,i+3);
            tabp[i].opis();
            tabp[i].getMass();
            tabp[i].getLength();
            tabp[i].inertiaMoment();
            tabp[i].steiner(3);   //względem nowej osi d=3
        }
    }
}