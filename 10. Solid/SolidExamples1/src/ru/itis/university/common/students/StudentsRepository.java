package ru.itis.university.common.students;

public interface StudentsRepository {
    Student getStudentById(Long id);
    Student saveStudent(Student student);
}
