package com.djachtoma.reference.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
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
