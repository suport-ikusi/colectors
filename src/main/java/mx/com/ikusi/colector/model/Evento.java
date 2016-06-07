package mx.com.ikusi.colector.model;

import java.util.Date;

public class Evento {
	
	private Long dbId;
	
	private String uei;
	
	private Date dateTime;
	
	private String description;
	
	private String host;
	
	private String ip;
	
	private String severity;
	
	private Long nodeId;
	
	private String uuid;

	/**
	 * @return the dbId
	 */
	public Long getDbId() {
		return dbId;
	}

	/**
	 * @param dbId the dbId to set
	 */
	public void setDbId(Long dbId) {
		this.dbId = dbId;
	}

	/**
	 * @return the uei
	 */
	public String getUei() {
		return uei;
	}

	/**
	 * @param uei the uei to set
	 */
	public void setUei(String uei) {
		this.uei = uei;
	}

	/**
	 * @return the dateTime
	 */
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @param host the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}

	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * @return the severity
	 */
	public String getSeverity() {
		return severity;
	}

	/**
	 * @param severity the severity to set
	 */
	public void setSeverity(String severity) {
		this.severity = severity;
	}

	/**
	 * @return the nodeId
	 */
	public Long getNodeId() {
		return nodeId;
	}

	/**
	 * @param nodeId the nodeId to set
	 */
	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
	}

	/**
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Evento [dbId=" + dbId + ", uei=" + uei + ", dateTime=" + dateTime + ", description=" + description
				+ ", host=" + host + ", ip=" + ip + ", severity=" + severity + ", nodeId=" + nodeId + ", uuid=" + uuid
				+ "]";
	}
	
	
	

}
