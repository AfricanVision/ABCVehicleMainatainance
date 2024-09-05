package com.abc.vehiclemainatenance.repository;

import com.abc.vehiclemainatenance.dto.ModelIncome;
import com.abc.vehiclemainatenance.dto.OwnerStats;
import com.abc.vehiclemainatenance.dto.ServiceInfo;
import com.abc.vehiclemainatenance.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {

    @Query("SELECT new com.abc.vehiclemainatenance.dto.ServiceInfo(s.serviceType, v.model, v.registration, o.name, s.cost, s.serviceDate) "
            + "FROM Service s JOIN s.vehicle v JOIN v.owner o ORDER BY s.serviceDate")
    List<ServiceInfo> findAllServiceActivities();

    @Query("SELECT new com.abc.vehiclemainatenance.dto.OwnerStats(o.name, COUNT(s), SUM(s.cost)) "
            + "FROM Service s JOIN s.vehicle v JOIN v.owner o GROUP BY o.id ORDER BY SUM(s.cost) DESC")
    List<OwnerStats> findOwnerServiceStats();

    @Query("SELECT new com.abc.vehiclemainatenance.dto.ModelIncome(v.model, COUNT(s), SUM(s.cost)) "
            + "FROM Service s JOIN s.vehicle v GROUP BY v.model ORDER BY COUNT(s) DESC")
    List<ModelIncome> findVehicleModelIncomeStats();
}
