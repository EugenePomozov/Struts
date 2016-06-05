package beans;

public class ReservationComponent {
	        private String componentTypeCode;
	        private String createDateTime;
	        private String internalStatus;

	        public ReservationComponent() {
	        }

	        public ReservationComponent(String componentTypeCode, String createDateTime,
	                                    String internalStatus) {
	            this.componentTypeCode = componentTypeCode;
	            this.createDateTime = createDateTime;
	            this.internalStatus = internalStatus;
	        }

	        public String getComponentTypeCode() {
	            return componentTypeCode;
	        }

	        public void setComponentTypeCode(String componentTypeCode) {
	            this.componentTypeCode = componentTypeCode;
	        }

	        public String getCreateDateTime() {
	            return createDateTime;
	        }

	        public void setCreateDateTime(String createDateTime) {
	            this.createDateTime = createDateTime;
	        }

	        public String getInternalStatus() {
	            return internalStatus;
	        }

	        public void setInternalStatus(String internalStatus) {
	            this.internalStatus = internalStatus;
	        }

	        @Override
	        public String toString() {
	            return "ReservationComponent{" +
	                    "componentTypeCode='" + componentTypeCode + '\'' +
	                    ", createDateTime=" + createDateTime +
	                    ", internalStatus=" + internalStatus +
	                    '}';
	        }
	    }

