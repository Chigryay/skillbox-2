package model;

public class StudentService {

    private int gradeOfBestStudent;
    private int gradeOfWorstStudent;
    private Student bestStudent;
    private Student worstStudent;
    private int countStudents;
    private int sumGrades;

    public StudentService() {
        gradeOfBestStudent = Integer.MIN_VALUE;
        gradeOfWorstStudent = Integer.MAX_VALUE;
        bestStudent = null;
        worstStudent = null;
        countStudents = 0;
        sumGrades = 0;
    }

    public void addGrade(Student student, int grade) {
        sumGrades += grade;
        countStudents++;

        if (grade > gradeOfBestStudent) {
            gradeOfBestStudent = grade;
            bestStudent = student;
        }

        if (grade < gradeOfWorstStudent) {
            gradeOfWorstStudent = grade;
            worstStudent = student;
        }
    }

    public float getAverageGrade() {
        return (float) sumGrades / countStudents;
    }

    public Student getBestStudent() {
        return bestStudent;
    }

    public Student getWorstStudent() {
        return worstStudent;
    }
}
