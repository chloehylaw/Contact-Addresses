package Local_Address;
import Address.Address;

/**
 *
 */
public class EmailAddress extends Address {
    private String userName;
    private String atSign; //@
    private String domainName;
    private String dot; //.
    private String tld; //com, org, gov...

    /**
     *
     */
    public EmailAddress(){
        super();
        userName = "mother";
        atSign = "@";
        domainName = "hotmail";
        dot = ".";
        tld = "com";
    }

    /**
     *
     * @param validFrom
     * @param validTo
     * @param userName
     * @param atSign
     * @param domainName
     * @param dot
     * @param tld
     */
    public EmailAddress(String validFrom, String validTo, String userName, String atSign, String domainName, String dot, String tld){
        super(validFrom, validTo);
        this.userName = userName;
        this.atSign = atSign;
        this.domainName = domainName;
        this.dot = dot;
        this.tld = tld;
    }

    /**
     *
     * @param otherEmailAddress
     */
    public EmailAddress(EmailAddress otherEmailAddress){
        super(otherEmailAddress);
        this.userName = new String(otherEmailAddress.userName);
        this.atSign = new String(otherEmailAddress.atSign);
        this.domainName = new String(otherEmailAddress.domainName);
        this.dot = new String(otherEmailAddress.dot);
        this.tld = new String(otherEmailAddress.tld);
    }

    /**
     *
     * @return
     */
    public String getUserName(){
        return userName;
    }

    /**
     *
     * @return
     */
    public String getAtSign(){
        return atSign;
    }

    /**
     *
     * @return
     */
    public String getDomainName(){
        return domainName;
    }

    /**
     *
     * @return
     */
    public String getDot(){
        return dot;
    }

    /**
     *
     * @return
     */
    public String getTld(){
        return tld;
    }

    /**
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     *
     * @param atSign
     */
    public void setAtSign(String atSign) {
        this.atSign = atSign;
    }

    /**
     *
     * @param domainName
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     *
     * @param dot
     */
    public void setDot(String dot) {
        this.dot = dot;
    }

    /**
     *
     * @param tld
     */
    public void setTld(String tld) {
        this.tld = tld;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "The EmailAddress is valid from " + this.getValidFrom() + " to " + this.getValidTo() +".\n" +
                "The email address is " + this.getUserName() + this.getAtSign() + this.getDomainName() + this.getDot() + this.getTld() + ".";
    }

    /**
     *
     * @param otherAddress
     * @return
     */
    @Override
    public boolean equals(Address otherAddress) {
        if(otherAddress == null)
            return false;
        else if(getClass() != otherAddress.getClass())
            return false;
        else{
            EmailAddress otherEmailAddress = (EmailAddress) otherAddress;
            return this.getValidFrom().equals(otherEmailAddress.getValidFrom())
                    && this.getValidTo().equals(otherEmailAddress.getValidTo())
                    && this.getUserName().equals(otherEmailAddress.getUserName())
                    && this.getAtSign().equals(otherEmailAddress.getAtSign())
                    && this.getDomainName().equals(otherEmailAddress.getDomainName())
                    && this.getDot().equals(otherEmailAddress.getDot())
                    && this.getTld().equals(otherEmailAddress.getTld());
        }
    }

    /**
     * Calculate the value consistent with the definition of equality for the class
     * @return the current instance of the class
     */
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (atSign != null ? atSign.hashCode() : 0);
        result = 31 * result + (domainName != null ? domainName.hashCode() : 0);
        result = 31 * result + (dot != null ? dot.hashCode() : 0);
        result = 31 * result + (tld != null ? tld.hashCode() : 0);
        return result;
    }
}
