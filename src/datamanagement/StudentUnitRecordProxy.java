package datamanagement;

public class StudentUnitRecordProxy implements IStudentUnitRecord {// IStudentUnitRecord
																	// is
																	// implemented
																	// to the
																	// class
	private Integer studentID;// assigns student ID to integer
	private String unitCode;// assigns unitcode to string
	private StudentUnitRecordManager mngr;// assigns mngr to class

	public StudentUnitRecordProxy(Integer id, String code) {// input the student
															// ID, unitcode
		this.studentID = id;
		this.unitCode = code;
		this.mngr = StudentUnitRecordManager.instance();
	}

	public Integer getStudentID() {
		return studentID;
	}

	public String getUnitCode() {
		return unitCode;
	}

	public void setAsg1(float mark) {
		mngr.getStudentUnitRecord(studentID, unitCode).setAsg1(mark);
	}

	public float getAsg1() {
		return mngr.getStudentUnitRecord(studentID, unitCode).getAsg1();
	}

	public void setAsg2(float mark) {
		mngr.getStudentUnitRecord(studentID, unitCode).setAsg2(mark);
	}

	public float getAsg2() {
		return mngr.getStudentUnitRecord(studentID, unitCode).getAsg2();
	}

	public void setExam(float mark) {
		mngr.getStudentUnitRecord(studentID, unitCode).setExam(mark);
	}

	public float getExam() {
		return mngr.getStudentUnitRecord(studentID, unitCode).getExam();
	}

	public float getTotal() {
		return mngr.getStudentUnitRecord(studentID, unitCode).getTotal();
	}
}
