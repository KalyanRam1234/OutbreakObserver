package Quarantine;

public class Quarantine {
    private String caseId;
    private String startDate, healthStatus;
    private String duration;
    
    public Quarantine( ) {}

    public Quarantine(String caseId, String startDate, String healthStatus, String duration){
        this.caseId=caseId;
        this.startDate=startDate;
        this.healthStatus=healthStatus;
        this.duration=duration;
    }

    public String getcaseId() { return caseId; }
    public String getDate() { return startDate; }

    public String getStatus() { return healthStatus; }

    public String getDuration() { return duration;}

}
