from models.Department import Department
from models.Designer import Designer
from models.Programmer import Programmer

from views.View import View
from presenters.PersonPresenter import PersonPresenter


class DepartmentPresenter:
    def __init__(self, department: Department, view: View):
        self.department = department
        self.view = view

    def get_menu_item(self) -> int:
        self.view.print_message("1). Все работники отдела")
        self.view.print_message("2). Выбрать работника")
        self.view.print_message("3). В работника")
        self.view.print_message("4). Создать работника")
        self.view.print_message("5). Удалить работника")
        self.view.print_message("0 - Назад")

        return int(self.view.get_input())

    def menu_control(self) -> None:
        index: int
        menuIndex: int

        while True:
            menuIndex = self.get_menu_item()
            if menuIndex == 1:  # Все сторудники отдела
                self.print_employees_info()
            elif menuIndex == 2:  # Выбрать работника
                self.print_employee_Info()
            elif menuIndex == 3:  # В работника
                index = self.get_index()
                personPresentor = PersonPresenter(self.department.get_employee(index), self.view)
                personPresentor.menu_control()
            elif menuIndex == 4:  # Создать работника
                self.add_employee()
            elif menuIndex == 5:  # Удалить работника
                self.remove_employee()
            elif menuIndex == 0:  # Назад
                break
            else:
                self.view.print_message("Некорректный ввод")

    def add_employee(self) -> None:
        if self.department.get_department_type() == "Designer":
            self.department.add(self.get_designer())
        elif self.department.get_department_type() == "Programmer":
            self.department.add(self.get_programmer())

    def remove_employee(self):
        index = self.get_index()
        self.department.remove(index)

    def print_employee_Info(self) -> None:
        index = self.get_index()
        person = self.department.get_employee(index)
        self.view.print_message(f"{person.get_surname()} {person.get_name()} {person.get_patronymic()}")

    def print_employees_info(self) -> None:
        index = 0
        self.view.print_message(f"================Отдел {self.department.get_name()}================")
        for person in self.department.get_employees():
            self.view.print_message(f"[{index}] {person.get_surname()} {person.get_name()} {person.get_patronymic()}")
            index += 1

    def get_programmer(self) -> Programmer:
        self.view.print_message("----Личная информация---- ")
        self.view.print_message("Фамилия: ")
        surname = self.view.get_input()
        self.view.print_message("Имя: ")
        name = self.view.get_input()
        self.view.print_message("Отчество: ")
        patronymic = self.view.get_input()
        self.view.print_message("Телефон: ")
        telephone = self.view.get_input()
        self.view.print_message("Возраст: ")
        age = int(self.view.get_input())

        self.view.print_message("----Рабочая нформация---- ")
        self.view.print_message("Зарплата: ")
        salary = int(self.view.get_input())
        self.view.print_message("Квалификация: ")
        qualification = self.view.get_input()

        return Programmer(age, surname, name, patronymic, telephone, salary, qualification)

    def get_designer(self) -> Designer:
        self.view.print_message("----Личная информация---- ")
        self.view.print_message("Фамилия: ")
        surname = self.view.get_input()
        self.view.print_message("Имя: ")
        name = self.view.get_input()
        self.view.print_message("Отчество: ")
        patronymic = self.view.get_input()
        self.view.print_message("Телефон: ")
        telephone = self.view.get_input()
        self.view.print_message("Возраст: ")
        age = int(self.view.get_input())

        self.view.print_message("----Рабочая нформация---- ")
        self.view.print_message("Зарплата: ")
        salary = int(self.view.get_input())
        self.view.print_message("Квалификация: ")
        qualification = self.view.get_input()
        return Designer(age, surname, name, patronymic, telephone, salary, qualification)

    def get_index(self):
        self.view.print_message("Введите номер работника")
        return int(self.view.get_input())
