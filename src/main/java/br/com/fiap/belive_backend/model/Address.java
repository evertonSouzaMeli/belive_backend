package br.com.fiap.belive_backend.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
    private String street;

    private String district;

    private String city;

    private String state;

    private String zipCode;
}
