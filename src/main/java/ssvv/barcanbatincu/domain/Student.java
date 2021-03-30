package ssvv.barcanbatincu.domain;

public class Student {
    private long id;
    private String name;
    private String group;

    public Student() {
        this.id = -1;
        this.name = "";
        this.group = "";
    }

    public Student(long id, String name, String group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
