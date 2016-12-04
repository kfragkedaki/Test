import java.util.Random;
import java.util.Scanner;

public class Dice {
    private int[] frequency=new int[6];

    public int roll() {
        Random randomNumbers = new Random();
        int x;
        x=randomNumbers.nextInt(6);
        return x;
    }

	public void updateFrequency(int x) {
	frequency[x]++;
	}

 	public void printFrequencies() {
	System.out.printf("Πόσες φορές εμφανίστηκε κάθε αριθμος:\n1:%d\n2:%d\n3:%d\n4:%d\n5:%d\n6:%d\n",frequency[0],frequency[1],frequency[2],frequency[3],frequency[4],frequency[5]);}
	}

