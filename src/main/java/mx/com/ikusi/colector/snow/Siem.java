package mx.com.ikusi.colector.snow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author onaranjo
 *
 */
@XmlRootElement(name = "siem")
@XmlAccessorType (XmlAccessType.FIELD)
public class Siem {
	
	@XmlElement(name = "source")
	private Source source;
	
	@XmlElement(name = "destination")
	private Destination destination;

	public Source getSource() {
		return source;
	}
	public void setSource(Source source) {
		this.source = source;
	}
	public Destination getDestination() {
		return destination;
	}
	public void setDestination(Destination destination) {
		this.destination = destination;
	}

}
