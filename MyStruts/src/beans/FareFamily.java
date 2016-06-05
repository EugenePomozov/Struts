package beans;

import java.util.ArrayList;
import java.util.List;

public class FareFamily {
    private String fareFamilyCode;
    private List <AncillaryAirComponent> ancillaryAirComponentCode = new ArrayList<AncillaryAirComponent>();

    public FareFamily() {
    }

    public FareFamily(String fareFamilyCode, List<AncillaryAirComponent> ancillaryAirComponentCode) {
        this.fareFamilyCode = fareFamilyCode;
        this.ancillaryAirComponentCode = ancillaryAirComponentCode;
    }

    public String getFareFamilyCode() {
        return fareFamilyCode;
    }

    public void setFareFamilyCode(String fareFamilyCode) {
        this.fareFamilyCode = fareFamilyCode;
    }

    public List<AncillaryAirComponent> getAncillaryAirComponentCode() {
        return ancillaryAirComponentCode;
    }

    public void setAncillaryAirComponentCode(List<AncillaryAirComponent> ancillaryAirComponentCode) {
        this.ancillaryAirComponentCode = ancillaryAirComponentCode;
    }

    @Override
    public String toString() {
        return "FareFamily{" +
                "fareFamilyCode='" + fareFamilyCode + '\'' +
                ", ancillaryAirComponentCode=" + ancillaryAirComponentCode +
                '}';
    }
}
