package beans;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String  customerID;
    private String firstName;
    private String lastName;
    private int sequence;
    private Email email;
    private Phone phone;
    private List<Payment> payments = new ArrayList<Payment>();

    public Customer() {
    }

    public Customer(String customerID, String firstName, String lastName, String sequence) {
        this.customerID = customerID;
    	this.firstName = firstName;
        this.lastName = lastName;
        this.sequence = Integer.parseInt(sequence);
        
    }

    public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", payments=" + payments +
                '}';
    }


}
