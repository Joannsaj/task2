public class MarsWeight {
        public static void main(String[] args) {
            float earthWeight;
            float marsWeightt;
            double MarsWeightInDouble;
            int MarsWeightInInt;

            earthWeight = 84;
            marsWeightt = (earthWeight * 0.38F);
            System.out.println(earthWeight + "kg on Earth is " + marsWeightt + "kg on Mars");

            //from float to double
            MarsWeightInDouble = marsWeightt;
            System.out.println("Kgs on Mars after converting to double " + MarsWeightInDouble);

            //to 4 decimal places
            //System.out.printf("Kilograms on Mars displayed to four decimal places: %.4f %n " + MarsWeightInDouble);

            //floating point type cast to integer
            MarsWeightInInt = (int) MarsWeightInDouble;
            System.out.println("Kilograms on Mars when casted to integer "+MarsWeightInInt);

            //casting an int type to char
            char c = (char)MarsWeightInInt;
            System.out.println("The ASCII table equivalent of marsWeigtinint is: "+ c);

            //assign the value of performing code mathematical operation on the char character to the pot variable
            int exampleOfMathUnchar = c%2;
            System.out.println("An example of a mathematical operation on the char type: "+exampleOfMathUnchar);

        }


}
