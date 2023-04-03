public class Voter {
    public static void main(String[] args) //throws InvalidAgeException
     {

        try {
            validate(12);
        } catch (InvalidAgeException ex){
            System.out.println("Exception occured:"+ex);
        }

         System.out.println("The rest of code");

    }

    static void validate (int age) throws InvalidAgeException{
        if( age<18){
            // бросает новый InvalidAgeException
            throw new InvalidAgeException("age is not valid to vote");
            //возраст не подходит для голосования
        }
        else{
            System.out.println("Welcome to vote");
        }
    }
}
