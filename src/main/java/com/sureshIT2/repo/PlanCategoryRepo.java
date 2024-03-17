package com.sureshIT2.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sureshIT2.entity.PlanCategory;

public interface PlanCategoryRepo extends JpaRepository<PlanCategory , Serializable> {

} 
 
