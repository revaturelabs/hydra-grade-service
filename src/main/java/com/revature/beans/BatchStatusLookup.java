package com.revature.beans;

import java.io.Serializable;

public class BatchStatusLookup implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int batchStatusID;
	private String batchStatusName;

	public BatchStatusLookup(){
		super();
	}
	
	public BatchStatusLookup(int batchStatusID, String batchStatusName) {
		super();
		this.batchStatusID = batchStatusID;
		this.batchStatusName = batchStatusName;
	}
	
	public int getBatchStatusID() {
		return batchStatusID;
	}

	public void setBatchStatusID(int batchStatusID) {
		this.batchStatusID = batchStatusID;
	}

	public String getBatchStatusName() {
		return batchStatusName;
	}

	public void setBatchStatusName(String batchStatusName) {
		this.batchStatusName = batchStatusName;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + batchStatusID;
		result = prime * result + ((batchStatusName == null) ? 0 : batchStatusName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BatchStatusLookup other = (BatchStatusLookup) obj;
		if (batchStatusID != other.batchStatusID)
			return false;
		if (batchStatusName == null) {
			if (other.batchStatusName != null)
				return false;
		} else if (!batchStatusName.equals(other.batchStatusName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BatchStatusLookup [batchStatusID=" + batchStatusID + ", batchStatusName=" + batchStatusName + "]";
	}	
	
}