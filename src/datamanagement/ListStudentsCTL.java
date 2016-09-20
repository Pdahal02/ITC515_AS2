package datamanagement;

public class ListStudentsCTL {// program creates a class list students CTL
	private StudentManager sm;// sm is assigned to student manager

	public ListStudentsCTL() {
		sm = StudentManager.get();// get student manager assigned to sm
	}

	public void listStudents(IStudentLister lister, String unitCode) {
		lister.clearStudents();
		StudentMap students = sm.getStudentsByUnit(unitCode);
		for (Integer id : students.keySet())
			lister.addStudent(students.get(id));
	}
}
