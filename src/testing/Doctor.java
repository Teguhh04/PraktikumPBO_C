package testing;

public class Doctor {
	String workAtHospitalIdentity;

    public Doctor(String workAtHospitalIdentity) {
        this.workAtHospitalIdentity = workAtHospitalIdentity;
    }

    public void treatPatient() {
        System.out.println("Doctor is treating a patient.");
    }

    public String getWorkAtHospitalIdentity() {
        return workAtHospitalIdentity;
    }
}

