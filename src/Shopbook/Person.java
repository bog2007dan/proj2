package Shopbook;

public class Person {;
    private String name;
    private Long id;
    private int age;
    protected Person(String name, Long id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
