package beans;

public class AncillaryAirComponent {
	private String ancillaryAirComponentCode;

	public AncillaryAirComponent() {
	}

	public AncillaryAirComponent(String ancillaryAirComponentCode) {
		this.ancillaryAirComponentCode = ancillaryAirComponentCode;
	}

	public String getAncillaryAirComponentCode() {
		return ancillaryAirComponentCode;
	}

	public void setAncillaryAirComponentCode(String ancillaryAirComponentCode) {
		this.ancillaryAirComponentCode = ancillaryAirComponentCode;
	}
	//////////////////////////////////
	@Override
	public String toString() {
		return "AncillaryAirComponent [ancillaryAirComponentCode="
				+ ancillaryAirComponentCode + "]";
	}


}
