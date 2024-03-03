package pl.agh.slonik.githubactiosns.sample.core.model;

import org.junit.jupiter.api.Test;
import org.mockito.internal.util.StringUtil;
import org.springframework.util.Assert;

public class StudentTest {

    @Test
    public void toStringTest(){

//      prepare
        String name = "kuba";
        String surname = "nowakowski";
        String id = "id2";

//      perform
        Student student = new Student(name,surname,id);

        String results = student.toString();

//      assert

        Assert.isTrue(results.contains(name),"Test if to string contains name");
        Assert.isTrue(results.contains(surname),"Test if to string contains surname");
        Assert.isTrue(results.contains(id),"Test if to string contains id");
    }
}
