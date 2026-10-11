public class StudentMain {

    public static void main(String[] args) {

        Student student = new Student("Anna", "Andersson", "Systementor", 28);

        System.out.println("Förnamn: " + student.getFornamn());
        System.out.println("Efternamn: " + student.getEfternamn());
        System.out.println("Skola: " + student.getSkola());
        System.out.println("Ålder: " + student.getAlder());
    }
}
