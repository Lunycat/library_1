package org.example.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private Long id;

    @Pattern(regexp = "[А-Я]\\w+\\s[А-Я]\\w+\\s[А-Я]\\w+",
            message = "Полное имя должно соотвествовать следующему патерну: Имя Фамилия Отчество")
    private String fullName;

    @Min(value = 1900, message = "Год рождения не может быть меньше 1900 года")
    private Integer age;
}
