from models.Company import Company
from models.Department import Department
from presenters.DepartmentPresenter import DepartmentPresenter
from views.View import View


class CompanyPresenter:
    def __init__(self, company: Company, view: View):
        self.company = company
        self.view = view

    def get_menu_item(self):
        self.view.print_message("1). Все отделы")
        self.view.print_message("2). Выбрать отдел")
        self.view.print_message("3). В отдел")
        self.view.print_message("4). Создать отдел")
        self.view.print_message("5). Удалить отдел")
        self.view.print_message("0 - Выход")

        return int(self.view.get_input())

    def menu_control(self):
        index = 0
        menu_index = 0

        menu_index = self.get_menu_item()
        while menu_index != 0:
            if menu_index == 1:
                self.print_departments_info()
            elif menu_index == 2:
                self.print_department_info()
            elif menu_index == 3:
                index = self.get_index()
                department_presenter = DepartmentPresenter(self.company.get_department(index), self.view)
                department_presenter.menu_control()
            elif menu_index == 4:
                self.add_department()
            elif menu_index == 5:
                self.remove_department()
            elif menu_index == 0:
                self.view.print_message("Удачного дня!")
            else:
                self.view.print_message("Некорректный ввод")

            menu_index = self.get_menu_item()

    def print_department_info(self):
        self.view.print_message("Введите номер департамента")
        index = int(self.view.get_input())
        self.view.print_message(f'Отдел "{self.company.departments[index].name}"')

    def print_departments_info(self):
        index = 0
        for department in self.company.departments:
            self.view.print_message(f'[{index}] Отдел "{department.name}"')
            index += 1

    def add_department(self):
        self.view.print_message("Введите название отдела:")
        name = self.view.get_input()

        self.view.print_message("Вид отдела:\n1). Дизайн.\n2). Программирование\n>>> ")
        res = int(self.view.get_input())

        if res == 1:
            self.company.add(Department(name, "Designer"))
        elif res == 2:
            self.company.add(Department(name, "Programmer"))
        else:
            self.view.print_message("Неверный ввод")

    def remove_department(self):
        index = self.get_index()
        self.company.remove(index)

    def get_index(self):
        self.view.print_message("Введите номер отдела")
        return int(self.view.get_input())
