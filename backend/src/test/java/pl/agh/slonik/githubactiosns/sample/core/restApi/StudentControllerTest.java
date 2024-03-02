package pl.agh.slonik.githubactiosns.sample.core.restApi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import pl.agh.slonik.githubactiosns.sample.core.model.Student;
import pl.agh.slonik.githubactiosns.sample.core.restApi.StudentController;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.util.AssertionErrors.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StudentController.class)
public class StudentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAllStudents() throws Exception {
        // prepare
        List<Student> students = Arrays.asList(
                new Student("Jan", "Kowalski", "id1"),
                new Student("Papa", "Słoń", "id2"),
                new Student("Mariusz", "Pudzianowski", "id3")
        );

        // perform
        String result = mockMvc.perform(get("/students"))
                .andExpect(status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString();

        // assert
        students.forEach( student -> {
            assertTrue("contains name of " + student.toString(),result.contains(student.getName()));
        });
    }
}
