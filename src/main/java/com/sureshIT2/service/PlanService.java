package com.sureshIT2.service;

import java.util.List;
import java.util.Map;

import com.sureshIT2.entity.Plan;

public interface PlanService {
	
	public Map<Integer, String> getPlanCategories();

	public boolean savePlan(Plan plan);

	public List<Plan> getAllPlans();

	public Plan getPlanById(Integer planId);
	
	public boolean updatePlan (Plan plan);
	
	public boolean deletePlanById(Integer planId);
	
	public boolean planStatusChange (Integer planId, String status);
	
	
	
	
	
	
	

}
