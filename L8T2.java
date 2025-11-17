abstract class Person {
    private String name;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }
    
    public abstract Boolean isOutstanding();
}

class Student extends Person {
    private double CGPA;

    public Student() {
        super();
    }

    public Student(String name, double cGPA) {
        super(name);
        CGPA = cGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double cGPA) {
        CGPA = cGPA;
    }

    public Boolean isOutstanding() {
        if (CGPA > 3.5) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Student [CGPA=" + CGPA + "]";
    }

}

class Professor extends Person {
    private int numberOfPublications;

    public Professor() {
        super();
    }

    public Professor(String name, int numberOfPublications) {
        super(name);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }

    public Boolean isOutstanding() {
        if (numberOfPublications > 50) {
            return true;
        } else {
            return false; 
        }
    }

    @Override
    public String toString() {
        return "Professor [numberOfPublications=" + numberOfPublications + "]";
    }
}

public class L8T2 {
    public static void main (String args []) {
        Person arr[] = new Person[2];
        arr[0] = new Student("Ali,", 3.92);
        arr[1] = new Professor("Maryam", 100);
        System.out.println("Is Student outstanding? " + arr[0].isOutstanding());
        System.out.println("Is Professor outstanding? " + arr[1].isOutstanding());

        Person p1 = new Student("Arthur", 4);
        Person p2 = new Professor("Dutch", 0);

        System.out.println(p1.isOutstanding());
        System.out.println(p2.isOutstanding());
        
        Person arr2[] = new Person[]{p1, p2};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i].isOutstanding());
        }

    }
}
