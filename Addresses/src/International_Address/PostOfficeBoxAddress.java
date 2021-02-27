package International_Address;

import Address.Address;

public class PostOfficeBoxAddress extends GeographicAddress{
    private int boxLobbyDoorCode;

    public PostOfficeBoxAddress(){
        super();
        boxLobbyDoorCode = 5459;
    }

    public PostOfficeBoxAddress(String validFrom, String validTo, String addressLine, String city, String regionOrState, String zipOrPostCode, Locale locale, int boxLobbyDoorCode){
        super(validFrom, validTo, addressLine, city, regionOrState, zipOrPostCode, locale);
        this.boxLobbyDoorCode = boxLobbyDoorCode;
    }

    public PostOfficeBoxAddress(PostOfficeBoxAddress otherPostOfficeBoxAddress){
        super(otherPostOfficeBoxAddress);
        boxLobbyDoorCode = otherPostOfficeBoxAddress.boxLobbyDoorCode;
    }

    public int getBoxLobbyDoorCode() {
        return boxLobbyDoorCode;
    }

    public void setBoxLobbyDoorCode(int boxLobbyDoorCode) {
        this.boxLobbyDoorCode = boxLobbyDoorCode;
    }

    @Override
    public String toString() {
        return "This PostOfficeBoxAddress is valid from " + this.getValidFrom() + " to " + this.getValidTo() + ".\n" +
                "The geographic address is " + this.getAddressLine() + ", " + this.getCity() + ", " + this.getRegionOrState()
                + ", " + this.getZipOrPostCode() + ".\n" +
                "The locale is " + this.getLocale() + ".\n" +
                "The box lobby door code is " + this.getBoxLobbyDoorCode() + ".";
    }

    @Override
    public boolean equals(Address otherAddress) {

        if (this == otherAddress) return true;
        if (otherAddress == null || getClass() != otherAddress.getClass()) return false;
        if (!super.equals(otherAddress)) return false;

        PostOfficeBoxAddress postOfficeBoxAddress = (PostOfficeBoxAddress) otherAddress;

        return boxLobbyDoorCode == postOfficeBoxAddress.boxLobbyDoorCode;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + boxLobbyDoorCode;
        return result;
    }
}
