import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class Patient {
	ArrayList<Medicine> medicines;
	
	public Patient() {
		Calendar calendar = Calendar.getInstance();
		Medicine med = new Medicine("Aspirin");
		calendar.setTime(new Date());
		calendar.add(Calendar.DAY_OF_MONTH, -2);
		med.addPrescription(calendar.getTime(), 10);
		medicines.add(med);
		med = new Medicine("Paracetamol");
		calendar.add(Calendar.DAY_OF_MONTH, -2);
		med.addPrescription(calendar.getTime(), 10);
		medicines.add(med);
	}
	ArrayList clash (ArrayList medicines, int daysToConsider) {
		ArrayList clash = new ArrayList();
	 if (medicines.isEmpty()){
		return null; 
	 } else {
		 if (medicines.size() > 1) {
		 clash.add(1);
		 }
		 return clash;
	 }
	}
}
