package datamanagement;

/**
 * @author jtulip
 */

public interface IStudentLister {// program gets the student list

    public void clearStudents();// deletes the name of the student
    public void addStudent(IStudent student);// adds the student necessary information
}
