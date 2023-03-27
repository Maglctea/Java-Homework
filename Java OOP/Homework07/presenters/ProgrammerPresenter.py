from models import Programmer
from views import View


class ProgrammerPresenter:
    def __init__(self, programmer: Programmer, view: View):
        self.programmer = programmer
        self.view = view

    def print_programmer_info(self):
        self.view.print_message("-------Личная информация-------")
        self.view.print_message(f"Фамилия: {self.programmer.surname}")
        self.view.print_message(f"Имя: {self.programmer.name}")
        self.view.print_message(f"Отчество: {self.programmer.patronymic}")
        self.view.print_message(f"Телефон: {self.programmer.telephone}")
        self.view.print_message(f"Возраст: {self.programmer.age}")

        self.view.print_message("---Корпоративная информация---")
        self.view.print_message(f"Позиция: {self.programmer.qualification}")
        self.view.print_message(f"Зарплата: {self.programmer.salary}")
