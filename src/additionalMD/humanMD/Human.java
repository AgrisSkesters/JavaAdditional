package additionalMD.humanMD;

//do not use latvian acronyms and capital letter in package name
//move your homework to packages like homework3, homework4 etc.
public class Human {

    private String name;
    private int age;

    public void setName(String name) {this.name = name;}

    public void setAge(int age) {this.age = age;}

    public void sayHi() {
        System.out.println("Hi! My name is " + name);
        System.out.println("I'm " + age + " years old");
    }


}

