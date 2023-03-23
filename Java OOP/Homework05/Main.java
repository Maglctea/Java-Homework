import Presentor.CompanyPresenter;
import models.Company;
import models.Department;
import models.Programmer;

public class Main {
    public static void main(String[] args) {

        Department<Programmer> department = new Department<>("Крутой", "Programmer");
        department.add(new Programmer(18, "Василь", "Василий", "Васильевич", 
                                "+79615233696", 35000, "Python developer"));  
        department.add(new Programmer(18, "Иванов", "Иван", "Иванович", 
                                "+79615232132", 305700, "Java developer"));  

        Department<Programmer> department2 = new Department<>("Дизайнерский", "Designer");
        department2.add(new Programmer(18, "Петров", "Петр", "Петрович", "+79615231254", 72000, "C# developer"));    
        
        
        Company company = new Company();
        company.add(department);
        company.add(department2);


        CompanyPresenter companyPresenter = new CompanyPresenter(company);
        companyPresenter.MenuControl();




        
 
        
    }
}