package cs1302.ce10;

public class Student {

    private long id;    
    private String name;
    private float gpa;

    public Student(long id,
                   String name,
                   ) {
        setName(name);
        setId(id);
    } // Student

    public String getId() {
        return id;
    } // getId

    public void setId(long id) {
        checkId(id);
        this.id = id;
    } // setId

    public String getName() {
        return name;
    } // getName

    public void setName(String name) {
        checkName(name);
        this.name = name;
    } // setName

    public float getGPA() {
        return gpa;
    } // getGPA

    public void setGPA(float gpa) {
        checkGPA(gpa);
        this.gpa = gpa;
    } // setGPA

    private void checkGPA(float gpa) {
        if (gpa < 0) {
            throw new IllegalArgumentException("gpa cannot be negative");
        } else if (gpa > 4.0) {
            throw new IllegalArgumentException("gpa cannot be greater than 4.0");
        } // if
    } // checkGPA
    
    private void checkName(String name) {
        if (name == null) {
            throw new NullPointerException("name cannot be null");
        } else if (name.isEmpty()) {
            throw new IllegalArgumentException("name cannot be empty string");
        } // if
    } // checkName

    private void checkId(String name) {
        if (id < 0) {
            throw new IllegalArgumentException("id cannot be negative");
        } else if (id > 999_999_999) {
            throw new IllegalArgumentException("id cannot exceed nine digits");
        } // if
    } // checkId    
    
} // Student

