package com.sureshIT2.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sureshIT2.entity.Plan;
import com.sureshIT2.entity.PlanCategory;
import com.sureshIT2.repo.PlanCategoryRepo;
import com.sureshIT2.repo.PlanRepo;

@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanRepo planRepo;

    @Autowired
    private PlanCategoryRepo planCategoryRepo;

    @Override
    public Map<Integer, String> getPlanCategories() {
        List<PlanCategory> categories = planCategoryRepo.findAll();
        Map<Integer, String> categoryMap = new HashMap<>();
        categories.forEach(c -> categoryMap.put(c.getCategoryID(), c.getCategoryName()));
        return categoryMap;
    }

    @Override
    public boolean savePlan(Plan plan) {
        Plan saved = planRepo.save(plan);
        return saved.getPlanId() != null;
    }

    @Override
    public List<Plan> getAllPlans() {
        return planRepo.findAll();
    }

    @Override
    public Plan getPlanById(Integer planId) {
        Optional<Plan> findById = planRepo.findById(planId);
        return findById.orElse(null);
    }

    @Override
    public boolean updatePlan(Plan plan) {
        planRepo.save(plan);
        return plan.getPlanId() != null;
    }

    @Override
    public boolean deletePlanById(Integer planId) {
        planRepo.deleteById(planId);
        return true; // Assuming if no exception occurs, deletion is successful
    }

    @Override
    public boolean planStatusChange(Integer planId, String status) {
        Optional<Plan> findById = planRepo.findById(planId);

        if (findById.isPresent()) {
            Plan plan = findById.get();
            plan.setActiveSw(status);
            planRepo.save(plan);
            return true;
        }
        return false;
    }
}
