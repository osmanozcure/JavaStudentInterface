public class Student implements StudentInterface {
    // initialize the variables
    private String name, department, dream;
    private int age;
    // here float or double can be used interchangeably, however, float is more memory efficient
    private float GPA;

    // create a constructor for Student class
    public Student(String name, String department, String dream, int age, float GPA) {
        this.name = name;
        this.department = department;
        this.dream = dream;
        this.age = age;
        this.GPA = GPA;
    }

    //getters and setters for Student class
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDream() {
        return dream;
    }

    public void setDream(String dream) {
        this.dream = dream;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    // implementations of StudentInterface methods, here methods are overrode

    @Override
    public String introduce() {
        return "Hello, my name is " +getName()
                + " ,I'm " +getAge() + " years old"
                + " ,my department is " +getDepartment()
                + " ,my GPA is " +getGPA()
                + " and my dream is " +getDream();
    }

    @Override
    public String greet() {
        return "Hello";
    }

    @Override
    public String doSports(String sportsProgram, int duration) {
        return "Doing " +sportsProgram
                + " for " +duration
                + " minutes";
    }

    @Override
    public String study(String lesson, int duration) {
        return "Studying " + lesson
                + " for " + duration
                + " minutes";
    }



    // toString method for Student class
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", dream='" + dream + '\'' +
                ", age=" + age +
                ", GPA=" + GPA +
                '}';
    }
}
