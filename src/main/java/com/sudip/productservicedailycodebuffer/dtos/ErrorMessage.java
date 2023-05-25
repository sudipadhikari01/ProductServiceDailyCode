package com.sudip.productservicedailycodebuffer.dtos;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class ErrorMessage {
    private String message;
    private HttpStatus httpStatus;
}
