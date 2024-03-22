/**
 *
 * @author JADC
 */
public class EmployeeDatabase {
    
    String employeeNumber = "Employee Number: 1";
    String lastName = "Last Name: Dela Cruz";
    String firstName = "First Name: Justine";
    String birthdate = "Birthdate: 10/11/1983";
    String address = "Address: Manila";
    String phoneNumber = "Phone Number: 966-860-270";
    String sssNumber = "SSS Number: 44-4506057-3";
    String philhealthNumber = "PhilHealth Number: 820126853951";
    String tinNumber = "TIN Number: 442-605-657-000";
    String pagIbigNumber = "Pag-IBIG Number: 691295330870";
    String status = "Status: Regular";
    String position = "Position: Chief Executive Officer";
    String immediateSuprvisor = "Immediate Supervisor: N/A";
    String basicSalary = "Basic Salary: 90,000";
    String riceSubsidy = "Rice Subsidy: 1,500";
    String phoneAllowance = "Phone Allowance: 2,000";
    String clothingAllowance = "Clothing Allowance: 1,000";
    String grossSemiMonthlyRate = "Gross Semi-monthly Rate: 45,000";
    String hourlyRate = "Hourly Rate: 535.71";
    
    public static void main(String[] args) {
        // Create new object
        EmployeeDatabase info = new EmployeeDatabase();
        
        // Start a new line
        String newline = "\n";
        
        String employeeInformation = info.employeeNumber + newline + info.lastName + newline + info.firstName 
                + newline + info.birthdate + newline + info.address + newline + info.phoneNumber 
                + newline + info.sssNumber + newline + info. philhealthNumber + newline + info.tinNumber 
                + newline + info.immediateSuprvisor + newline + info.basicSalary + newline + info.riceSubsidy 
                + newline + info.phoneAllowance + newline + info.clothingAllowance + newline + info.grossSemiMonthlyRate
                + newline + info.hourlyRate;
                
        System.out.println(employeeInformation);
        
    }
}
