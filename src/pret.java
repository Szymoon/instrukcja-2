public class pret extends punkt{ //klasa pręta

    public int  l;

    public pret(){ //konstruktor domyślny
        super();
        l=2;
    }
    public pret(int m, int l){ //konstruktor z parametrem
        super(m);
        this.l = l;
    }

    public int getLength() { //akcesor parametru długość
        System.out.println("-długość pręta= " + l + " [m]");
        return l;

    }
    public void setLength(int l) { //mutator parametru długość
        this.l = l;

    }

    @Override //przeciążenie metody opis
    public void opis() {
        //super.opis();
        System.out.println("PRĘT");
    }

    @Override //przeciążenie metody inertiaMoment
    public int inertiaMoment() {
        //return super.inertiaMoment();
        int I=(m*l*l)/12;
        System.out.println("-główny moment bezwładności= " + I + " [kg*m^2]");
        return I;
    }

    @Override //przeciążenie metody steiner
    public int steiner(int d) {
        //return super.steiner(d);
        int Is=((m*l*l)/12)+(m*d*d);
        System.out.println("-moment bezwłądności(tw. Steineraa)= " + Is + " [kg*m^2]\n");
        return Is;
    }
}
