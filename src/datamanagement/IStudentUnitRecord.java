package datamanagement;

public interface IStudentUnitRecord {

	public Integer getStudentID();// programs gets the student ID

	public String getUnitCode();// program gets the students unit code

	public void setAsg1(float mark);// program assigns the mark1

	public float getAsg1();

	public void setAsg2(float mark);// program assigns the mark2

	public float getAsg2();

	public void setExam(float mark);// program sets exam

	public float getExam();// program gets exam

	public float getTotal();// total of the marks assigned
}
