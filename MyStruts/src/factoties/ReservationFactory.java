package factoties;

import ifaces.IReservationDAO;
import impl.ReservationImplXml;

public class ReservationFactory {
	public static IReservationDAO getClassFromFactory() {
		return new ReservationImplXml();
	}
}
