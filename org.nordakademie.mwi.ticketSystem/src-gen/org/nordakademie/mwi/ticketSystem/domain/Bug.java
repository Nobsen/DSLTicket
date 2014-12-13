package org.nordakademie.mwi.ticketSystem.domain;

import java.util.Calendar;
import org.springframework.format.annotation.DateTimeFormat;
import org.nordakademie.mwi.ticketSystem.flows.BugFlow;
import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.persistence.Entity;

@Entity
public class Bug extends AbstractDomainObject {

	BugFlow currentFlowState;

	
	@NotBlank
	private String titel;
	
	@NotBlank
	private String description;
	
	private CategorieEnum categorie;
	
	@NotNull
	private String creator;
	
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Calendar expectedResolutionDate;
	
	private Double expectedEffortInHours;
	
	private OperatingSystemEnum operatingSystem;
	
	private Integer noOfCalls;
	
	private String phoneNo;
	
	private String eMail;
	
	@DateTimeFormat(pattern = "dd.MM.yyyy HH:mm")
	private Calendar solveDate;

    public Bug () {}
    
    public String getTitel() {
    	return titel;
    }
    
    public void setTitel(String titel) {
     	this.titel = titel;
    }
    public String getDescription() {
    	return description;
    }
    
    public void setDescription(String description) {
     	this.description = description;
    }
    public CategorieEnum getCategorie() {
    	return categorie;
    }
    
    public void setCategorie(CategorieEnum categorie) {
     	this.categorie = categorie;
    }
    public String getCreator() {
    	return creator;
    }
    
    public void setCreator(String creator) {
     	this.creator = creator;
    }
    public Calendar getExpectedResolutionDate() {
    	return expectedResolutionDate;
    }
    
    public void setExpectedResolutionDate(Calendar expectedResolutionDate) {
     	this.expectedResolutionDate = expectedResolutionDate;
    }
    public Double getExpectedEffortInHours() {
    	return expectedEffortInHours;
    }
    
    public void setExpectedEffortInHours(Double expectedEffortInHours) {
     	this.expectedEffortInHours = expectedEffortInHours;
    }
    public OperatingSystemEnum getOperatingSystem() {
    	return operatingSystem;
    }
    
    public void setOperatingSystem(OperatingSystemEnum operatingSystem) {
     	this.operatingSystem = operatingSystem;
    }
    public Integer getNoOfCalls() {
    	return noOfCalls;
    }
    
    public void setNoOfCalls(Integer noOfCalls) {
     	this.noOfCalls = noOfCalls;
    }
    public String getPhoneNo() {
    	return phoneNo;
    }
    
    public void setPhoneNo(String phoneNo) {
     	this.phoneNo = phoneNo;
    }
    public String getEMail() {
    	return eMail;
    }
    
    public void setEMail(String eMail) {
     	this.eMail = eMail;
    }
    public Calendar getSolveDate() {
    	return solveDate;
    }
    
    public void setSolveDate(Calendar solveDate) {
     	this.solveDate = solveDate;
    }

	public BugFlow getCurrentFlowState() {
	  		return currentFlowState;
	}
	
	public void setCurrentFlowState(BugFlow currentFlowState) {
	 	this.currentFlowState = currentFlowState;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
			
		Bug other = (Bug) obj;
		if (titel == null) {
		if (other.titel != null)
			return false;
		} else if (!titel.equals(other.titel))
			return false;
		if (description == null) {
		if (other.description != null)
			return false;
		} else if (!description.equals(other.description))
			return false;
		if (categorie == null) {
		if (other.categorie != null)
			return false;
		} else if (!categorie.equals(other.categorie))
			return false;
		if (creator == null) {
		if (other.creator != null)
			return false;
		} else if (!creator.equals(other.creator))
			return false;
		if (expectedResolutionDate == null) {
		if (other.expectedResolutionDate != null)
			return false;
		} else if (!expectedResolutionDate.equals(other.expectedResolutionDate))
			return false;
		if (expectedEffortInHours == null) {
		if (other.expectedEffortInHours != null)
			return false;
		} else if (!expectedEffortInHours.equals(other.expectedEffortInHours))
			return false;
		if (operatingSystem == null) {
		if (other.operatingSystem != null)
			return false;
		} else if (!operatingSystem.equals(other.operatingSystem))
			return false;
		if (noOfCalls == null) {
		if (other.noOfCalls != null)
			return false;
		} else if (!noOfCalls.equals(other.noOfCalls))
			return false;
		if (phoneNo == null) {
		if (other.phoneNo != null)
			return false;
		} else if (!phoneNo.equals(other.phoneNo))
			return false;
		if (eMail == null) {
		if (other.eMail != null)
			return false;
		} else if (!eMail.equals(other.eMail))
			return false;
		if (solveDate == null) {
		if (other.solveDate != null)
			return false;
		} else if (!solveDate.equals(other.solveDate))
			return false;
		
		return true;
	}


}
