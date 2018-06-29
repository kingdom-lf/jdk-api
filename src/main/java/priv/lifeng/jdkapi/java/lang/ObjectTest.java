package priv.lifeng.jdkapi.java.lang;

import org.junit.Test;

import priv.lifeng.jdkapi.common.pojo.Person;
import priv.lifeng.jdkapi.common.pojo.Student;

public class ObjectTest {

    @Test
    public void clone_Test() throws CloneNotSupportedException {
        Person person1 = new Person();
        person1.setName("john");
        person1.setGender("man");

        Person person2 = (Person) person1.clone();
        System.out.println("persion1 = " + person1);
        System.out.println("persion2 = " + person2);

        System.out.println(person1.getName().hashCode() + " - " + person2.getName().hashCode());
    }

    @Test
    public void getClass_Test() {
        Student student = new Student();
        student.setName("xiaoming");
        student.setGender("man");
        student.setGrade("grade six");

        Class<? extends Person> c = student.getClass();
        System.out.println(c);
    }

    @Test
    public void hashCode_Test() {
        Person person = new Person();
        System.out.println(person + " , hashCode = " + person.hashCode());
        System.out.println("Object identityHashCode = " + System.identityHashCode(person));
    }

    @Test
    public void notify_Test() {
        final Object lock = new Object();

        try {
            lock.notify();
        } catch (Exception e) {
            System.out.println("main thread unget lock notify exception " + e);
            e.printStackTrace();
        }

    }

}
