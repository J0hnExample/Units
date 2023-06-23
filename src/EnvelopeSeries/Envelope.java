package EnvelopeSeries;

public class Envelope {
    public static int width = 50;
    public static int border = 1;
    public static int padding = 3;
    public static String spaceChar = " ";
    public static String borderHorizontalChar = "-";
    public static String borderVerticalChar = "|";
    public static String cornerChar = "+";
    public static String lineBreak = "\n";


public void printEnvelope(Student[] toStudents) {
    String fromName = "BHT Berlin";
    String fromAddress = "Luxemburger Str. 10";
    String fromZipCodeAndCity = "13353 Berlin";

    for (Student student : toStudents) {
        String[] nameAndAddress = student.getNameAndAddress();
        String toName = nameAndAddress[0] + " " + nameAndAddress[1];
        String toAddress = nameAndAddress[2] + " " + nameAndAddress[3];
        String toZipCodeAndCity = nameAndAddress[4] + " " + nameAndAddress[5];
        printEnvelope(fromName, fromAddress, fromZipCodeAndCity, toName, toAddress, toZipCodeAndCity);
    }
}
    public static void printEnvelope(String fromName, String fromAddress, String fromZipCodeAndCity, String toName,
            String toAddress, String toZipCodeAndCity) {

        String[] adresses = { toName, toAddress, toZipCodeAndCity };
        int spacing = theLongestwithPadding(adresses);

        lineClose(border);
        lineEmpty();
        lineDummySendName(fromName);
        lineDummySendAdress(fromAddress);
        lineDummySendZipCity(fromZipCodeAndCity);
        lineEmpty();
        lineDummyRecName(toName, spacing);
        lineDummyRecAdress(toAddress, spacing);
        lineDummyRecZipCity(toZipCodeAndCity, spacing);
        lineEmpty();
        lineClose(border);
    }
    
    public static void lineEmpty() {
        // Print empty line
        for (int i = 0; i <= width-1; i++) {
            if (i == 0 || i == width-1) {
                System.out.print(borderVerticalChar);
                if (i == width-1) {
                    for (int j = 0; j < border; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("\n");
                }
            } else {
                System.out.print(spaceChar);
            }
        }

    }

    public static void lineClose(int border) {
        // line
        for (int i = 0; i <= width-1; i++) {
            if (i == 0 || i == width-1) {
                System.out.print(cornerChar);
                if (i == width-1) {
                    for (int j = 0; j < border; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("\n");
                }
            } else {
                System.out.print(borderHorizontalChar);
            }
        }
    }

    public static void lineDummySendName(String name) {

        for (int i = 0; i <= width-1; i++) {
            if (i == 0 || i == width-1) {
                System.out.print(borderVerticalChar);
                if (i == width-1) {
                    for (int j = 0; j < border; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("\n");
                }

            }
            if (i == padding) {
                System.out.print(name);
                i += name.length();

            } else {
                if (i == width-1) {
                    continue;
                } else {
                    System.out.print(spaceChar);
                }

            }

        }

    }

    public static void lineDummySendAdress(String address) {
        for (int i = 0; i <= width-1; i++) {
            if (i == 0 || i == width-1) {
                System.out.print(borderVerticalChar);
                if (i == width-1) {
                    for (int j = 0; j < border; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("\n");
                }
            }
            if (i == padding) {
                System.out.print(address);
                i += address.length();

            } else {
                if (i == width-1) {
                    continue;
                } else {
                    System.out.print(spaceChar);
                }

            }

        }

    }

    public static void lineDummySendZipCity(String zipCity) {
        for (int i = 0; i <= width-1; i++) {
            if (i == 0 || i == width-1) {
                System.out.print(borderVerticalChar);
                if (i == width-1) {
                    for (int j = 0; j < border; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("\n");
                }
            }
            if (i == padding) {
                System.out.print(zipCity);
                i += zipCity.length();

            } else {
                if (i == width-1) {
                    continue;
                } else {
                    System.out.print(spaceChar);
                }

            }

        }

    }

    public static void lineDummyRecName(String toName, int spacing) {

        for (int i = 0; i <= width-1; i++) {
            if (i == 0 || i == width-1) {
                System.out.print(borderVerticalChar);
                if (i == width-1) {
                    for (int j = 0; j < border; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("\n");
                }

            }
            if (i == spacing) {
                System.out.print(toName);
                i += toName.length();

            } else {
                if (i == width-1) {
                    continue;
                } else {
                    System.out.print(spaceChar);
                }

            }

        }

    }

    public static void lineDummyRecAdress(String toAddress, int spacing) {
        for (int i = 0; i <= width-1; i++) {
            if (i == 0 || i == width-1) {
                System.out.print(borderVerticalChar);
                if (i == width-1) {
                    for (int j = 0; j < border; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("\n");
                }
            }
            if (i == spacing) {
                System.out.print(toAddress);
                i += toAddress.length();

            } else {
                if (i == width-1) {
                    continue;
                } else {
                    System.out.print(spaceChar);
                }

            }

        }

    }

    public static void lineDummyRecZipCity(String toZipCodeAndCity, int spacing) {
        for (int i = 0; i <= width-1; i++) {
            if (i == 0 || i == width-1) {
                System.out.print(borderVerticalChar);
                if (i == width-1) {
                    for (int j = 0; j < border; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("\n");
                }
            }
            if (i == spacing) {
                System.out.print(toZipCodeAndCity);
                i += toZipCodeAndCity.length();

            } else {
                if (i == width-1) {
                    continue;
                } else {
                    System.out.print(spaceChar);
                }

            }

        }
    }

    public static int theLongestwithPadding(String[] strings) {
        // Calculates the longest string and creating text space with the padding
        int maxLength = 0;

        for (String s : strings) {
            if (s.length() > maxLength) {
                maxLength = s.length();

            }
        }
        int param = maxLength + padding;
        int spacing = width-1 - param - 1;

        return spacing;
    }

}