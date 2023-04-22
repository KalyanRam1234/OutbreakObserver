package HostelRoom;

import java.util.ArrayList;

public interface HostelDAO {
    public HostelRoom getRoomDetails(String roomno);
    public int getHostelVacancy(String hostelType);
    public int getHostelCapacity(String hostelType);
    public int getQuarantineVacancy(String hostelType);
    public int getQuarantineCapacity(String hostelType);
    public ArrayList<HostelRoom> getEmptyHRooms(String hostelType);
    public ArrayList<HostelRoom> getEmptyQRooms(String hostelType);  
    public void enterHostelRoom(String roomno, String roomType, int vacancy, int capacity, String hostelType);   
}
