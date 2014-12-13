package org.nordakademie.mwi.ticketSystem.domain;

import java.util.Calendar;
import org.springframework.format.annotation.DateTimeFormat;
import org.nordakademie.mwi.ticketSystem.flows.HolidayFlow;
import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.persistence.Entity;

@Entity
public class HolidayRequest extends AbstractDomainObject {

	HolidayFlow currentFlowState;

	
	@NotBlank
	private String description;
	
	@DateTimeFormat(pattern = "dd.MM.yyyy HH:mm")
	@NotNull
	private Calendar dateFrom;
	
	@DateTimeFormat(pattern = "dd.MM.yyyy HH:mm")
	@NotNull
	private Calendar dateUntil;
	
	@NotNull
	private String creator;
	
	@NotNull
	private Boolean accessible;
	
	private String phoneNo;
	
	private String eMail;

    public HolidayRequest () {}
    
    public String getDescription() {
    	return description;
    }
    
    public void setDescription(String description) {
     	this.description = description;
    }
    public Calendar getDateFrom() {
    	return dateFrom;
    }
    
    public void setDateFrom(Calendar dateFrom) {
     	this.dateFrom = dateFrom;
    }
    public Calendar getDateUntil() {
    	return dateUntil;
    }
    
    public void setDateUntil(Calendar dateUntil) {
     	this.dateUntil = dateUntil;
    }
    public String getCreator() {
    	return creator;
    }
    
    public void setCreator(String creator) {
     	this.creator = creator;
    }
    public Boolean getAccessible() {
    	return accessible;
    }
    
    public void setAccessible(Boolean accessible) {
     	this.accessible = accessible;
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

	public HolidayFlow getCurrentFlowState() {
	  		return currentFlowState;
	}
	
	public void setCurrentFlowState(HolidayFlow currentFlowState) {
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
			
		HolidayRequest other = (HolidayRequest) obj;
		if (description == null) {
		if (other.description != null)
			return false;
		} else if (!description.equals(other.description))
			return false;
		if (dateFrom == null) {
		if (other.dateFrom != null)
			return false;
		} else if (!dateFrom.equals(other.dateFrom))
			return false;
		if (dateUntil == null) {
		if (other.dateUntil != null)
			return false;
		} else if (!dateUntil.equals(other.dateUntil))
			return false;
		if (creator == null) {
		if (other.creator != null)
			return false;
		} else if (!creator.equals(other.creator))
			return false;
		if (accessible == null) {
		if (other.accessible != null)
			return false;
		} else if (!accessible.equals(other.accessible))
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
		
		return true;
	}


}
