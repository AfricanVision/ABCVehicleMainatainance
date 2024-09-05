package com.abc.vehiclemainatenance.dto;

public class ModelIncome {
    private String model;
    private Long serviceCount;
    private Double totalIncome;

    public ModelIncome(String model, Long serviceCount, Double totalIncome) {
        this.model = model;
        this.serviceCount = serviceCount;
        this.totalIncome = totalIncome;
    }

    // Getters and Setters
}
