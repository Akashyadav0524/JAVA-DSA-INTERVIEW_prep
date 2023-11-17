package accenture;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VoteWinner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of N-- ");
        int N =in.nextInt();

        in.nextLine();

        System.out.print("Enter the voters separated by space: ");
        String inp=in.nextLine();

        String[] str= inp.split(" ");

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        System.out.print("Enter the age of voters separated by space: ");
        String inpV=in.nextLine();

        String[] strV= inpV.split(" ");

        int[] arrofV = new int[N];
        for (int i = 0; i < N; i++) {
            arrofV[i] = Integer.parseInt(strV[i]);
        }

            int ans = LegalVoteCount(arr,arrofV,N);
            System.out.println(ans);
            in.close();
        
    }

    private static int LegalVoteCount(int[] arrofP, int[] arrofV, int n) {
        

        if(arrofP.length!=arrofV.length){
            return -1;
        }

        Map<Integer, Integer> voteCount = new HashMap<>();
        int maxVotes=0;
        int winner =-1;

        for (int i = 0; i < arrofP.length; i++) {
            int person=arrofP[i];
            int age = arrofV[i];

            if(age>=18){
                voteCount.put(person, voteCount.getOrDefault(person, 0) + 1);

                int  currentVotes = voteCount.get(person);
                if(currentVotes>maxVotes){
                    maxVotes=currentVotes;
                    winner=person;
                }
            }

        }
        return winner;



    }
}
