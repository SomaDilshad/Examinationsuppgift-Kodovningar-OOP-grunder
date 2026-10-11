public class Person {

    private String fodelsedatum;
    private String namn;
    private String gatuAdress;
    private String postNummer;
    private String postOrt;

    public Person(String fodelsedatum) {
        this.fodelsedatum = fodelsedatum;
    }

    public String getFodelsedatum() {
        return fodelsedatum;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getGatuAdress() {
        return gatuAdress;
    }

    public String getPostNummer() {
        return postNummer;
    }

    public String getPostOrt() {
        return postOrt;
    }

    public void setAdress(String gatuAdress, String postNummer, String postOrt) {
        this.gatuAdress = gatuAdress;
        this.postNummer = postNummer;
        this.postOrt = postOrt;
    }

    public void flyttaInHos(Person annan) {
        this.gatuAdress = annan.getGatuAdress();
        this.postNummer = annan.getPostNummer();
        this.postOrt = annan.getPostOrt();
    }

    @Override
    public String toString() {
        return namn + " (" + fodelsedatum + ") - " + gatuAdress + ", " + postNummer + " " + postOrt;
    }
}
