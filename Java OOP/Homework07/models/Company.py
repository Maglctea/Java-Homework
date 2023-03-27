class Company:
    def __init__(self):
        self.departments = []

    def add(self, department):
        self.departments.append(department)

    def get_departments(self):
        return self.departments

    def get_department(self, index):
        return self.departments[index]

    def remove(self, index):
        self.departments.pop(index)
