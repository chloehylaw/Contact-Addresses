package Local_Address;
import Address.Address;

import java.util.Objects;

public class WebPageAddress extends Address {
    private String url;

    public WebPageAddress(){
        super();
        url = "www.google.com";
    }

    public WebPageAddress(String validFrom, String validTo, String url){
        super(validFrom, validTo);
        this.url = url;
    }

    public WebPageAddress(WebPageAddress otherWebPageAddress){
        super(otherWebPageAddress);
        this.url = otherWebPageAddress.url;
    }

    public String getUrl(){
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "This WebPageAddress is valid from " + this.getValidFrom() + " to " + this.getValidTo() + ".\n" +
                "The URL is " + this.getUrl() + ".";
    }

    @Override
    public boolean equals(Address otherAddress) {
        if (this == otherAddress) return true;
        if (otherAddress == null || getClass() != otherAddress.getClass()) return false;
        if (!super.equals(otherAddress)) return false;

        WebPageAddress webPageAddress = (WebPageAddress) otherAddress;

        return Objects.equals(url, webPageAddress.url);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}
