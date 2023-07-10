package student;

public class Student {
    private String prename;
    private String surname;
    private String street;
    private String houseNumber;
    private String zipCode;
    private String city;
    private String registrationNumber;
    private StudyCourse studyCourse;
    private int age;
    private Course[] bookedCourses;

    public Student(String prename, String surname, String street, String houseNumber, String zipCode, String city,
            String registrationNumber) {
        this(prename, surname, street, houseNumber, zipCode, city, registrationNumber, StudyCourse.MEDIENINFORMATIK, 20);
        bookedCourses = new Course[5];
    }

    public Student(String prename, String surname, String street, String houseNumber, String zipCode, String city,
            String registrationNumber, int age) {
        this(prename, surname, street, houseNumber, zipCode, city, registrationNumber, StudyCourse.MEDIENINFORMATIK,
                age);
        bookedCourses = new Course[5];
    }

    public Student(String prename, String surname, String street, String houseNumber, String zipCode, String city,
            String registrationNumber, StudyCourse studyCourse, int age) {
        this.prename = prename;
        this.surname = surname;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.city = city;
        this.registrationNumber = registrationNumber;
        this.studyCourse = studyCourse;
        this.age = age;
        bookedCourses = new Course[5];
    }

    public void bookCourse(Course course) {
        for (int i = 0; i < bookedCourses.length; i++) {
            if (bookedCourses[i] == null) {
                bookedCourses[i] = course;
                break;
            }
        }
    }

    public int getBookedCoursesCount() {
        int count = 0;
        for (Course course : bookedCourses) {
            if (course != null) {
                count++;
            }
        }
        return count;
    }

    public String[] getNameAndAddress() {
        return new String[] { prename, surname, street, houseNumber, zipCode, city };
    }

    @Override
    public String toString() {
        return prename + " " + surname + " (" + registrationNumber + "), " + studyCourse;
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public StudyCourse getStudyCourse() {
        return studyCourse;
    }

    public void setStudyCourse(StudyCourse studyCourse) {
        this.studyCourse = studyCourse;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
