package EnvelopeNew;

import java.util.Arrays;
//Changelog at EOF
public class Main {

    // Envelope Parameter (with "Um-Eins-daneben-Fehler")
    public static int width = 50; // Envelope witdh
    public static int border = 1;
    public static int padding = 3; // Space between border and Text

    // Chars used to create the Envelope
    public static String spaceChar = " "; // Used for free spaces
    public static String borderHorizontalChar = "-";
    public static String borderVerticalChar = "|";
    public static String cornerChar = "+"; // One in each Corner
    public static String lineBreak = "\n"; // Helping Char to get in new line

    // Default Adresses and String Array initialisation
    public static String fromName = "$NAME", fromAddress = "$ADDRESS", fromZipCodeAndCity = "$ZIP $CITY";
    public static String[] fromAddresses = { fromName, fromAddress, fromZipCodeAndCity };

    public static String toName = "$NAME", toAddress = "$ADDRESS", toZipCodeAndCity = "$ZIP $CITY";
    public static String[] toAddresses = { toName, toAddress, toZipCodeAndCity };

    public static void main(String[] args) {

        printEnvelope(
                "Max Mustermann", "Mustertr. 42", "14242 Musterstadt",
                "Anna Alt", "Spass-Str. 123", "13353 Berlin");

        printEnvelope(
                "Max Mustermann", "Mustertr. 42",
                "Anna Alt", "Spass-Str. 123");

        printEnvelope(
                "Max Mustermann",
                "Anna Alt");

        printEnvelope();
    }

    public static void printEnvelope() {

        printEnvelope(fromName, fromAddress, fromZipCodeAndCity, toName, toAddress, toZipCodeAndCity);

    }

    public static void printEnvelope(String fromName, String toName) {

        printEnvelope(fromName, fromAddress, fromZipCodeAndCity, toName, toAddress, toZipCodeAndCity);

    }

    public static void printEnvelope(String fromName, String fromAddress, String toName, String toAddress) {

        printEnvelope(fromName, fromAddress, fromZipCodeAndCity, toName, toAddress, toZipCodeAndCity);

    }

    public static void printEnvelope(String fromName, String fromAddress, String fromZipCodeAndCity, String toName, 
                String toAddress, String toZipCodeAndCity) {
                    fromAddresses[0] =fromName;
                    fromAddresses[1] =fromAddress;
                    fromAddresses[2] =fromZipCodeAndCity;
                    toAddresses[0] =toName;
                    toAddresses[1] =toAddress;
                    toAddresses[2] =toZipCodeAndCity;
    //Calculate the Space to textfield of the right side of the envelope(to Addressfield)
        int spacing = theLongestwithPadding(toAddresses);
    //Creating the Envelope line by line
        line(borderHorizontalChar, cornerChar);
        line(spaceChar, borderVerticalChar);
        lineAddress(fromAddresses, padding, spacing, "from");
        line(spaceChar, borderVerticalChar);
        lineAddress(toAddresses, padding, spacing, "to");
        line(spaceChar, borderVerticalChar);
        line(borderHorizontalChar, cornerChar);
    }
    //Creating a line withoud address
    public static void line(String end, String middle) {
        //end prints the left and right endchar and middle the char between
        for (int i = 0; i <= width - 1; i++) {
            if (i == 0 || i == width - 1) {
                System.out.print(middle);
                if (i == width - 1) {
                    for (int j = 0; j < border; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("\n");
                }
            } else {
                System.out.print(end);
            }
        }

    }
    //Printing addresslines linetype "to" and "frome" decide padding or spacing to the side
    public static void lineAddress(String[] addresses, int padding, int spacing, String lineType) {
        for (int line = 0; line < addresses.length; line++) {       //Taking the adressline count
            String address = addresses[line];                       //Pullout one adress line of the array and put it in a single string
            for (int i = 0; i <= width - 1; i++) {                  //preventing "Obi-Wan error" while printing the line witdh
                if (i == 0 || i == width - 1) {
                    System.out.print(borderVerticalChar);           //Printing the space 
                    if (i == width - 1) {                           //When on the side(start or end of line) printing Border if needed
                        for (int j = 0; j < border; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("\n");                     //Goto next line
                    }
                } // Creating Adresses - first choose between "to" and "from" address and using padding or spacing
                if ((lineType.equals("to") && i == spacing) || (lineType.equals("from") && i == padding)) { 
                    System.out.print(address);                      //prints the address
                    i += address.length();                          //offset the i by the length of the printed string
                } else {
                    if (i == width - 1) {                           //if the line is ready printed leave
                        continue;
                    } else {                                        //if the line is not ready printed print spaces
                        System.out.print(spaceChar);
                    }
                }
            }
        }
    }
    //Methode calculates the longest sting of the address and adds padding by using the Array.stream methode
    public static int theLongestwithPadding(String[] strings) {
        int spacing = width - 1 - (Arrays.stream(strings).mapToInt(String::length).max().orElse(0) + padding) - 1;
        return spacing;
    }
}

/*Changelog 325 Lines reduced to 125 Lines
- Creating Address Arrays
- combined methodes for printing empty-lines and end-lines
- combined methodes for "to" and "from" addressprinting
- reduced thelongestwithpadding methode by Array.stream magic
*/