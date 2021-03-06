package impl;

import java.io.IOException;



import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import beans.Reservation;
import handler.Handler;
import ifaces.IReservationDAO;

public class ReservationImplXml implements IReservationDAO {

	@Override
	public Reservation getReservation(String fileName) throws IOException, SAXException {
		XMLReader reader = XMLReaderFactory.createXMLReader();		
			Handler dataHandler = new Handler();
		reader.setContentHandler(dataHandler);
		reader.parse(this.getClass().getClassLoader().getResource("").getPath()+fileName+".xml");	
		return dataHandler.getReservation();
	}

}
