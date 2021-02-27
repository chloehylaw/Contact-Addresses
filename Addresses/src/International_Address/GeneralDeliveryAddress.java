package International_Address;

import Address.Address;
import Local_Address.TelecomAddress;

import java.util.Objects;

public class GeneralDeliveryAddress extends GeographicAddress{
    private TelecomAddress telecomAddress;

    public GeneralDeliveryAddress(){
        super();
    }

    public GeneralDeliveryAddress(String validFrom, String validTo, String addressLine, String city, String regionOrState, String zipOrPostCode, TelecomAddress telecomAddress){
        super(validFrom,validTo,addressLine,city,regionOrState,zipOrPostCode);
        this.telecomAddress = telecomAddress;

    }

    public GeneralDeliveryAddress(GeneralDeliveryAddress otherGeneralDeliveryAddress){
        super(otherGeneralDeliveryAddress);
        telecomAddress = otherGeneralDeliveryAddress.telecomAddress;
    }

    public TelecomAddress getTelecomAddress() {
        return telecomAddress;
    }

    public void setTelecomAddress(TelecomAddress telecomAddress) {
        this.telecomAddress = telecomAddress;
    }

    @Override
    public String toString() {
        return "The GeneralDelivery Address is valid from " + this.getValidFrom() + " to " + this.getValidTo() + ".\n" +
                "The general delivery address is " + this.getAddressLine() + ", " + this.getCity() + ", " + this.getRegionOrState()
                + ", " + this.getZipOrPostCode() + ".\n" +
                this.getTelecomAddress();
    }

    @Override
    public boolean equals(Address otherAddress) {
        if (this == otherAddress) return true;
        if (otherAddress == null || getClass() != otherAddress.getClass()) return false;
        if (!super.equals(otherAddress)) return false;

        GeneralDeliveryAddress generalDeliveryAddress = (GeneralDeliveryAddress) otherAddress;

        return Objects.equals(telecomAddress, generalDeliveryAddress.telecomAddress);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (telecomAddress != null ? telecomAddress.hashCode() : 0);
        return result;
    }
}
