package Quarantine;

import java.util.ArrayList;

public interface QuarantineDAO {
    public Quarantine getCaseDetails(String caseid);
    public ArrayList<Quarantine> getQuarantineByStartDate(String startDate);
    public ArrayList<Quarantine> getQuarantineByEndDate(String endDate);  
    public void enterQuarantineCase(String caseId, String startDate, String healthStatus, String duration, String endDate); 
}
