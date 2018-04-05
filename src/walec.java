public class walec extends punkt { // klasa walca

    public int  r;

    public walec(){ //konstruktor domyślny
        super();
        r=2;
    }
    public walec(int m, int r){ //konstruktor z parametrem
        super(m);
        this.r = r;
    }

    public int getRadius() { //akcesor parametru promień
        System.out.println("-promień walca= " + r + " [m]");
        return r;

    }
    public void setRadius(int r) { //mutator parametru promień
        this.r = r;

    }

    @Override            //przeciążenie metody opis
    public void opis() {
        //super.opis();
        System.out.println("WALEC");
    }

    @Override            //przeciążenie metody inertiaMoment
    public int inertiaMoment() {
        //return super.inertiaMoment();
        int I=(m*r*r)/2;
        System.out.println("-główny moment bezwładności= " + I + " [kg*m^2]");
        return I;
    }

    @Override            //przeciążenie metody steiner
    public int steiner(int d) {
        //return super.steiner(d);
        int Is=((m*r*r)/2)+(m*d*d);
        System.out.println("-moment bezwłądności(tw. Steineraa)= " + Is + " [kg*m^2]\n");
        return Is;
    }
}
