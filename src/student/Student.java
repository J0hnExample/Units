package student;

public record  Student(String prename, String surname, String street, String houseNumber, String zipCode, String city, String registrationNumber, StudyCourse studyCourse, int age) {

                public Student(String prename, String surname, String street, String houseNumber, String zipCode, String city, String registrationNumber)
                {
                    this(prename, surname, street, houseNumber, zipCode, city, registrationNumber, 20);

                }  
                public Student(String prename, String surname, String street, String houseNumber, String zipCode, String city, String registrationNumber, int age){
                    this(prename, surname, street, houseNumber, zipCode, city, registrationNumber,MEDIENINFORMATIK, age);
                }  
            }

  