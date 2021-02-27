package International_Address;
import Address.Address;
import java.util.Objects;

public class GeographicAddress extends Address {
    private String addressLine;
    private String city;
    private String regionOrState;
    private String zipOrPostCode;
    private Locale locale;

    public static class Locale {
        private String element1; //two-letter country code
        private int element2; //three-digit country code
        private String element3; //english language country name

        public Locale(){
            element1 = "CA";
            element2 = 124;
            element3 = "Canada";
        }

        public Locale(String element1, int element2, String element3){
            this.element1 = element1;
            this.element2 = element2;
            this.element3 = element3;
        }
        public String getElement1() {
            return element1;
        }

        public int getElement2(){
            return element2;
        }

        public String getElement3(){
            return element3;
        }

        public void setElement1(String element1) {
            this.element1 = element1;
        }

        public void setElement2(int element2) {
            this.element2 = element2;
        }

        public void setElement3(String element3) {
            this.element3 = element3;
        }

        @Override
        public String toString() {
            return this.getElement1() + " \"" + getElement2() + "\" " + getElement3() ;
        }
    }

    public GeographicAddress(){
        super();
        addressLine = "1400 Maisonneuve Blvd W";
        city = "Montreal";
        regionOrState = "QC";
        zipOrPostCode = "H3G 1M8";
        locale = getLocale();
    }

    public GeographicAddress(String validFrom, String validTo, String addressLine, String city, String regionOrState, String zipOrPostCode, Locale locale){
        super(validFrom, validTo);
        this.addressLine = addressLine;
        this.city = city;
        this.regionOrState = regionOrState;
        this.zipOrPostCode = zipOrPostCode;
        this.locale = locale;
    }

    public GeographicAddress(String validFrom, String validTo, String addressLine, String city, String regionOrState, String zipOrPostCode) {
        super(validFrom, validTo);
        this.addressLine = addressLine;
        this.city = city;
        this.regionOrState = regionOrState;
        this.zipOrPostCode = zipOrPostCode;

    }

    public GeographicAddress(GeographicAddress otherGeographicAddress){
        this.setValidFrom(otherGeographicAddress.getValidFrom());
        this.setValidTo(otherGeographicAddress.getValidTo());
        addressLine = otherGeographicAddress.addressLine;
        city = otherGeographicAddress.city;
        regionOrState = otherGeographicAddress.regionOrState;
        zipOrPostCode = otherGeographicAddress.zipOrPostCode;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public String getCity() {
        return city;
    }

    public String getRegionOrState() {
        return regionOrState;
    }

    public String getZipOrPostCode() {
        return zipOrPostCode;
    }

    public Locale getLocale(){
        return locale;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setRegionOrState(String regionOrState) {
        this.regionOrState = regionOrState;
    }

    public void setZipOrPostCode(String zipOrPostCode) {
        this.zipOrPostCode = zipOrPostCode;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    @Override
    public String toString() {
        return "The GeographicAddress is valid from " + this.getValidFrom() + " to " + this.getValidTo() + ".\n" +
                "The geographic address is " + this.getAddressLine() + ", " + this.getCity() + ", " + this.getRegionOrState()
                + ", " + this.getZipOrPostCode() + ".\n"+
                "The locale is " + this.getLocale() + ".";
    }

    @Override
    public boolean equals(Address otherAddress) {
        if (this == otherAddress) return true;
        if (otherAddress == null || getClass() != otherAddress.getClass()) return false;
        if (!super.equals(otherAddress)) return false;

        GeographicAddress geographicAddress = (GeographicAddress) otherAddress;

        if (!Objects.equals(addressLine, geographicAddress.addressLine)) return false;
        if (!Objects.equals(city, geographicAddress.city)) return false;
        if (!Objects.equals(regionOrState, geographicAddress.regionOrState))
            return false;
        if (!Objects.equals(zipOrPostCode, geographicAddress.zipOrPostCode))
            return false;
        return Objects.equals(locale, geographicAddress.locale);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (addressLine != null ? addressLine.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (regionOrState != null ? regionOrState.hashCode() : 0);
        result = 31 * result + (zipOrPostCode != null ? zipOrPostCode.hashCode() : 0);
        result = 31 * result + (locale != null ? locale.hashCode() : 0);
        return result;
    }
}
