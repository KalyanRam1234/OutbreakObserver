package UseCases.useCase6;

import java.util.ArrayList;

public interface useCase6_DAO {
    public void updateInfectedDetails(String caseid, String qroomNo, String sdate, String edate, String healthStatus);
    public void removeInfectedDetails( String caseId );
}
