package player;

// import java.util.Scanner;

public class Player {
    private String name;
    private String emailId;
    private String contactNo;
    private String state;
    private int age;

    // public  Player(String name, String emailId,String contactNo, int age, String state)
    // {
    //     this.name = name;
    //     this.emailId = emailId;
    //     this.contactNo = contactNo;
    //     this.age = age;
    //     this.state = state;
    // }

    public void setPlayerDetails(String name, String emailId,String contactNo, int age, String state)
    {
        this.name = name;
        this.emailId = emailId;
        this.contactNo = contactNo;
        this.age = age;
        this.state = state;
    }

    // public  Player setPlayerDetailFromConsole()
    // {
    //     Scanner scn=new Scanner(System.in);
    //     System.out.println("Enter the Player name :");
    //     String name = scn.nextLine();

    //     System.out.println("Enter the emailId :");
    //     String emailId = scn.nextLine();

    //     System.out.println("Enter the contactNo :");
    //     String contactNo = scn.nextLine();

    //     System.out.println("Enter the State :");
    //     String state = scn.nextLine();

    //     System.out.println("Enter the age:");
    //     int age = scn.nextInt();

    //     Player p1 = new Player();
    //     p1.setPlayerDetails(name,emailId, contactNo, age, state);
    //     return p1;
    // }

    public void setPlayerName(String name)
    {
        this.name = name;
    }

    public void getPlayerDetails()
    {
        System.out.println("Player name is " +this.name);
        System.out.println("EmailId is "+ this.emailId);
        System.out.println("Contact no is "+ this.contactNo);
        System.out.println("Age is "+ this.age);
        System.out.println("State is "+state);
    }

    public String getPlayerName()
    {
        return name;
    }

    public String getPlayerEmailId()
    {
        return emailId;
    }
}
