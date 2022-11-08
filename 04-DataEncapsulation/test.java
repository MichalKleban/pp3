import Student;

public class test {
    public static void main(String[] args) {
        Student d1 = new Student();
        d1.setName("michal");                
        d1.setSurname("Kowalski");
        d1.setAddress("Krakow");
        d1.setCity("krakow");
        d1.setDriverLicenseNumber("21");
        d1.setLicenseCategory("B2");
        d1.setPostalCode("3210");
        d1.setYearOfIssue(1700);
    
        d1.displayInfo();
        System.out.println("---------------");
        System.out.println(d1.toString());
    }          
}
