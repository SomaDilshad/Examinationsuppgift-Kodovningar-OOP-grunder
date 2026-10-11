public class Matratt {

    private String namn;
    private double pris;
    private String typ; // Vegetarisk, Vegansk eller Kött
    private int antalKalorier;

    public Matratt(String namn, double pris, String typ, int antalKalorier) {
        this.namn = namn;
        this.pris = pris;
        this.typ = typ;
        this.antalKalorier = antalKalorier;
    }

    public String getNamn() {
        return namn;
    }

    public double getPris() {
        return pris;
    }

    public String getTyp() {
        return typ;
    }

    public int getAntalKalorier() {
        return antalKalorier;
    }

    @Override
    public String toString() {
        return namn + " (" + typ + ") - " + pris + " kr - " + antalKalorier + " kcal";
    }
}
