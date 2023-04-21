package HostelRoom;

public class HostelRoom {
    private String roomNo, roomType;
    private int capacity,vacancy;

    public HostelRoom(){}

    public HostelRoom(String roomNo, String roomType, int capacity, int vacancy, String hostelType){
        this.roomNo=roomNo;
        this.roomType=roomType;
        this.capacity=capacity;
        this.vacancy=vacancy;
    }
    
    public String getroomNo() { return roomNo; }
    public String getroomType() { return roomType; }
    public int getCapacity() { return capacity; }
    public int getVacancy() { return vacancy; } 

}
