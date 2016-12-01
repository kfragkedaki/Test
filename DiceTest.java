import java.util.Scanner;
public class DiceTest
{
public static void main(String args[])
{
System.out.println("Eισάγετε έναν θετικό ακέραιο αριθμό");
Scanner input=new Scanner(System.in);
int n=input.nextInt();
Dice game=new Dice();
for(int i=1;i<=n;i++)
{int x=game.roll();
game.updateFrequency(x);
}
game.printFrequencies();
}
}