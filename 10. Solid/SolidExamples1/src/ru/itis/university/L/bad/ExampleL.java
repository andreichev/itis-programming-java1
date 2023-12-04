package ru.itis.university.L.bad;

import ru.itis.university.common.students.Student;
import ru.itis.university.common.students.StudentRepositoryDBImpl;
import ru.itis.university.common.students.StudentsRepository;

// L - Liskov Substitution
// Необходимо, чтобы подклассы могли бы служить заменой для своих суперклассов.

public class ExampleL {
    public static void main(String[] args) {
        StudentsRepository repository = new StudentsCache();
        for (int i = 0; i < 10; i++) {
            Student student = repository.getStudentById(3L);
            System.out.println(student);
        }

        repository.saveStudent(new Student(4L, "Artur", "IOS"));
    }
}
