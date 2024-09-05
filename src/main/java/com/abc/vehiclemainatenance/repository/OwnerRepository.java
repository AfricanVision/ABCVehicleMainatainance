package com.abc.vehiclemainatenance.repository;

import com.abc.vehiclemainatenance.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {}
