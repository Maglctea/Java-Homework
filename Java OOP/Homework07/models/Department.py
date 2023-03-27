from typing import TypeVar, List

T = TypeVar('T', bound='Person')


class Department:
    def __init__(self, name: str, department_type: str):
        self.name = name
        self.department_type = department_type
        self.employees: List[T] = []

    def add(self, employee: T):
        self.employees.append(employee)

    def remove(self, index: int):
        self.employees.pop(index)

    def get_name(self) -> str:
        return self.name

    def get_department_type(self) -> str:
        return self.department_type

    def set_name(self, name: str):
        self.name = name

    def get_employees(self) -> List[T]:
        return self.employees

    def get_employee(self, index: int) -> T:
        return self.employees[index]
