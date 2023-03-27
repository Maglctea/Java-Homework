from models.Company import Company
from models.Department import Department
from models.Programmer import Programmer
from presenters.CompanyPresenter import CompanyPresenter
from views.View import View

if __name__ == "__main__":
    department = Department("Крутой", "Programmer")
    department.add(Programmer(18, "Василь", "Василий", "Васильевич",
                              "+79615233696", 35000, "Python developer"))
    department.add(Programmer(18, "Иванов", "Иван", "Иванович",
                              "+79615232132", 305700, "Java developer"))

    department2 = Department("Дизайнерский", "Designer")
    department2.add(Programmer(18, "Петров", "Петр", "Петрович", "+79615231254", 72000, "C# developer"))

    company = Company()
    company.add(department)
    company.add(department2)

    view = View()
    companyPresenter = CompanyPresenter(company, view)
    companyPresenter.menu_control()
