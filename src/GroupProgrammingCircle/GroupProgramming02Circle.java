package GroupProgrammingCircle;
public class GroupProgramming02Circle {
    
    public static void main(String[] args) {
        
      double r = 2.0d;
        Circle c1 = new Circle();

        Circle c2 = new Circle(r);

        double c1Area = c1.getArea();
        double c2Area = c2.getArea(2);

        System.out.println("c1=" +c1Area);
        System.out.println("c2=" +c2Area);


        /*
          - Erstelle eine Klasse mit dem Namen "Circle"
          - Die Klasse soll zwei private Instanz-Variablen/Attribute haben:
            - 'radius' (vom Typ 'double'), mit dem default-Wert von 1,0 
            - 'color' (vom Type 'String'), mit dem default-Wert von "red"
            
          - Die Klasse soll zwei ueberladene Konstruktoren haben:
            - einen default-Konstruktur ohne Argumente
            - einen Konstruktur, welches ein Argument vom Type double fuer den Radius entgegen nimmt
        
          - Die Klasse soll zwei oeffentlich sichtbare Methoden haben:
            - 'getRadius()', welches den Radius zurueck liefert
            - 'getArea()', welches die Flaeche des Kreises berechnet und zurueck liefert
            
          - Von der Klasse "Circle" sollen zwei Instanzen erzeugt, und der Radius und die Flaeche ausgegeben werden:
            - Mit dem default-Konstruktor
            - Mit einem Radius von 2
        
        */
    }
}

