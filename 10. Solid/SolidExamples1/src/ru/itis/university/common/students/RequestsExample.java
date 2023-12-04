package ru.itis.university.common.students;

public class RequestsExample {
    public static void main(String[] args) {
        StudentsRepository repository = new StudentRepositoryDBImpl();
        for (int i = 0; i < 10; i++) {
            Student student = repository.getStudentById(3L);
            System.out.println(student);
        }
    }
}
