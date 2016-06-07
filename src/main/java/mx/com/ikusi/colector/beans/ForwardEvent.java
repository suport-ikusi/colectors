package mx.com.ikusi.colector.beans;

import mx.com.ikusi.colector.snow.Event;

public class ForwardEvent {

	public ForwardEvent() {
		// TODO Auto-generated constructor stub
	}
	
	public static void forward(Event evento){
		try {
			evento.sendMessage();
			System.out.println("Send Event OK");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error on Send Event" + e.getMessage());
		}
		
	}

}
