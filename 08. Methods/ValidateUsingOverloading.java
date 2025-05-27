public class ValidateUsingOverloading {
     boolean validate(String name)
    {
        return name.matches("[a-zA-Z\\s]+");
    }
    
    
    boolean validate(int age)
    {
        return age>=3 && age<=15;
    }

    public static void main(String[] args) {
        ValidateUsingOverloading validator = new ValidateUsingOverloading();
        
        // Test name validation
        String name = "John Doe";
        boolean isNameValid = validator.validate(name);
        System.out.println("Is Name Valid: " + isNameValid);
        
        // Test age validation
        int age = 10;
        boolean isAgeValid = validator.validate(age);
        System.out.println("Is Age Valid: " + isAgeValid);
    }
}
