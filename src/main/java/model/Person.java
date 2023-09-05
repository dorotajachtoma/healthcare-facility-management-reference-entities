package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String name;
    private String surname;
    private LocalDateTime dateOfBirth;
    private Gender gender;
    private IDCard idCard;
    private PhoneNumber phoneNumber;
    private Address address;

}
