/**
 * 
 */
package mx.com.ikusi.colector.repositories;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author interware
 *
 */
@Entity
@Table(name = "node")
public class Nodo {

	@Id
	@GeneratedValue
	Integer nodeid;
	Date nodecreatetime;
	Integer nodeparentid;
	String nodetype;
	String nodesysoid;
	String nodesysname;
	String nodesysdescription;
	String nodesyslocation;
	String nodesyscontact;
	String nodelabel;
	String nodelabelsource;
	String nodenetbiosname;
	String nodedomainname;

	/**
	 * @return the nodeid
	 */

	@Column(name = "nodeid")
	public Integer getNodeid() {
		return nodeid;
	}

	/**
	 * @param nodeid
	 *            the nodeid to set
	 */
	public void setNodeid(Integer nodeid) {
		this.nodeid = nodeid;
	}

	/**
	 * @return the nodecreatetime
	 */
	@Column(name = "nodecreatetime")
	public Date getNodecreatetime() {
		return nodecreatetime;
	}

	/**
	 * @param nodecreatetime
	 *            the nodecreatetime to set
	 */
	public void setNodecreatetime(Date nodecreatetime) {
		this.nodecreatetime = nodecreatetime;
	}

	/**
	 * @return the nodeparentid
	 */
	@Column(name = "nodeparentid")
	public Integer getNodeparentid() {
		return nodeparentid;
	}

	/**
	 * @param nodeparentid
	 *            the nodeparentid to set
	 */
	public void setNodeparentid(Integer nodeparentid) {
		this.nodeparentid = nodeparentid;
	}

	/**
	 * @return the nodetype
	 */
	@Column(name = "")
	public String getNodetype() {
		return nodetype;
	}

	/**
	 * @param nodetype
	 *            the nodetype to set
	 */
	public void setNodetype(String nodetype) {
		this.nodetype = nodetype;
	}

	/**
	 * @return the nodesysoid
	 */
	@Column(name = "nodesysoid")
	public String getNodesysoid() {
		return nodesysoid;
	}

	/**
	 * @param nodesysoid
	 *            the nodesysoid to set
	 */
	public void setNodesysoid(String nodesysoid) {
		this.nodesysoid = nodesysoid;
	}

	/**
	 * @return the nodesysname
	 */
	@Column(name = "nodesysname")
	public String getNodesysname() {
		return nodesysname;
	}

	/**
	 * @param nodesysname
	 *            the nodesysname to set
	 */
	public void setNodesysname(String nodesysname) {
		this.nodesysname = nodesysname;
	}

	/**
	 * @return the nodesysdescription
	 */
	@Column(name = "nodesysdescription")
	public String getNodesysdescription() {
		return nodesysdescription;
	}

	/**
	 * @param nodesysdescription
	 *            the nodesysdescription to set
	 */
	public void setNodesysdescription(String nodesysdescription) {
		this.nodesysdescription = nodesysdescription;
	}

	/**
	 * @return the nodesyslocation
	 */
	@Column(name = "nodesyslocation")
	public String getNodesyslocation() {
		return nodesyslocation;
	}

	/**
	 * @param nodesyslocation
	 *            the nodesyslocation to set
	 */
	public void setNodesyslocation(String nodesyslocation) {
		this.nodesyslocation = nodesyslocation;
	}

	/**
	 * @return the nodesyscontact
	 */
	@Column(name = "nodesyscontact")
	public String getNodesyscontact() {
		return nodesyscontact;
	}

	/**
	 * @param nodesyscontact
	 *            the nodesyscontact to set
	 */
	public void setNodesyscontact(String nodesyscontact) {
		this.nodesyscontact = nodesyscontact;
	}

	/**
	 * @return the nodelabel
	 */
	@Column(name = "nodelabel")
	public String getNodelabel() {
		return nodelabel;
	}

	/**
	 * @param nodelabel
	 *            the nodelabel to set
	 */
	public void setNodelabel(String nodelabel) {
		this.nodelabel = nodelabel;
	}

	/**
	 * @return the nodelabelsource
	 */
	@Column(name = "nodenetbiosname")
	public String getNodelabelsource() {
		return nodelabelsource;
	}

	/**
	 * @param nodelabelsource
	 *            the nodelabelsource to set
	 */
	public void setNodelabelsource(String nodelabelsource) {
		this.nodelabelsource = nodelabelsource;
	}

	/**
	 * @return the nodenetbiosname
	 */
	@Column(name = "nodenetbiosname")
	public String getNodenetbiosname() {
		return nodenetbiosname;
	}

	/**
	 * @param nodenetbiosname
	 *            the nodenetbiosname to set
	 */
	public void setNodenetbiosname(String nodenetbiosname) {
		this.nodenetbiosname = nodenetbiosname;
	}

	/**
	 * @return the nodedomainname
	 */
	@Column(name = "nodedomainname")
	public String getNodedomainname() {
		return nodedomainname;
	}

	/**
	 * @param nodedomainname
	 *            the nodedomainname to set
	 */
	public void setNodedomainname(String nodedomainname) {
		this.nodedomainname = nodedomainname;
	}

}
