package Assignment1;


class Instructor {
    private String firstName;
    private String lastName;
    private String officeNumber;

    // Constructor
    public Instructor(String firstName, String lastName, String officeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}

class Textbook {
    private String title;
    private String author;
    private String publisher;

    // Constructor
    public Textbook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}

class Course {
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;

    // Constructor
    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public void print() {
        System.out.println("Course name: " + courseName);
        System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName());
        System.out.println("Office number: " + instructor.getOfficeNumber());
        System.out.println("Textbook: " + textbook.getTitle() + " by " + textbook.getAuthor());
    }
}

public class Question3 {
    public static void main(String[] args) {
        // Create Instructor objects
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("John", "Doe", "4-1234");

        // Create Textbook objects
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook textbook2 = new Textbook("Introduction to Algorithms", "Thomas H. Cormen", "MIT Press");

        // Create Course objects
        Course course1 = new Course("Software Engineering", instructor1, textbook1);
        Course course2 = new Course("Data Structures", instructor2, textbook2);

        // Print course information
        System.out.println("Course 1 Information:");
        course1.print();
        System.out.println();

        System.out.println("Course 2 Information:");
        course2.print();
    }
}

