package com.devi.web.model;

import java.util.Date;

public class Batch {

	private int BATCH_ID;
	private String PARTICIPANT_NAME;
	private int TRAINER_ID;
	private int COURSE_ID;
	private Date START_DATE;
	private Date END_DATE;
	/**
	 * @return the bATCH_ID
	 */
	public int getBATCH_ID() {
		return BATCH_ID;
	}
	/**
	 * @param bATCH_ID the bATCH_ID to set
	 */
	public void setBATCH_ID(int bATCH_ID) {
		BATCH_ID = bATCH_ID;
	}
	/**
	 * @return the pARTICIPANT_NAME
	 */
	public String getPARTICIPANT_NAME() {
		return PARTICIPANT_NAME;
	}
	/**
	 * @param pARTICIPANT_NAME the pARTICIPANT_NAME to set
	 */
	public void setPARTICIPANT_NAME(String pARTICIPANT_NAME) {
		PARTICIPANT_NAME = pARTICIPANT_NAME;
	}
	/**
	 * @return the tRAINER_ID
	 */
	public int getTRAINER_ID() {
		return TRAINER_ID;
	}
	/**
	 * @param tRAINER_ID the tRAINER_ID to set
	 */
	public void setTRAINER_ID(int tRAINER_ID) {
		TRAINER_ID = tRAINER_ID;
	}
	/**
	 * @return the cOURSE_ID
	 */
	public int getCOURSE_ID() {
		return COURSE_ID;
	}
	/**
	 * @param cOURSE_ID the cOURSE_ID to set
	 */
	public void setCOURSE_ID(int cOURSE_ID) {
		COURSE_ID = cOURSE_ID;
	}
	/**
	 * @return the sTART_DATE
	 */
	public Date getSTART_DATE() {
		return START_DATE;
	}
	/**
	 * @param sTART_DATE the sTART_DATE to set
	 */
	public void setSTART_DATE(Date sTART_DATE) {
		START_DATE = sTART_DATE;
	}
	/**
	 * @return the eND_DATE
	 */
	public Date getEND_DATE() {
		return END_DATE;
	}
	/**
	 * @param eND_DATE the eND_DATE to set
	 */
	public void setEND_DATE(Date eND_DATE) {
		END_DATE = eND_DATE;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Batch [BATCH_ID=" + BATCH_ID + ", PARTICIPANT_NAME=" + PARTICIPANT_NAME + ", TRAINER_ID=" + TRAINER_ID
				+ ", COURSE_ID=" + COURSE_ID + ", START_DATE=" + START_DATE + ", END_DATE=" + END_DATE + "]";
	}
	
	
}
