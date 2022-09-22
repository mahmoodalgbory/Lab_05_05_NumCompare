public class Main
{
    public static void main(String[] args)
    {
        int firstInteger = 12;
        int secondInteger = 13;

        if (firstInteger == secondInteger)
            System.out.println("The numbers you compared are equal to each other. ");
        else if ( firstInteger < secondInteger)
        {
            System.out.println("The numbers you compared are not equal the smaller number is: " + firstInteger);
        }
        else
            System.out.println("The numbers you compared are not equal the smaller number is: " + secondInteger);
    }
}



//num firstInteger
//    num secondInteger
//
//    output "Enter an integer here: "
//    input firstInteger
//    output "Enter another integer here: "
//    input secondInteger
//
//    if firstInteger == secondInteger then
//    	output "The numbers you compared are equal to each other. "
//    else firstInteger < secondInteger
//    	output "The numbers you compared are not equal the smaller number is: " + firstInteger
//else firstInteger  >  secondInteger
//    	output "The numbers you compared are not equal the smaller number is: " + secondInteger
//    endIf