import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class MedicineClashTest {

	@Test
	public void testNoMedicineTaken() {
		Patient patient = new Patient();
		assertEquals("no medicine taken!", null, patient.clash(new ArrayList(),90));
	}

	@Test
	public void testOneMedicineTaken() {
		Patient patient = new Patient();
		ArrayList medicinesTaken = new ArrayList();
		medicinesTaken.add("Aspirin");
		assertEquals("one medicine taken!", new ArrayList(), patient.clash(medicinesTaken,90));
	}
	@Test
	public void howManyDaysAMedicineIsTaken() {
		Patient patient = new Patient();
		Prescription prescription = new Prescription();
		ArrayList medicinesTaken = new ArrayList();
		int daysSupply = 9;
		medicinesTaken.add("Aspirin");
		assertEquals(daysSupply, prescription.daysSupply);
	}
	@Test
	public void testMoreThanOneMedicineTakenOnOneDay() {
		Patient patient = new Patient();
		ArrayList medicinesTaken = new ArrayList();
		medicinesTaken.add("Aspirin");
		medicinesTaken.add("Paracetamol");
		assertEquals("more than one medicine taken on one day!", 
				1, patient.clash(medicinesTaken,90).size());
	}
	@Test
	public void testMoreThanOneMedicineTakenOnTwoDays() {
		Patient patient = new Patient();
		ArrayList medicinesTaken = new ArrayList();
		medicinesTaken.add("Aspirin");
		medicinesTaken.add("Paracetamol");
		assertEquals("more than one medicine taken on two days!", 
				2, patient.clash(medicinesTaken,90).size());
	}
}
