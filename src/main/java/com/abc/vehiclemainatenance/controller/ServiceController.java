package com.abc.vehiclemainatenance.controller;

import com.abc.vehiclemainatenance.dto.ModelIncome;
import com.abc.vehiclemainatenance.dto.OwnerStats;
import com.abc.vehiclemainatenance.dto.ServiceInfo;
import com.abc.vehiclemainatenance.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/services")
public class ServiceController {
    @Autowired
    private ServiceService serviceService;

    @GetMapping("/activities")
    public List<ServiceInfo> getServiceActivities() {
        return serviceService.getAllServiceActivities();
    }

    @GetMapping("/owner-stats")
    public List<OwnerStats> getOwnerServiceStats() {
        return serviceService.getOwnerServiceStats();
    }

    @GetMapping("/model-income")
    public List<ModelIncome> getModelIncomeStats() {
        return serviceService.getVehicleModelIncomeStats();
    }
}
