class Person:
    """This is a person."""

    @property
    def name(self):
        """The name property."""
        return self._name

    @name.setter
    def name(self, value):
        self._name = value

    @property
    def age(self):
        """The age property."""
        return self._age

    @age.setter
    def age(self, value):
        self._age = value

    def display_details(self):
        """Print name and age."""
        print("Name: ", self.name, "\n", "Age: ", self.age)


class Student(Person):
    """This is a student."""

    name: str = ""
    age: int = 0
    roll_number: int = 0
    course: str = ""

    def display_details(self):
        """Print name, age, roll_number and course."""
        print(
            "Name: ",
            self.name,
            "\n",
            "Age: ",
            self.age,
            "\n",
            "Roll Number: ",
            self.roll_number,
            "\n",
            "Course: ",
            self.course,
            "\n",
        )


def main():
    """Return nothing."""
    student: Student = Student(
        name="Ananya", age=20, roll_number=101, course="B.Tech CSE"
    )
    student.display_details()
