package com.sureshIT2.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sureshIT2.entity.Plan;

public interface PlanRepo extends JpaRepository <Plan , Serializable> {

}
