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
@XmlRootElement(name = "destination")
@XmlAccessorType (XmlAccessType.FIELD)
public class Destination {

	@XmlAttribute(name = "id")
	private String id;
	
	@XmlAttribute(name = "port")
	private String port;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	
}
