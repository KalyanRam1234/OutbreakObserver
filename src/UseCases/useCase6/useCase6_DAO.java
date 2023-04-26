package UseCases.useCase6;

import java.util.ArrayList;

public interface useCase6_DAO {
    public void enterInfectedDetails(String studentId, String caseId, String name, String date, String testId, String qroomNo, String sdate, String edate, String healthStatus);
    public void updateInfectedDetails(String studentId, String caseId, String name, String date, String testId, String qroomNo, String sdate, String edate, String healthStatus);
    public void removeInfectedDetails( String caseId);
}
