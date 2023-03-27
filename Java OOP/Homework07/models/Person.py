class Person:
    def __init__(self, age: int, surname: str, name: str, patronymic: str, telephone: str):
        self.age = age
        self.surname = surname
        self.name = name
        self.patronymic = patronymic
        self.telephone = telephone

    def get_age(self) -> int:
        return self.age
    
    def get_surname(self) -> str:
        return self.surname
    
    def get_name(self) -> str:
        return self.name
    
    def get_patronymic(self) -> str:
        return self.patronymic
    
    def get_telephone(self) -> str:
        return self.telephone

    def set_age(self, age: int):
        self.age = age
    
    def set_surname(self, surname: str):
        self.surname = surname
    
    def set_name(self, name: str):
        self.name = name
    
    def set_patronymic(self, patronymic: str):
        self.patronymic = patronymic
    
    def set_telephone(self, telephone: str):
        self.telephone = telephone
