public class kula extends punkt { // klasa kuli

    public int  r;

    public kula(){ //konstruktor domyślny
        super();
        r=2;
    }
    public kula(int m, int r){ //konstruktor z parametrem
        super(m);
        this.r = r;
    }

    public int getRadius() { //akcesor parametru promień
        System.out.println("-promień kuli= " + r + " [m]");
        return r;

    }
    public void setRadius(int r) { //mutator parametru promień
        this.r = r;

    }

    @Override               //przeciążenie metody opis
    public void opis() {
        //super.opis();
        System.out.println("KULA");
    }

    @Override               //przeciążenie metody inertiaMoment
    public int inertiaMoment() {
        //return super.inertiaMoment();
        int I=(2*m*r*r)/5;
        System.out.println("-główny moment bezwładności= " + I + " [kg*m^2]");
        return I;
    }

    @Override               //przeciążenie metody steiner
    public int steiner(int d) {
        //return super.steiner(d);
        int Is=((2*m*r*r)/5)+(m*d*d);
        System.out.println("-moment bezwłądności(tw. Steineraa)= " + Is + " [kg*m^2]\n");
        return Is;
    }
}
