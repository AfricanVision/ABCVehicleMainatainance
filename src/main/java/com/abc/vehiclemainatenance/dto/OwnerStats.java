package com.abc.vehiclemainatenance.dto;

public class OwnerStats {
    private String ownerName;
    private Long serviceCount;
    private Double totalSpent;

    public OwnerStats(String ownerName, Long serviceCount, Double totalSpent) {
        this.ownerName = ownerName;
        this.serviceCount = serviceCount;
        this.totalSpent = totalSpent;
    }

    // Getters and Setters
}
