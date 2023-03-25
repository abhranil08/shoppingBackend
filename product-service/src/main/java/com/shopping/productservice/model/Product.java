package com.shopping.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value = "product-service")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product {

    //Id-> unique identifier
    @Id
    private String Id;
    private String name;
    private String description;
    private BigDecimal price;

    
}
