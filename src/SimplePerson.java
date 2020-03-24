import java.util.Objects;

public class SimplePerson {
    private String name;

    private float age;

    public SimplePerson() {}

    public SimplePerson(String name, float age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public SimplePerson setName(String name) {
        this.name = name;
        return this;
    }

    public float getAge() {
        return age;
    }

    public SimplePerson setAge(float age) {
        this.age = age;
        return this;
    }

    public void print(){
        System.out.print("name:" + name + "; age: " + age + ";\n");
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        SimplePerson that = (SimplePerson) o;
//        return Float.compare(that.age, age) == 0 &&
//                Objects.equals(name, that.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
}
