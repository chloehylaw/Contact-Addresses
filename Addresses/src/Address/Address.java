package Address;

/**
 * Information to contact a Party
 * Specific time frame that the information is validFrom → validTo
 */
public class Address {
    private String validFrom;
    private String validTo;

    /**
     * Default constructor
     */
    public Address() {
        validFrom = "2021-01-10";
        validTo = "2022-01-10";
    }

    /**
     * Parametrized constructor
     * @param validFrom String representing a starting date in the format "YYYY-MM-DD"
     * @param validTo String representing a expiring date in the format "YYYY-MM-DD"
     */
    public Address(String validFrom, String validTo) {
        this.validFrom = validFrom;
        this.validTo = validTo;
    }

    /**
     * Copy constructor
     * @param otherAddress the copied object
     */
    public Address(Address otherAddress) {
        this.validFrom = new String(otherAddress.validFrom);
        this.validTo = new String(otherAddress.validTo);
    }

    /**
     * @return validFrom
     */
    public String getValidFrom() {
        return validFrom;
    }

    /**
     * @return validTo
     */
    public String getValidTo() {
        return validTo;
    }

    /**
     * @param validFrom Set the starting valid date
     */
    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * @param validTo Set the ending expiring date
     */
    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    /**
     * @return the validFrom and validTo dates of the address
     */
    public String toString() {
        return "This Address is valid from " + this.getValidFrom() + " to " + this.getValidTo() + ".";
    }

    /**
     * @param otherAddress the compared object
     * @return whether they are equal or not
     */
    protected boolean equals(Address otherAddress) {
        if(otherAddress == null)
            return false;
        else if(getClass() != otherAddress.getClass())
            return false;
        return this.getValidFrom().equals(otherAddress.getValidFrom()) &&
                this.getValidTo().equals(otherAddress.getValidTo());
    }

    /**
     * Calculate the value consistent with the definition of equality for the class
     * @return the current instance of the class
     */
    @Override
    public int hashCode() {
        int result = validFrom != null ? validFrom.hashCode() : 0;
        result = 31 * result + (validTo != null ? validTo.hashCode() : 0);
        return result;
    }
}
