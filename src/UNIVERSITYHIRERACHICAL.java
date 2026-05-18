// Parent class
class University {
    String uname;

    University(String uname) {
        this.uname = uname;
    }

    void displayUniversity() {
        System.out.println("University Name: " + uname);
    }
}

// Child 1 of University
class College1 extends University {
    String cName;
    String cAddress;

    College1(String uname, String cName, String cAddress) {
        super(uname);  // Call parent constructor first
        this.cName = cName;
        this.cAddress = cAddress;
    }

    void displayCollege1() {
        displayUniversity();
        System.out.println("College Name: " + cName);
        System.out.println("Address: " + cAddress);
    }
}

// Child 2 of University
class College2 extends University {
    String cName;
    int noOfDepartments;

    College2(String uname, String cName, int noOfDepartments) {
        super(uname);  // Must be first line
        this.cName = cName;
        this.noOfDepartments = noOfDepartments;
    }

    void displayCollege2() {
        displayUniversity();
        System.out.println("College Name: " + cName);
        System.out.println("No of Departments: " + noOfDepartments);
    }
}

// Child 3 of University
class College3 extends University {
    String cName;
    int noOfStudents;

    College3(String uname, String cName, int noOfStudents) {
        super(uname);  // Must be first line
        this.cName = cName;
        this.noOfStudents = noOfStudents;
    }

    void displayCollege3() {
        displayUniversity();
        System.out.println("College Name: " + cName);
        System.out.println("No of Students: " + noOfStudents);
    }
    }
public class UNIVERSITYHIRERACHICAL{
    public static void main(String[] args) {
        System.out.println("--- College 1 Details ---");
        College1 c1 = new College1("VISVESHWARIA TECHNOLOGICAL UNIVERSITY", "VTU", "BELAGAVI");
        c1.displayCollege1();

        System.out.println("\n--- College 2 Details ---");
        College2 c2 = new College2("VISVESHWARIA TECHNOLOGICAL UNIVERSITY", "SSIT", 15);
        c2.displayCollege2();

        System.out.println("\n--- College 3 Details ---");
        College3 c3 = new College3("VISVESHWARIA TECHNOLOGICAL UNIVERSITY", "PESIT", 5000);
        c3.displayCollege3();
    }
}












