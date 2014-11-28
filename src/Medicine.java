import java.util.ArrayList;
import java.util.Date;


public class Medicine {
	public Medicine(String name) {
		// TODO Auto-generated constructor stub
	}
	void addPrescription(Date date, int daysSupply) {
		prescriptions.add(new Prescription(date, daysSupply));
	}
	ArrayList<Prescription> prescriptions;
	String name;
}
