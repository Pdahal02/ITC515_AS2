package datamanagement;

public interface IUnit {

	public String getUnitCode();// get code

	public String getUnitName();// get name

	public float getPsCutoff();// get pass cutoff point

	public void setPsCutoff1(float cutoff);// set cutoff point

	public float getCrCutoff();// get credit cutoff point

	public void setCrCutoff(float cutoff);// set credit cutoff point

	public float getDiCuttoff();// get distinction cutoff point

	public void setDiCutoff(float cutoff);// set distinction cutoff point

	public float getHdCutoff();// get High distinction cutoff point

	public void setHdCutoff(float cutoff);// set High distinction cutoff point

	public float getAeCutoff();// get AE cutoff point

	public void setAeCutoff(float cutoff);// set AE cutoff point

	public int getAsg1Weight();// assigns weight 1

	public int getAsg2Weight();// assigns weight 2

	public int getExamWeight();// assigns weight 3

	public void setAssessmentWeights(int asg1Wgt, int asg2Wgt, int examWgt);

	public String getGrade(float asg1, float asg2, float exam);

	public void addStudentRecord(IStudentUnitRecord record);

	public IStudentUnitRecord getStudentRecord(int studentID);

	public StudentUnitRecordList listStudentRecords();
}
