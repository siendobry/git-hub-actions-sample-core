package pl.agh.slonik.githubactiosns.sample.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.agh.slonik.githubactiosns.sample.core.model.Student;

@SpringBootApplication
public class GitHubActiosnsSampleCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitHubActiosnsSampleCoreApplication.class, args);

        Student student =  new Student("Kuba","Nowakowski","cokowlwiek");

        System.out.println(student.toString());
    }



}
