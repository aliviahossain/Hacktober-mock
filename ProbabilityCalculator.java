import java.util.scanner;
public class Probability
{
public static void main()
{
Scanner scanner = new Scanner(System.in);
double s,c,fs;
System.out.println("Enter chances of seeing a smoke: ");
s=scanner.nextInt();
System.out.println("Enter chances of a house in fire due to smoke: ");
fs=scanner.nextInt();
c=fs/s;
System.out.println("Chances of smoke due to fire: "+c);
}
scanner.close();
}
