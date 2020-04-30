package Class1;

public class LearnDataType {

    public static void main(String[] args) {


        // Syntax to create variable: <dataType><variableName>=<value>

        // 1. Number of hours in a day

        byte numberOfHoursDay = 24;
        System.out.println("Number of hours in a day = " + numberOfHoursDay);

        /*
        Data type specifies the size and type of values that can be stored in an identifier. Byte can
        store only whole numbers ranging from -127 to 128. As my value is a whole number, falls into this
        range and cannot exceed a given range, in order to save memory, byte data type is used.
         */

        // 2. Number of max # of days in a year

        short numberOfDaysInYear = 365;
        System.out.println("Maximum number of days in a year = " + numberOfDaysInYear);

        /*
        Short can store only whole numbers ranging from -32,678 to 32,767. As my value is a whole number,
        will definitely not exceed the range from -32,678 to 32,767, similar to byte, I use a short to save
        memory in large arrays, in situations where the memory savings actually matters.
         */

        // 3. Total number of employees in an organization

        int numberOfEmployees = 2200000;
        System.out.println("Number of employees in an organization = " + numberOfEmployees);

        /*
        According to my Google research, the total number of employees in an organization can be
        as much as 2,200,000. For example, according to a list published in 2019 by Fortune magazine,
        Walmart had 2,200,000 employees.
         */

        // 4. Population in a country

        int populationInCountry = 1439323776;
        System.out.println("Population in a country = " + populationInCountry);

        long populationOfCountry = 1439323776;
        System.out.println("Population in a country = " + populationOfCountry);

        /*
        Int can store only the whole numbers ranging from -2,147,000,000 to 2,147,000,000. My value won't
        exceed the range in the nearest future that's why I can use int data type in order to save memory.
        Long data type is applicable too.
         */

        // 5. Interest rate

        float interestRate = 3.2f;
        System.out.println("Interest Rate = " + interestRate);
        // or
        double interestRateIs = 3.2;
        System.out.println("Interest rate is " + interestRateIs);

        /*
        Floating-point numbers, also known as real numbers, are used when evaluating expressions that
        require fractional precision. Use a float (instead of double) if you need to save memory in large
        arrays of floating point numbers. Along with new advanced technologies the memory subject is not
        an issue anymore. We can simply use double data type.
         */

        // 6. Balance in a bank

        double balanceInBank = 567.23;
        System.out.println("Balance in a bank = " + balanceInBank);

        // For decimal values, this data type is generally the default choice.

        // 7. Does the sun rise from the west?

        boolean isSunRisingWest = false;
        System.out.println("Does the sun rise from the west? = " + isSunRisingWest);

        // Boolean data type represents only one bit of information either true or false.

        //8. Initials of your name

        char initialName = 'M';
        char initialLastName = 'B';
        System.out.println("Initials of my name: " + initialName + initialLastName);
        // or
        System.out.print("Initials of my name: " + initialName);
        System.out.println(initialLastName);

        // The char data type is a single 16-bit Unicode character. A char is a single character.

        // 9. Your name

        String myName = "Mariya";
        System.out.println("My name is " + myName);

        // String represents sequence of char values.

    }
}


