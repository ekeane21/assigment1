
import java.util.Date;
import org.joda.time.DateTime;

public class CourseProgramme {
private String courseName;
private Module module;
private DateTime start= new DateTime();
private DateTime end= new DateTime();

    public String getCourseName() {
        return courseName;
    }

    public Module getModule() {
        return module;
    }

    public DateTime getStart() {
        return start;
    }

    public DateTime getEnd() {
        return end;
    }


}
