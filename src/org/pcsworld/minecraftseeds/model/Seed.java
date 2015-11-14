package org.pcsworld.minecraftseeds.model;

import java.util.Date;

public class Seed {
	/*  Fields from issue 3
	 * 
	 * 
	 * Required values to be saved
SeedID (PK, autogen)
SeedName
Minecraft platform (PC, PE, XBox)
Submitter
	 */
	private int seedId;
	private String seedName;
	private String seedValue;
	private String platform;
	private String submitter;
	private Date lastModified;
	private Date created;
	
	public Seed() {
		
	}
	public Seed(int seedId, String seedName, String seedValue, String platform, String submitter, Date lastModified,
			Date created) {
		super();
		this.seedId = seedId;
		this.seedName = seedName;
		this.seedValue = seedValue;
		this.platform = platform;
		this.submitter = submitter;
		this.lastModified = lastModified;
		this.created = created;
	}
	
	/**
	 * @return the seedId
	 */
	public int getSeedId() {
		return seedId;
	}
	/**
	 * @param seedId the seedId to set
	 */
	public void setSeedId(int seedId) {
		this.seedId = seedId;
	}

	/**
	 * @return the seedName
	 */
	public String getSeedName() {
		return seedName;
	}
	/**
	 * @param seedName the seedName to set
	 */
	public void setSeedName(String seedName) {
		this.seedName = seedName;
	}
	/**
	 * @return the seedValue
	 */
	public String getSeedValue() {
		return seedValue;
	}
	/**
	 * @param seedValue the seedValue to set
	 */
	public void setSeedValue(String seedValue) {
		this.seedValue = seedValue;
	}
	/**
	 * @return the platform
	 */
	public String getPlatform() {
		return platform;
	}
	/**
	 * @param platform the platform to set
	 */
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	/**
	 * @return the submitter
	 */
	public String getSubmitter() {
		return submitter;
	}
	/**
	 * @param submitter the submitter to set
	 */
	public void setSubmitter(String submitter) {
		this.submitter = submitter;
	}
	/**
	 * @return the lastModified
	 */
	public Date getLastModified() {
		return lastModified;
	}
	/**
	 * @param lastModified the lastModified to set
	 */
	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}
	/**
	 * @return the created
	 */
	public Date getCreated() {
		return created;
	}
	/**
	 * @param created the created to set
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

}
