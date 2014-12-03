package org.nordakademie.mwi.ticketExample.domain;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;


@MappedSuperclass
public abstract class AbstractDomainObject implements DomainObject {

    /**
     * Identifier.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Date of creation.
     */
    @Basic(optional = false)
    private Calendar created;

    // TODO ggf raus nehmen
    /**
     * Version-Information (used for locking).
     */
    @Version
    @Column(name = "optlock", nullable = false)
    private int version;

    /**
     * Hidden standard constructor to be used by Hibernate only.
     */
    protected AbstractDomainObject() {
        created = Calendar.getInstance();
    }

    /**
     * Returns the identifier.
     * 
     * @return Identifier.
     */
    @Override
    public Long getId() {
        return id;
    }

    /**
     * Returns the date of creation.
     * 
     * @return Date of creation.
     */
    @Override
    public Calendar getCreated() {
        return created;
    }

    /**
     * Returns the version information.
     * 
     * @return Version information.
     */
    @Override
    public int getVersion() {
        return version;
    }

    /**
     * Sets the version information.
     * 
     * @param version Version Information.
     */
    @Override
    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        // has to be overridden by concrete subclasses
        return "id=" + getId();
    }

    // //////////////////////////////// to be used by Hibernate only ////////////////////////////////////

    /**
     * Sets the identifier.
     * 
     * @param id Identifier.
     */
    @Override
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Sets the date of creation.
     * 
     * @param created Date of creation.
     */
    @Override
    public void setCreated(Calendar created) {
        this.created = created;
    }
    
	@Override
	public abstract boolean equals(Object obj);

}
