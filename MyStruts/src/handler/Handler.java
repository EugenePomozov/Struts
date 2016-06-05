package handler;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import beans.AncillaryAirComponent;
import beans.Customer;
import beans.Email;
import beans.Payment;
import beans.Phone;
import beans.FareFamily;
import beans.Reservation;
import beans.ReservationComponent;
import beans.Status;

public class Handler  extends DefaultHandler {
	private Reservation reservation;
	private List<ReservationComponent> reservationComponents;
	private Customer customer;
	private FareFamily fareFamily;

	public void startElement(String uri, String localName, String qName,
			Attributes attrs) throws SAXException {
		String key = qName.toUpperCase();

		if (DataEnum.names().contains(key)) {
			switch (DataEnum.valueOf(key)) {
			case RESERVATION:
				reservationComponents = new ArrayList<>();
				final int CODE_IDX = 0,
				DESCRIPTION_IDX = 1;
				reservation = new Reservation(attrs.getValue(CODE_IDX),
						attrs.getValue(DESCRIPTION_IDX), reservationComponents);
				break;
			case RESERVATIONCOMPONENT:
				reservationComponents.add(new ReservationComponent(attrs
						.getValue("ComponentTypeCode"), attrs
						.getValue("CreateDateTime"), attrs
						.getValue("InternalStatus")));
				break;
			case CUSTOMER:
				customer = new Customer(attrs.getValue("CustomerDocID"),
						attrs.getValue("FirstName"),
						attrs.getValue("LastName"), attrs.getValue("Sequence"));
				reservation.setCustomer(customer);
				break;
			case PAYMENT:
				customer.getPayments().add(
						new Payment(attrs.getValue("AmountPaid"), attrs
								.getValue("FormOfPaymentTypeCode"), attrs
								.getValue("CurrencyCode")));
				break;
			case EMAIL:
				customer.setEmail(new Email(attrs.getValue("Default"), attrs
						.getValue("EmailAddress"), attrs.getValue("EmailType"),
						attrs.getValue("Sequence"), Enum.valueOf(Status.class,
								attrs.getValue("SyncStatus"))));
				break;
			case PHONE:
				customer.setPhone(new Phone(attrs.getValue("Default"), attrs
						.getValue("PhoneNumber"), attrs.getValue("PhoneType"),
						attrs.getValue("Sequence"), attrs
								.getValue("SyncStatus")));
				break;
			case FAREFAMILY:
				fareFamily = new FareFamily(attrs.getValue("FareFamilyCode"),
						new ArrayList<AncillaryAirComponent>());
				reservation.setFareFamily(fareFamily);
				break;
			case ANCILLARYAIRCOMPONENT:
				fareFamily.getAncillaryAirComponentCode().add(
						new AncillaryAirComponent(attrs
								.getValue("AncillaryAirComponentCode")));
				
				break;
			}
		}
	}

	private static enum DataEnum {
		RESERVATION, RESERVATIONCOMPONENT, CUSTOMER, FAREFAMILY, ANCILLARYAIRCOMPONENT, EMAIL, PHONE, PAYMENT;

		private static List<String> names = null;

		public static List<String> names() {
			if (names == null) {
				names = new ArrayList<>();
				for (DataEnum data : DataEnum.values()) {
					names.add(data.name());
				}
			}
			return names;
		}
	}

	public Reservation getReservation() {
		return reservation;
	}
}
