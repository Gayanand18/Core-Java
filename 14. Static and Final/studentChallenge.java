import java.util.Calendar;

class Students
{
    private String rollNo;
    
    private static int count = 1;
    
    private String assignRollNo()
    {
        Calendar date = Calendar.getInstance();
        
        // Corrected the year computation
        String rno = "Univ-" + date.get(Calendar.YEAR) + "-" + count;
        count++;
        return rno;
    }

    Students()
    {
        rollNo = assignRollNo();
    }

    public String getRollNo()
    {
        return rollNo;
    }
}

public class studentChallenge
{
    public static void main(String[] args) 
    {
        Students s1 = new Students();
        Students s2 = new Students();
        Students s3 = new Students();
        
        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());
    }   
}
