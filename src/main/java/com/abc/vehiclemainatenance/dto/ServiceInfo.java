package com.abc.vehiclemainatenance.dto;

import java.time.LocalDateTime;

public class ServiceInfo {
    private String serviceType;
    private String model;
    private String registration;
    private String ownerName;
    private Double cost;
    private LocalDateTime serviceDate;

    public ServiceInfo(String serviceType, String model, String registration, String ownerName, Double cost, LocalDateTime serviceDate) {
        this.serviceType = serviceType;
        this.model = model;
        this.registration = registration;
        this.ownerName = ownerName;
        this.cost = cost;
        this.serviceDate = serviceDate;
    }

    // Getters and Setters
}