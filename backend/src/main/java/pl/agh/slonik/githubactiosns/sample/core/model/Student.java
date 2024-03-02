package pl.agh.slonik.githubactiosns.sample.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Student {
    @ToString.Include
    private String name;
    @ToString.Include
    private String Surname;
    @ToString.Include
    private String id;
}
