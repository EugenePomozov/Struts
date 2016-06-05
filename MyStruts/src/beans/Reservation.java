package beans;

//import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reservation {
    private String code;
    private String description;
    private List<ReservationComponent> reservationComponents = new ArrayList<ReservationComponent>();
    private Customer customer;
    private FareFamily fareFamily;
   


    public FareFamily getFareFamily() {
		return fareFamily;
	}

	public void setFareFamily(FareFamily fareFamily) {
		this.fareFamily = fareFamily;
	}

	public Reservation() {
    }

    public Reservation(String code, String description,
                       List<ReservationComponent> reservationComponents) {
        this.code = code;
        this.description = description;
        this.reservationComponents = reservationComponents;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ReservationComponent> getReservationComponents() {
        return reservationComponents;
    }

    public void setReservationComponents(List<ReservationComponent> reservationComponents) {
        this.reservationComponents = reservationComponents;
    }
    public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

    @Override
    public String toString() {
        return "Reservation{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", reservationComponents=" + reservationComponents +
                '}';
    }
}
