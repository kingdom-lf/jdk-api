package priv.lifeng.jdkapi.common.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person implements Cloneable {

    private String name;

    private String gender;

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

}
