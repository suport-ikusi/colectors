package mx.com.ikusi.colector.snow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "parent")
@XmlAccessorType (XmlAccessType.FIELD)
public class Parent {
	
	@XmlElement(name = "sysId")
	private String sysId;


	public String getSysId() {
		return sysId;
	}
	public void setSysId(String sysId) {
		this.sysId = sysId;
	}
	
	

}
