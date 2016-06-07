package mx.com.ikusi.colector.snow;

import java.io.StringWriter;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import mx.com.ikusi.colector.camel.OperationCamel;



/**
 * 
 * @author onaranjo
 *
 */
@XmlRootElement(name = "event")
@XmlAccessorType (XmlAccessType.FIELD)
public class Event {
	
	@XmlAttribute(name = "name")
	private String name;
	
	@XmlAttribute(name = "context")
	private String context;
	
	@XmlAttribute(name = "itsm")
	private String itsm;
	
	@XmlAttribute(name = "id")
	private String id;
	
	/**
	 * El UEI es el identificador 
	 * para determinar un evento
	 * tipo de track
	 */
	@XmlAttribute(name = "uei")
	private String uei;
	
	@XmlAttribute(name = "severity")
	private String severity;
	
	@XmlAttribute(name = "time")
	private String time;
	
	@XmlElement(name = "colector")
	private Colector colector;
	
	@XmlElement(name = "customer")
	private Customer customer;
	
	@XmlElement(name = "device")
	private Device device;
	
	@XmlElement(name = "siem")
	private Siem siem;
	
	@XmlElement(name = "message")
	private String message;
	
	@XmlElementWrapper(name="metrics")
	@XmlElement(name="metric")
	private Set<Metric> metrics;
	
	@XmlElementWrapper(name="parents")
	@XmlElement(name="parent")
	private Set<Parent> parents;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUei() {
		return uei;
	}

	public void setUei(String uei) {
		this.uei = uei;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Colector getColector() {
		return colector;
	}

	public void setColector(Colector colector) {
		this.colector = colector;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public Siem getSiem() {
		return siem;
	}

	public void setSiem(Siem siem) {
		this.siem = siem;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getItsm() {
		return itsm;
	}

	public void setItsm(String itsm) {
		this.itsm = itsm;
	}

	public Set<Metric> getMetrics() {
		if(this.metrics == null) {
			this.metrics = new HashSet<Metric>();
		}
		return metrics;
	}

	public void setMetrics(Set<Metric> metrics) {
		this.metrics = metrics;
	}

	public Set<Parent> getParents() {
		if(this.parents == null) {
			this.parents = new HashSet<Parent>();
		}
		return parents;
	}

	public void setParents(Set<Parent> parents) {
		this.parents = parents;
	}
	
	public boolean sendMessage(){

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Event.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			// Guardando en StringWriter
			StringWriter salidaXML = new StringWriter();
			jaxbMarshaller.marshal(this, salidaXML);
			// Enviando el mensaje a la cola
			OperationCamel.JMSComponent(salidaXML.toString());
			return true;
		} catch (JAXBException e1) {
			e1.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
	}	

}
