package student;


public class Main {

    public static void main(String[] args) {
        Envelope envelope = new Envelope();
        
        Student s1 = new Student("John", "Doe", "Doestreet", "42", "12212", "Fancytown", "2323232");
        Student s2 = new Student("Bessie", "Clemente", "Wilson Avenue", "40", "75081", "Texas", "63453");
        
        envelope.printEnvelope(new Student[] { s1 });
        
        System.out.println("--------------------------------------");
        
        envelope.printEnvelope(new Student[] { s1, s2 });

    }
}
