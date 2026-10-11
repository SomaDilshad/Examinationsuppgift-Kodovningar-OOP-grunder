import java.util.ArrayList;

public class Lunchmeny {

    public static void main(String[] args) {

        ArrayList<Matratt> matratter = new ArrayList<>();

        matratter.add(new Matratt("Vegetarisk lasagne", 95.0, "Vegetarisk", 620));
        matratter.add(new Matratt("Vegansk curry", 105.0, "Vegansk", 540));
        matratter.add(new Matratt("Köttbullar med potatismos", 115.0, "Kött", 780));
        matratter.add(new Matratt("Grillad lax", 125.0, "Kött", 610));

        System.out.println("=== Dagens lunchmeny ===");

        for (Matratt matratt : matratter) {
            System.out.println(matratt);
        }
    }
}
