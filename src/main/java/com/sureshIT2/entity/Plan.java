package com.sureshIT2.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="PLAN_MASTER")
public class Plan {
	
	
	@Id
	@GeneratedValue
	@Column(name="PLAN_ID")
	private Integer planId;
	
	@Column(name="PLAN_NAME")
	private String planName;
	
	@Column(name="ACTIVE_SW")
	private String activeSw;
	
	@Column(name="PLANSTART_DATE")
	private String planStartDate;
	
	@Column(name="PLANEND_DATE")
	private String planEndDate;
	
	@Column(name="PLANCATEGORY_ID")
	private String PlanCategoryId;
	
	
	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Column(name="UPDATED_BY")
	private String updatedBy;
	
	@Column(name="Created_DATE",updatable=false)
	@CreationTimestamp
	private LocalDate CreateDate;
	
	@Column(name="UPDATED_DATE",insertable=false)
	@UpdateTimestamp
	private LocalDate updateDate;

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getActiveSw() {
		return activeSw;
	}

	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}

	public String getPlanStartDate() {
		return planStartDate;
	}

	public void setPlanStartDate(String planStartDate) {
		this.planStartDate = planStartDate;
	}

	public String getPlanEndDate() {
		return planEndDate;
	}

	public void setPlanEndDate(String planEndDate) {
		this.planEndDate = planEndDate;
	}

	public String getPlanCategoryId() {
		return PlanCategoryId;
	}

	public void setPlanCategoryId(String planCategoryId) {
		PlanCategoryId = planCategoryId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDate getCreateDate() {
		return CreateDate;
	}

	public void setCreateDate(LocalDate createDate) {
		CreateDate = createDate;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "Plan [planId=" + planId + ", planName=" + planName + ", activeSw=" + activeSw + ", planStartDate="
				+ planStartDate + ", planEndDate=" + planEndDate + ", PlanCategoryId=" + PlanCategoryId + ", createdBy="
				+ createdBy + ", updatedBy=" + updatedBy + ", CreateDate=" + CreateDate + ", updateDate=" + updateDate
				+ "]";
	}

	
	
		
	}
	 
	
	
	
	
	


