package Local_Address;
import Address.Address;

import java.util.Objects;

public class EmailAddress extends Address {
    private String userName;
    private String atSign; //@
    private String domainName;
    private String dot; //.
    private String tld; //com, org, gov...

    public EmailAddress(){
        super();
        userName = "mother";
        atSign = "@";
        domainName = "hotmail";
        dot = ".";
        tld = "com";
    }

    public EmailAddress(String validFrom, String validTo, String userName, String atSign, String domainName, String dot, String tld){
        super(validFrom, validTo);
        this.userName = userName;
        this.atSign = atSign;
        this.domainName = domainName;
        this.dot = dot;
        this.tld = tld;
    }

    public EmailAddress(EmailAddress otherEmailAddress){
        super(otherEmailAddress);
        this.userName = otherEmailAddress.userName;
        this.atSign = otherEmailAddress.atSign;
        this.domainName = otherEmailAddress.domainName;
        this.dot = otherEmailAddress.dot;
        this.tld = otherEmailAddress.tld;
    }

    public String getUserName(){
        return userName;
    }

    public String getAtSign(){
        return atSign;
    }

    public String getDomainName(){
        return domainName;
    }

    public String getDot(){
        return dot;
    }

    public String getTld(){
        return tld;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAtSign(String atSign) {
        this.atSign = atSign;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public void setTld(String tld) {
        this.tld = tld;
    }

    @Override
    public String toString() {
        return "The EmailAddress is valid from " + this.getValidFrom() + " to " + this.getValidTo() +".\n" +
                "The email address is " + this.getUserName() + this.getAtSign() + this.getDomainName() + this.getDot() + this.getTld() + ".";
    }

    @Override
    public boolean equals(Address otherAddress) {
        if (this == otherAddress) return true;
        if (otherAddress == null || getClass() != otherAddress.getClass()) return false;
        if (!super.equals(otherAddress)) return false;

        EmailAddress emailAddress = (EmailAddress) otherAddress;

        if (!Objects.equals(userName, emailAddress.userName)) return false;
        if (!Objects.equals(atSign, emailAddress.atSign)) return false;
        if (!Objects.equals(domainName, emailAddress.domainName)) return false;
        if (!Objects.equals(dot, emailAddress.dot)) return false;
        return Objects.equals(tld, emailAddress.tld);
    }

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
