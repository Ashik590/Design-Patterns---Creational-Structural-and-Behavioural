import java.util.ArrayList;
import java.util.List;

class PrescriptionTemplate extends MedicalReport {
    private List<String> medicineList;

    public PrescriptionTemplate() {
        super();
        this.medicineList = new ArrayList<>();
    }

    public PrescriptionTemplate(PrescriptionTemplate source) {
        super(source);
        this.medicineList = new ArrayList<>(source.medicineList);
    }

    public void addMedicine(String medicine) {
        medicineList.add(medicine);
    }

    @Override
    public MedicalReport clone() {
        return new PrescriptionTemplate(this);
    }

    @Override
    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prescription Report\n");
        sb.append("Date: ").append(reportDate).append("\n");
        sb.append("Patient: ").append(patientName).append("\n");
        sb.append("Doctor: ").append(doctorName).append("\n");
        sb.append("Diagnosis: ").append(diagnosis).append("\n");
        sb.append("Medicines:\n");

        for (String medicine : medicineList) {
            sb.append("- ").append(medicine).append("\n");
        }

        return sb.toString();
    }
}