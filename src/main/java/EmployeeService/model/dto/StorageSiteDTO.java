package EmployeeService.model.dto;

public class StorageSiteDTO {

    private AddressDTO address;
    private ClientDTO client;


    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public ClientDTO getClient() {
        return client;
    }

    public void setClient(ClientDTO client) {
        this.client = client;
    }
}
