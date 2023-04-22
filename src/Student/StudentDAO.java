package Student;
import java.util.ArrayList;
public interface StudentDAO {
    public Student getStudentByKey(String rollNo);
    public ArrayList<Student> getStudentsByBatch(String batch);
    public int getStudentCount();
}
