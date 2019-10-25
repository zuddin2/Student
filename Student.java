import java.util.Scanner;
class Student {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int N;
        String name = "";
        getInfo(N = input.nextInt());
        displayInfo();
        count(N);
    }

    public static void getInfo(int N) {
        Scanner input = new Scanner(System.in);
        String[] fname = new String[N];

        System.out.println("Enter the information for each student: ");
        for (int i = 0; i < N; i++) {
            System.out.println("STUDENT " + (i + 1) + " \nFirst name: ");
            while (!input.hasNext("[a-zA-Z]*")){
                System.out.println("Only letters please!\nTry Again: ");
                input.next();
            }
            fname[i] = input.next();
            System.out.println("Last name: ");
            while (!input.hasNext("[a-zA-Z]*")){
                System.out.println("Only letters please!\nTry Again: ");
                input.next();
            }
            String lname = input.next();
            System.out.println("PeopleSoft ID: ");
            while (!input.hasNext("[0-9]{1,7}+")){
                System.out.println("7 digits or less & numbers only!\nTry Again: ");
                input.next();
            }
            int id = input.nextInt();
            System.out.println("Class Standing\n1.Freshman\n2.Sophomore\n3.Junior\n4.Senior\nPlease pick one: ");
            int standing = input.nextInt();
            switch(standing){
                    case 1:
                        System.out.println("Freshman selected.");
                        break;
                    case 2:
                        System.out.println("Sophomore selected.");
                        break;
                    case 3:
                        System.out.println("Junior selected.");
                        break;
                    case 4:
                        System.out.println("Senior selected.");
                        break;
                    default:
                        System.out.println("Incorrect input\nTry again: ");
                        standing = input.nextInt();
            }
            System.out.println("Email: ");
            String email = input.next();
            if (email.matches("^[a-zA-Z1-9]+@[a-zA-Z1-9]+.(com|edu|org)$")){
                System.out.println("Accurate email.");
            }else{
                System.out.println("Incorrect email\nTry again: ");
                email = input.next();
            }
            System.out.println("Address: ");
            input.nextLine();
            String addy = input.nextLine();
            if (addy.matches("[0-9]+[ ]\\D+")){
                System.out.println("Correct address.");
            }else{
                System.out.println("Incorrect address\nTry again: ");
                addy = input.next();
            }
            System.out.println("City: ");
            String city = input.nextLine();
            if (city.matches("[a-zA-Z]*")){
                System.out.println("Accurate city.");
            }else{
                System.out.println("Invalid city\nTry again: ");
                city = input.next();
            }
            System.out.println("State (for example NY): ");
            String state = input.nextLine();
            if (state.matches("^(?-i:A[LKSZRAEP]|C[AOT]|D[EC]|F[LM]|G[AU]|HI|I[ADLN]|K[SY]|LA|M[ADEHINOPST]|N[CDEHJMVY]|O[HKR]|P[ARW]|RI|S[CD]|T[NX]|UT|V[AIT]|W[AIVY])$")){
                System.out.println("Valid state.");
            }else{
                System.out.println("Invalid state\nTry again: ");
                state = input.next();
            }
            System.out.println("ZIP Code: ");
            while (!input.hasNext("[0-9]{9}+")){
                System.out.println("9 digits & numbers only: ");
                input.next();
            }
            int zip = input.nextInt();
        }
    }
    public static void displayInfo(){
        System.out.println("Students Details, Department of ILT");



    }
    public static int count(int N){
        int count = N;
        System.out.println("Number of students: " + count);
        return N;
    }
}