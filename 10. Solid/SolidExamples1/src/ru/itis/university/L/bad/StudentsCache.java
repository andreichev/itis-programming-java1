package ru.itis.university.L.bad;

import ru.itis.university.common.students.Student;
import ru.itis.university.common.students.StudentRepositoryDBImpl;
import ru.itis.university.common.students.StudentsRepository;

import java.util.HashMap;
import java.util.Map;

public class StudentsCache implements StudentsRepository {
    private Map<Long, Student> cache = new HashMap<>();
    private StudentsRepository repository = new StudentRepositoryDBImpl();

    @Override
    public Student getStudentById(Long id) {
        Student student = cache.get(id);
        if(student == null) {
            student = repository.getStudentById(id);
            cache.put(id, student);
        }
        return student;
    }

    @Override
    public Student saveStudent(Student student) {
        throw new RuntimeException("Не реализовано");
    }
}
