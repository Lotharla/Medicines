import java.util.Date;


public class Prescription {
	public Prescription(Date date, int daysSupply) {
		dispenseDate = date;
		this.daysSupply = daysSupply;
	}
	public Prescription() {
		// TODO Auto-generated constructor stub
	}
	Date dispenseDate;
	int daysSupply=9;
}
