package Lad7;

public class Student {
    //attributes
    private String name;
    private String s_id;
    private String s_level;
    private int age;
    //constructor

    public Student(String name, String s_id, String s_level, int age) {
        this.name = name;
        this.s_id = s_id;
        this.s_level = s_level;
        this.age = age;
    }

    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getS_level() {
        return s_level;
    }

    public void setS_level(String s_level) {
        this.s_level = s_level;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //toString

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", s_id='" + s_id + '\'' +
                ", s_level='" + s_level + '\'' +
                ", age=" + age +
                '}';
    }
}
