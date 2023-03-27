from models.Person import Person


class Programmer(Person):
    def __init__(self, age: int, surname: str, name: str, patronymic: str, telephone: str, salary: int, qualification: str):
        super().__init__(age, surname, name, patronymic, telephone)
        self.salary = salary
        self.qualification = qualification

    def get_salary(self) -> int:
        return self.salary
    
    def get_qualification(self) -> str:
        return self.qualification

    def set_salary(self, salary: int):
        self.salary = salary
    
    def set_qualification(self, qualification: str):
        self.qualification = qualification
