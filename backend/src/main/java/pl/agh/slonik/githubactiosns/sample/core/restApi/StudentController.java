package pl.agh.slonik.githubactiosns.sample.core.restApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.agh.slonik.githubactiosns.sample.core.model.Student;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> students = Arrays.asList(new Student("Jan","Kowalski", "id1"), new Student("Papa","Słoń", "id2"), new Student("Mariusz","Pudzianowski", "id3"));

    @GetMapping("/students")
    List<Student> all() {
        return students;
    }

}
