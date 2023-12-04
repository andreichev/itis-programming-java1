package ru.itis.university.common.students;

public class StudentRepositoryDBImpl implements StudentsRepository{
    @Override
    public Student getStudentById(Long id) {
        System.out.println("Получения данных студента с id " + id);
        System.out.println("Выполняется запрос к удаленной бд...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignored) {}
        System.out.println("Соединение установлено. Данные получены");
        return new Student(id, "Timur", "Ruby");
    }

    @Override
    public Student saveStudent(Student student) {
        System.out.println("Сохранение данных студента");
        System.out.println("Выполняется запрос к удаленной бд...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignored) {}
        System.out.println("Соединение установлено. Данные получены");
        return student;
    }
}
