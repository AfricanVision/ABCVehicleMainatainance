package com.abc.vehiclemainatenance.service;

import com.abc.vehiclemainatenance.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abc.vehiclemainatenance.dto.ModelIncome;
import com.abc.vehiclemainatenance.dto.OwnerStats;
import com.abc.vehiclemainatenance.dto.ServiceInfo;

import java.util.List;

@Service
public class ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    public List<ServiceInfo> getAllServiceActivities() {
        return serviceRepository.findAllServiceActivities();
    }

    public List<OwnerStats> getOwnerServiceStats() {
        return serviceRepository.findOwnerServiceStats();
    }

    public List<ModelIncome> getVehicleModelIncomeStats() {
        return serviceRepository.findVehicleModelIncomeStats();
    }
}
