public class PersonMain {

    public static void main(String[] args) {

        Person jag = new Person("1995-04-12");
        jag.setNamn("Ali");
        jag.setAdress("Storgatan 1", "411 23", "Göteborg");

        Person kompis = new Person("1993-09-30");
        kompis.setNamn("Sara");
        kompis.setAdress("Lillgatan 5", "211 34", "Malmö");

        System.out.println("Innan flytten:");
        System.out.println(jag);
        System.out.println(kompis);

        // Den ena flyttar in hos den andra
        jag.flyttaInHos(kompis);

        System.out.println();
        System.out.println("Efter flytten:");
        System.out.println(jag);
        System.out.println(kompis);
    }
}
