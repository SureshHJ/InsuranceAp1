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
@Table(name="PLAN_CATEGORY")
public class PlanCategory {
	@Id
	@GeneratedValue
	@Column(name="CATEGORY_ID")
	private Integer categoryID;
	
	@Column(name="CATEGORY_NAME")
	private String categoryName;
	
	@Column(name="ACTIVE_SW")
	private String  activeSw;
	
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

	public Integer getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getActiveSw() {
		return activeSw;
	}

	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
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
		return "PlanCategory [categoryID=" + categoryID + ", categoryName=" + categoryName + ", activeSw=" + activeSw
				+ ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + ", CreateDate=" + CreateDate
				+ ", updateDate=" + updateDate + "]";
	}

	
	



	
	 
	
	

}
