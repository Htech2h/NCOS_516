 package Tutorial;

public class Lease {
    private String name;
    private String apartmentNumber;
    private double rentalAmount;
    private double termOfLease;
    Lease() {
        setName("XXX");
        setApartmentNumber("0");
        setRentalAmount(1000);
        setTermOfLease(12);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
    public void setRentalAmount(double rentalAmount) {
        this.rentalAmount = rentalAmount;
    }
    public void setTermOfLease(double termOfLease) {
        this.termOfLease = termOfLease;
    }
    public String getName() {
        return name;
    }
    public String getApartmentNumber() {
        return apartmentNumber;
    }
    public double getRentalAmount() {
        return rentalAmount;
    }
    public double getTermOfLease() {
        return termOfLease;
    }

    public void addPetFee()
    {
        this.rentalAmount = rentalAmount + termOfLease;
        explainPetPolicy();
    }
    void explainPetPolicy()
    {
        System.out.println("Dear "+getName());
        System.out.println("Pet Policy: you are charged R10 for your pet");

    }


}
