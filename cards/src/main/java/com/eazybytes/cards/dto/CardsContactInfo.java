package com.eazybytes.cards.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "cards")
@Getter
@Setter
public class CardsContactInfo {
    private String message;
    private Map<String,String> ContactDetails;
    private List<String> OnCallSupport;
}
