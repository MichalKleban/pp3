public class Student {

    public String name;
    public String surname;
    public String address;
    public String postalCode;
    public String city;
    public String driverLicenseNumber;
    public int yearOfIssue;
    public String licenseCategory;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        name = name.substring(0, 1).toUpperCase()+name.substring(1).toLowerCase();
        this.name = name;
        
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }
    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }
    public int getYearOfIssue() {
        return yearOfIssue;
    }
    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
        if(this.yearOfIssue<1980 || this.yearOfIssue>2022) System.out.println("Bledna data");
        
    }
    public String getLicenseCategory() {
        return licenseCategory;
    }
    public void setLicenseCategory(String licenseCategory) {
        this.licenseCategory = licenseCategory;
    }

    public String toString(){
        return "Name" + getName() + "Surname: "+ getSurname() + "Address: " 
        + getAddress() + "postal code: "+ getPostalCode() + "city: " + getCity() 
        + "driver Licnese Number: " + getDriverLicenseNumber() 
        + "Year of issue: " + getYearOfIssue() + "License Category: " 
        +  getLicenseCategory();
    }


    public void displayInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Surname: "+ surname);
        System.out.println("Address: " + address);
        System.out.println("postal code: "+ postalCode);
        System.out.println("city: " + city );
        System.out.println("driver Licnese Number: " + driverLicenseNumber);
        System.out.println("Year of issue: " + yearOfIssue);
        System.out.println("License Category: " +  licenseCategory);
    }   
    public static void main(String[] args) {
        Student d1 = new Student();
        d1.name = "Jan";
        d1.surname = "Kowalski";
        d1.displayInfo();
        System.out.println(d1.name + " " + d1.surname);

    
    }
}