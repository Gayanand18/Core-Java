class Subject2
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtains;
    
    public Subject2(String subID,String name,int maxMarks)
    {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }
    
    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtains(){return marksObtains;}
    
    public void setMaxMarks(int mm)
    {
        maxMarks=mm;
    }
    
    public void setMarksObtain(int m)
    {
        marksObtains=m;
    }
    
    boolean isQualified()
    {
        return marksObtains>=maxMarks/10*4;
    }
    
    public String toString()
    {
        return"\n SubjectID: "+subID+"\n Name "+name+"\n MarksObtained "+marksObtains;
    }
    
}

public class ArrayOfObjectChallenge {
    public static void main(String[] args) 
    {
        Subject2 subs[]=new Subject2[3];
        subs[0]=new Subject2("s101","DS",100);
        subs[1]=new Subject2("s102","Algorithms",100);
        subs[2]=new Subject2("s103","Operating Systems",100);
        
        for(Subject2 s:subs)
            System.out.println(s);
    }
    
}
