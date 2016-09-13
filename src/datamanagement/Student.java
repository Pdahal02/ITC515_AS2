/**
 *   A student class is created which call the student object with studentID, firstName and lastName
 */
package datamanagement;

public class Student implements IStudent {
	private Integer studentId; // id changed to studentID//
	private String firstName; // fn changed to firstName//
	private String lastName; // ln changed to lastName//
	private StudentUnitRecordList su;

	public Student(Integer studentstudentId, String firstName, String lastName, StudentUnitRecordList su) {
		this.studentId = studentstudentId; // id changed to studentID//
		this.firstName = firstName; // fn changed to firstName//
		this.lastName = lastName; // ln changed to lastName//
		this.su = su == null ? new StudentUnitRecordList() : su;
	}

	public Integer getID() {
		return this.studentId; // id changed to studentID//
	}

	public String getFirstName() {
		return firstName; // fn changed to firstName//
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName; // fn changed to firstName//
	}

	public String getLastName() {
		return lastName; // ln changed to lastName//
	}

	public void setLastName(String lastName) {

		this.lastName = lastName; // ln changed to lastName//
	}

	public void addUnitRecord(IStudentUnitRecord record) {
		su.add(record);
	}

	public IStudentUnitRecord getUnitRecord(String unitCode) {
		for (IStudentUnitRecord r : su)
			if (r.getUnitCode().equals(unitCode))
				return r;

		return null;

	}

	public StudentUnitRecordList getUnitRecords() {
		return su;
	}
}
