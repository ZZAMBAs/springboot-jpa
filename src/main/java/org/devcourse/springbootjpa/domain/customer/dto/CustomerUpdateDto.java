package org.devcourse.springbootjpa.domain.customer.dto;

public record CustomerUpdateDto(Long id,
                                String firstName,
                                String lastName) {
}