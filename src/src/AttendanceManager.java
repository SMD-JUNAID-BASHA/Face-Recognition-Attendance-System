import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.LocalTime;

public class AttendanceManager {

    public void markAttendance(int studentId, String studentName) {

        try {

            // Database Connection
            Connection conn = DBConnection.getConnection();

            // SQL Query
            String query = "INSERT INTO attendance(student_id, student_name, date, time) VALUES (?, ?, ?, ?)";

            // Prepare Statement
            PreparedStatement pst = conn.prepareStatement(query);

            // Set Values
            pst.setInt(1, studentId);
            pst.setString(2, studentName);
            pst.setDate(3, java.sql.Date.valueOf(LocalDate.now()));
            pst.setTime(4, java.sql.Time.valueOf(LocalTime.now()));

            // Execute Query
            pst.executeUpdate();

            System.out.println("Attendance Marked Successfully");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
