package demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Address {
    private String city;
    private String country;
    private Integer pin;
}