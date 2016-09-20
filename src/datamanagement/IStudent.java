package datamanagement;

public interface IStudent {

	public Integer getID();// program is getting an ID for a student

	public String getFirstName();//program gets first name input

	public void setFirstName(String firstName);// program sets first name

	public String getLastName();//program gets last name input

	public void setLastName(String lastName);//program sets last name input

	public void addUnitRecord(IStudentUnitRecord record);// program adds a unit record for each student

	public IStudentUnitRecord getUnitRecord(String unitCode);//program sets the unit record

	public StudentUnitRecordList getUnitRecords();// generates the unit record for the student

}
