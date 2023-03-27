class DesignerPresenter:
    def __init__(self, designer, view):
        self.designer = designer
        self.view = view

    def print_designer_info(self):
        self.view.print_message("-------Личная информация-------")
        self.view.print_message(f"Фамилия: {self.designer.surname}")
        self.view.print_message(f"Имя: {self.designer.name}")
        self.view.print_message(f"Отчество: {self.designer.patronymic}")
        self.view.print_message(f"Телефон: {self.designer.telephone}")
        self.view.print_message(f"Возраст: {self.designer.age}")

        self.view.print_message("---Корпоративная информация---")
        self.view.print_message(f"Позиция: {self.designer.qualification}")
        self.view.print_message(f"Зарплата: {self.designer.salary}")
