package UseCases.useCase3;

public class useCase3{
    private String studentId, roomNo;
    private String vstatus, vdoses;
    private String rtpcr_id, rtpcr_testDate, rtpcr_testResult;
    private int infected=0;

    public useCase3(){}

    public useCase3(String studentId, String roomNo, String vstatus, String vdoses, String rtpcr_id, String rtpcr_testDate, String rtpcr_testResult, int infected){
        this.studentId=studentId;
        this.roomNo=roomNo;
        this.vstatus=vstatus;
        this.vdoses=vdoses;
        this.rtpcr_id=rtpcr_id;
        this.rtpcr_testDate=rtpcr_testDate;
        this.rtpcr_testResult=rtpcr_testResult;
        this.infected=infected;
    }

    public String getStudentId() {return studentId;}
    public String getRoomNo() {return roomNo;}
    public String getvStatus() {return vstatus;}
    public String getvDoses() {return vdoses;}
    public String getRTPCRId() {return rtpcr_id;}
    public String getRTPCRTestDate() {return rtpcr_testDate;}
    public String getRTPCRTestResult() {return rtpcr_testResult;}
    public int getInfected() {return infected;}
}
