public class SwitchCaseDemo {
    public static void main(String[] args) 
    {
        String str="3";
        
        switch(str)
        {
            case "1": System.out.println("One");
                    break;
            case "2": System.out.println("Two");
                    break;
            case "3": System.out.println("Three");
                    break;
            default : System.out.println("Invalid");       
        }
    }
}
