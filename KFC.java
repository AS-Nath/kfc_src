import java.util.*;
class KFC
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Dictionary cart = new Hashtable();
        while(true)
        {    
            System.out.print("\f");
            System.out.println("MENU:");
            System.out.println("Enter 1 for Starters");
            System.out.println("Enter 2 for Burgers:");
            System.out.println("Enter 3 for Drinks:");
            System.out.println("Enter 4 to confirm order");
            System.out.println("Enter 5 to view cart.");

            int a = sc.nextInt();
            int p1 = 0;
            int p2 = 0;
            int p3 = 0;
            switch(a)
            {
                case 1:
                    //STARTERS
                    p1 = 1;
                    p2 = 2;
                    p3 = 3;
                    System.out.println("Enter the respective number to choose an item.");
                    System.out.printf("(1) French Fries, Price: $%d \n", p1);
                    System.out.printf("(2) Chicken Popcorn, Price: $%d \n", p2);
                    System.out.printf("(3) Chicken Lollipop, Price: $%d \n", p3);
                    int s = sc.nextInt();
                    
                    if (s == 1)
                    {
                        cart.put("French Fries", p1);
                    }
                    else if (s == 2)
                    {
                        cart.put("Chicken Popcorn", p2);
                    }
                    else if (s == 3)
                    {
                        cart.put("Chicken Lollipop", p3);
                    }
                    else
                    {
                        System.out.println("WRONG INPUT");
                    }
                    break;
                case 2:
                    //BURGERS
                    p1 = 1;
                    p2 = 2;
                    p3 = 3;
                    System.out.println("Enter the respective number to choose an item.");
                    System.out.printf("(1) Veg Zinger, Price: $%d \n", p1);
                    System.out.printf("(2) Chicken Zinger, Price: $%d \n", p2);
                    System.out.printf("(3) Chicken Zinger Supreme, Price: $%d \n", p3);
                    int b = sc.nextInt();
                    
                    if (b == 1)
                    {
                        cart.put("Veg Zinger", p1);
                    }
                    else if (b == 2)
                    {
                        cart.put("Chicken Zinger", p2);
                    }
                    else if (b == 3)
                    {
                        cart.put("Chicken Zinger Supreme", p3);
                    }
                    else
                    {
                        System.out.println("WRONG INPUT");
                    }
                    break;
                case 3:
                    //DRINKS
                    p1 = 1;
                    p2 = 2;
                    p3 = 3;
                    System.out.printf("(1) Pepsi, Price: $%d \n", p1);
                    System.out.printf("(2) Coca-Cola, Price: $%d \n", p2);
                    System.out.printf("(3) Fanta, Price: $%d \n", p3);
                    int d = sc.nextInt();
                    
                    if (d == 1)
                    {
                        cart.put("Pepsi", p1);
                    }
                    else if (d == 2)
                    {
                        cart.put("Coca-Cola", p2);
                    }
                    else if (d == 3)
                    {
                        cart.put("Fanta", p3);
                    }
                    else
                    {
                        System.out.println("WRONG INPUT");
                    }
                    break;
                case 4:
                    printOut(cart);
                    System.exit(1);
                    break;
                case 5:
                    printOut(cart);
                    System.out.println("Press 1 to continue. [Other input will not register]");
                    int x;
                    do
                    {
                        x = sc.nextInt();
                    }
                    while(x != 1); 
                    break;
                default:
                    System.out.println("WRONG INPUT");
            }
        }
    }
    public static int printOut(Dictionary cart)
    {
        for (Enumeration i = cart.elements(), e = cart.keys(); i.hasMoreElements();)
        {
            System.out.println(e.nextElement() + ", $" + i.nextElement());
        }
        return 0;
    }
}
