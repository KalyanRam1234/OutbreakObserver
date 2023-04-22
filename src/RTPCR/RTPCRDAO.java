package RTPCR;

public interface RTPCRDAO {
    public RTPCR getRTPCRByStudentId(String id);
    public RTPCR getRTPCRByStudentId_Date(String id, String testDate);
    public RTPCR getRTPCR_postive();
    public RTPCR getRTPCRByStudentId_LastDate(String id);
    // public Student getStudentsByBatch(String batch);
}
