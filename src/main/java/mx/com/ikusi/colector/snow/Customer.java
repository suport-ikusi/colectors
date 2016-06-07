package mx.com.ikusi.colector.snow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author onaranjo
 *
 */
@XmlRootElement(name = "customer")
@XmlAccessorType (XmlAccessType.FIELD)
public class Customer {
	
	@XmlAttribute(name = "name")
	private String name;
	
	@XmlAttribute(name = "id")
	private String id;
	
	@XmlAttribute(name="callerid")
	private String callerid;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the callerid
	 */
	public String getCallerid() {
		return callerid;
	}
	/**
	 * @param callerid the callerid to set
	 */
	public void setCallerid(String callerid) {
		this.callerid = callerid;
	}
	
	

}
