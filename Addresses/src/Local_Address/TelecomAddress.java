package Local_Address;
import Address.Address;

import java.util.Objects;

public class TelecomAddress extends Address {
    private String countryCode;
    private String nationalDirectDialingPrefix;
    private int areaCode;
    private long number;
    private int extension;
    private String physicalType; //phone, fax, mobile, pager...

    public TelecomAddress(){
        super();
        countryCode = "+1";
        nationalDirectDialingPrefix = "(0)";
        areaCode = 800;
        number = 4633783;
        extension = 387;
        physicalType = "phone";
    }

    public TelecomAddress(String validFrom, String validTo, String countryCode, String nationalDirectDialingPrefix, int areaCode, long number, int extension, String physicalType){
        super(validFrom, validTo);
        this.countryCode = countryCode;
        this.nationalDirectDialingPrefix = nationalDirectDialingPrefix;
        this.areaCode = areaCode;
        this.number = number;
        this.extension = extension;
        this.physicalType = physicalType;
    }

    public TelecomAddress(TelecomAddress otherTelecomAddress){
        super(otherTelecomAddress);
        this.countryCode = otherTelecomAddress.countryCode;
        this.nationalDirectDialingPrefix = otherTelecomAddress.nationalDirectDialingPrefix;
        this.areaCode = otherTelecomAddress.areaCode;
        this.number = otherTelecomAddress.number;
        this.extension = otherTelecomAddress.extension;
        this.physicalType = otherTelecomAddress.physicalType;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getNationalDirectDialingPrefix() {
        return nationalDirectDialingPrefix;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public long getNumber() {
        return number;
    }

    public int getExtension() {
        return extension;
    }

    public String getPhysicalType() {
        return physicalType;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setNationalDirectDialingPrefix(String nationalDirectDialingPrefix) {
        this.nationalDirectDialingPrefix = nationalDirectDialingPrefix;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public void setPhysicalType(String physicalType) {
        this.physicalType = physicalType;
    }

    @Override
    public String toString() {
        return "This TelecomAddress is valid from " + this.getValidFrom() + " to " + this.getValidTo() + ".\n" +
                "The telecom address is " + this.getCountryCode() + " " + this.getNationalDirectDialingPrefix() + this.getAreaCode() + " " +
                this.getNumber() + " ext. " + this.getExtension() + " " + this.getPhysicalType() + ".";
    }

    @Override
    public boolean equals(Address otherAddress) {
        if (this == otherAddress) return true;
        if (otherAddress == null || getClass() != otherAddress.getClass()) return false;
        if (!super.equals(otherAddress)) return false;

        TelecomAddress telecomAddress = (TelecomAddress) otherAddress;

        if (areaCode != telecomAddress.areaCode) return false;
        if (number != telecomAddress.number) return false;
        if (extension != telecomAddress.extension) return false;
        if (!Objects.equals(countryCode, telecomAddress.countryCode)) return false;
        if (!Objects.equals(nationalDirectDialingPrefix, telecomAddress.nationalDirectDialingPrefix))
            return false;
        return Objects.equals(physicalType, telecomAddress.physicalType);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (nationalDirectDialingPrefix != null ? nationalDirectDialingPrefix.hashCode() : 0);
        result = 31 * result + areaCode;
        result = 31 * result + (int) (number ^ (number >>> 32));
        result = 31 * result + extension;
        result = 31 * result + (physicalType != null ? physicalType.hashCode() : 0);
        return result;
    }
}
