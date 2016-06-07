package mx.com.ikusi.colector.repositories;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ipinterface")
public class Inter {

	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer nodeid;
	
	private String ipaddr;
	
	private String iphostname;
	
	private String ismanaged;
	
	private String issnmpprimary;

	/**
	 * @return the id
	 */
	@Column(name="id")
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nodeid
	 */
	@Column(name="nodeid")
	public Integer getNodeid() {
		return nodeid;
	}

	/**
	 * @param nodeid the nodeid to set
	 */
	public void setNodeid(Integer nodeid) {
		this.nodeid = nodeid;
	}

	/**
	 * @return the ipaddr
	 */
	@Column(name="ipaddr")
	public String getIpaddr() {
		return ipaddr;
	}

	/**
	 * @param ipaddr the ipaddr to set
	 */
	public void setIpaddr(String ipaddr) {
		this.ipaddr = ipaddr;
	}

	/**
	 * @return the iphostname
	 */
	@Column(name="iphostname")
	public String getIphostname() {
		return iphostname;
	}

	/**
	 * @param iphostname the iphostname to set
	 */
	public void setIphostname(String iphostname) {
		this.iphostname = iphostname;
	}

	/**
	 * @return the ismanaged
	 */
	@Column(name="ismanaged")
	public String getIsmanaged() {
		return ismanaged;
	}

	/**
	 * @param ismanaged the ismanaged to set
	 */
	public void setIsmanaged(String ismanaged) {
		this.ismanaged = ismanaged;
	}

	/**
	 * @return the issnmpprimary
	 */
	@Column(name="issnmpprimary")
	public String getIssnmpprimary() {
		return issnmpprimary;
	}

	/**
	 * @param issnmpprimary the issnmpprimary to set
	 */
	public void setIssnmpprimary(String issnmpprimary) {
		this.issnmpprimary = issnmpprimary;
	}
	
}
