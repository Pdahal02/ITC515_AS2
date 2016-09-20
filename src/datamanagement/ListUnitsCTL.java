package datamanagement;

public class ListUnitsCTL {// programs creates a class
	private UnitManager um;// um assigned to unit manager

	public ListUnitsCTL() {
		um = UnitManager.UM();// assigned to um
	}

	public void listUnits(IUnitLister lister) {
		lister.clearUnits();
		UnitMap units = um.getUnits();
		for (String s : units.keySet())
			lister.addUnit(units.get(s));
	}
}
