from models.Designer import Designer
from models.Person import Person
from models.Programmer import Programmer
from views import View

from presenters.DesignerPresenter import DesignerPresenter
from presenters.ProgrammerPresenter import ProgrammerPresenter


class PersonPresenter:
    def __init__(self, person: Person, view: View):
        self.person = person
        self.view = view
    
    def get_menu_item(self) -> int:
        print("1). Информация о сотруднике")
        print("0). Назад")

        return int(self.view.get_input())

    def menu_control(self):
        menu_index = -1

        while menu_index != 0:
            menu_index = self.get_menu_item()

            if menu_index == 1:
                self.print_person_info(None)
            elif menu_index == 0:
                pass
            else:
                self.view.print_message("Некорректный ввод")

    def print_person_info(self, programmer: Programmer):
        if isinstance(self.person, Programmer):
            programmer_view = ProgrammerPresenter(self.person, self.view)
            programmer_view.print_programmer_info()
        elif isinstance(self.person, Designer):
            designer_presenter = DesignerPresenter(self.person, self.view)
            designer_presenter.print_designer_info()
