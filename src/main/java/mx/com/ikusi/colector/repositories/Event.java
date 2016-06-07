package mx.com.ikusi.colector.repositories;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="events")
public class Event {
	
	@Id
	@GeneratedValue
	private   Integer eventId;
	
	private String eventUei;

	private Integer nodeId; 
	
	private Date eventTime;
	
	private String eventHost;

	private String eventSource;
	
	private String ipAddr;
	
	private String eventDescr;
	
	private String eventParms;

	/**
	 * @return the eventId
	 */
	@Column(name="eventid")
	public Integer getEventId() {
		return eventId;
	}

	/**
	 * @param eventId the eventId to set
	 */
	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	/**
	 * @return the eventUei
	 */
	@Column(name="eventuei")
	public String getEventUei() {
		return eventUei;
	}

	/**
	 * @param eventUei the eventUei to set
	 */
	public void setEventUei(String eventUei) {
		this.eventUei = eventUei;
	}

	/**
	 * @return the nodeId
	 */
	@Column(name="nodeid")
	public Integer getNodeId() {
		return nodeId;
	}

	/**
	 * @param nodeId the nodeId to set
	 */
	public void setNodeId(Integer nodeId) {
		this.nodeId = nodeId;
	}

	/**
	 * @return the eventTime
	 */
	@Column(name="eventtime")
	public Date getEventTime() {
		return eventTime;
	}

	/**
	 * @param eventTime the eventTime to set
	 */
	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}

	/**
	 * @return the eventHost
	 */
	@Column(name="eventhost")
	public String getEventHost() {
		return eventHost;
	}

	/**
	 * @param eventHost the eventHost to set
	 */
	public void setEventHost(String eventHost) {
		this.eventHost = eventHost;
	}

	/**
	 * @return the eventSource
	 */
	@Column(name="eventsource")
	public String getEventSource() {
		return eventSource;
	}

	/**
	 * @param eventSource the eventSource to set
	 */
	public void setEventSource(String eventSource) {
		this.eventSource = eventSource;
	}

	/**
	 * @return the ipAddr
	 */
	@Column(name="ipaddr")
	public String getIpAddr() {
		return ipAddr;
	}

	/**
	 * @param ipAddr the ipAddr to set
	 */
	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}

	/**
	 * @return the eventSescr
	 */
	@Column(name="eventdescr")
	public String getEventDescr() {
		return eventDescr;
	}

	/**
	 * @param eventSescr the eventSescr to set
	 */
	public void setEventDescr(String eventDescr) {
		this.eventDescr = eventDescr;
	}

	/**
	 * @return the eventParms
	 */

	@Column(name="eventparms")
	public String getEventParms() {
		return eventParms;
	}

	/**
	 * @param eventParms the eventParms to set
	 */
	public void setEventParms(String eventParms) {
		this.eventParms = eventParms;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", eventUei=" + eventUei + ", nodeId=" + nodeId + ", eventTime="
				+ eventTime + ", eventHost=" + eventHost + ", eventSource=" + eventSource + ", ipAddr=" + ipAddr
				+ ", eventDescr=" + eventDescr + ", eventParms=" + eventParms + "]";
	}
	
	

}
