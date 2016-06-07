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
@XmlRootElement(name = "device")
@XmlAccessorType (XmlAccessType.FIELD)
public class Device {
	
	@XmlAttribute(name = "ip")
	private String ip;
	
	@XmlAttribute(name = "name")
	private String name;
	
	@XmlAttribute(name = "serialNumber")
	private String serialNumber;
	
	@XmlAttribute(name = "provider")
	private String provider;
	
	@XmlAttribute(name = "mac")
	private String mac;
	
	@XmlAttribute(name = "modelId")
	private String modelId;
	
	@XmlAttribute(name = "sysId")
	private String sysId;
	
	@XmlAttribute(name = "category")
	private String category;
	
	@XmlAttribute(name = "subCategory")
	private String subCategory;
	
	@XmlAttribute(name = "sysClassName")
	private String sysClassName;
		
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getModelId() {
		return modelId;
	}
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
	public String getSysId() {
		return sysId;
	}
	public void setSysId(String sysId) {
		this.sysId = sysId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public String getSysClassName() {
		return sysClassName;
	}
	public void setSysClassName(String sysClassName) {
		this.sysClassName = sysClassName;
	}

}
