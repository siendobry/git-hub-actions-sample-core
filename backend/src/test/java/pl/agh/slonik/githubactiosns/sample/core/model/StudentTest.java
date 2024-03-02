package pl.agh.slonik.githubactiosns.sample.core.model;

import org.junit.jupiter.api.Test;
import org.mockito.internal.util.StringUtil;
import org.springframework.util.Assert;

public class StudentTest {

    @Test
    public void toStringTest(){

//        prepare
        String name = "kuba";
        String surname = "nowakowski";
        String id = "id2";

//      perform
        Student student = new Student(name,surname,id);

        String results = student.toString();

//      assert

        Assert.isTrue(results.contains(name),"name");
        Assert.isTrue(results.contains(surname),"surname");
        Assert.isTrue(results.contains(id),"id");


    }
}
