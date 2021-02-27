package Address;

import java.util.Objects;

public class Address {
    private String validFrom;
    private String validTo;

    public Address() {
        validFrom = "2021-01-10";
        validTo = "2022-01-10";

    }

    public Address(String validFrom, String validTo){
        this.validFrom = validFrom;
        this.validTo = validTo;
    }

    public Address(Address otherAddress){
        this.validFrom = otherAddress.validFrom;
        this.validTo = otherAddress.validTo;
    }

    public String getValidFrom(){
        return validFrom;
    }

    public String getValidTo(){
        return validTo;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    public String toString() {
        return "This Address is valid from " + this.getValidFrom() + " to " + this.getValidTo() + ".";
    }


    public boolean equals(Address otherAddress) {
        if (this == otherAddress) return true;
        if (otherAddress == null || getClass() != otherAddress.getClass()) return false;

        Address address = (Address) otherAddress;

        if (!Objects.equals(this.validFrom, address.validFrom)) return false;
        return Objects.equals(this.validTo, address.validTo);
    }

    @Override
    public int hashCode() {
        int result = validFrom != null ? validFrom.hashCode() : 0;
        result = 31 * result + (validTo != null ? validTo.hashCode() : 0);
        return result;
    }
}
