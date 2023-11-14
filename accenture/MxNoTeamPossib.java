package accenture;

import java.util.Scanner;

public class MxNoTeamPossib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m;
    
        n=in.nextInt();
        m=in.nextInt();
        

        int ans = calculateMaxTeams(n,m);
        System.out.println(ans);
        in.close();
    }

    
    // Function to calculate the maximum number of teams
    private static int calculateMaxTeams(int experienced, int freshers) {
        // To form a team, we need at least 1 experienced and 1 fresher player
        // So, the maximum number of teams is the minimum of experienced and freshers, but not exceeding half of the total players
        return Math.min(Math.min(experienced, freshers), (experienced + freshers) / 4);
    }
    
}


