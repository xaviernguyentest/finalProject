package Data;

import Based_Commons.ReadExcel;

public class Datatest {
	public static String user = "";
	public static String pass = "";
	public static String Email = ReadExcel.getCelData("DatatestExcel", "Sheet1", 1, 0);
}
