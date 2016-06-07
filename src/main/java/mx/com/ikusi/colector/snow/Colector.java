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
@XmlRootElement(name = "colector")
@XmlAccessorType (XmlAccessType.FIELD)
public class Colector {
	
	@XmlAttribute(name = "name")
	private String name;
	
	@XmlAttribute(name = "ip")
	private String ip;
	
	@XmlAttribute(name = "hostname")
	private String hostname;
	
	@XmlAttribute(name = "platform")
	private String platform;
	
	@XmlAttribute(name = "port")
	private String port;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}

}
