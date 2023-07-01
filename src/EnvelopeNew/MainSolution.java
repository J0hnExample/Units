package EnvelopeNew;

public class MainSolution {
  public static int width = 60;
  public static int border = 2;
  public static int padding = 3;

  public static String spaceChar = " ";
  public static String borderHorizontalChar = "-";
  public static String borderVerticalChar = "|";
  public static String cornerChar = "+";
  public static String lineBreak = "\n";

  public static void main(String[] args) {
    printEnvelope(
        "Max Mustermann",
        "Mustertr. 42",
        "14242 Musterstadt",
        "Anna Alt",
        "Spass-Str. 123",
        "13353 Berlin");

    printEnvelope(
        "Max Mustermann", "Mustertr. 42",
        "Anna Alt", "Spass-Str. 123");

    printEnvelope("Max Mustermann", "Anna Jung");

    printEnvelope();

    spaceChar = " ";
    width = 50;
    padding = 5;
    borderHorizontalChar = "@";
    borderVerticalChar = "=";
    cornerChar = "O";

    printEnvelope(
        "Max Mustermann",
        "Mustertr. 42",
        "14242 Musterstadt",
        "Anna Lena Altmeier",
        "Spass-Str. 123",
        "13353 Berlin");
  }

  public static void printEnvelope() {
    printEnvelope("$NAME", "$ADDRESS", "$ZIP $CITY", "$NAME", "$ADDRESS", "$ZIP $CITY");
  }

  public static void printEnvelope(String fromName, String toName) {
    printEnvelope(fromName, "$ADDRESS", "$ZIP $CITY", toName, "$ADDRESS", "$ZIP $CITY");
  }

  public static void printEnvelope(
      String fromName, String fromAddress, String toName, String toAddress) {
    printEnvelope(fromName, fromAddress, "$ZIP $CITY", toName, toAddress, "$ZIP $CITY");
  }

  public static void printEnvelope(
      String fromName,
      String fromAddress,
      String fromZipCodeAndCity,
      String toName,
      String toAddress,
      String toZipCodeAndCity) {
    System.out.print(getHeaderFooterLine());
    System.out.print(getLine());
    System.out.print(getLine(true, fromName, fromAddress, fromZipCodeAndCity));
    System.out.print(getLine());
    System.out.print(getLine(false, toName, toAddress, toZipCodeAndCity));
    System.out.print(getLine());
    System.out.print(getHeaderFooterLine());
  }

  private static String getHeaderFooterLine() {
    String result = cornerChar;
    for (int i = 0; i < width - border; i++) {
      result += borderHorizontalChar;
    }
    result += cornerChar + lineBreak;

    return result;
  }

  private static String getLine() {
    return getLine(0, "");
  }

  private static String getLine(
      boolean fromLeft, String name, String address, String zipCodeAndCity) {
    int intendation = 0;

    if (fromLeft) {
      intendation = padding;
    } else {
      int maxLength = name.length();
      if (address.length() > maxLength) {
        maxLength = address.length();
      }
      if (zipCodeAndCity.length() > maxLength) {
        maxLength = zipCodeAndCity.length();
      }

      intendation = width - maxLength - border - padding;
    }

    return getLine(intendation, name)
        + getLine(intendation, address)
        + getLine(intendation, zipCodeAndCity);
  }

  private static String getLine(int intendation, String input) {
    String result = "";

    result += borderVerticalChar;

    for (int j = 0; j < intendation; j++) {
      result += spaceChar;
    }

    result += input;

    for (int j = 0; j < width - intendation - input.length() - border; j++) {
      result += spaceChar;
    }
    result += borderVerticalChar;

    return result + lineBreak;
  }
}
