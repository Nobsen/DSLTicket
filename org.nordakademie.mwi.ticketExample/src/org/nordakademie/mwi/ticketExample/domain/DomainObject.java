package org.nordakademie.mwi.ticketExample.domain;

import java.util.Calendar;

public interface DomainObject {

    public Long getId();

    public Calendar getCreated();

    public int getVersion();

    public void setVersion(int version);

    // Hibernate only //
    
    public void setId(Long id);

    public void setCreated(Calendar created);
}
