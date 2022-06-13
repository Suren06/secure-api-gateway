package com.secureapigateway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class ApiKey {

    private String key;
    private List<String> services;
}
