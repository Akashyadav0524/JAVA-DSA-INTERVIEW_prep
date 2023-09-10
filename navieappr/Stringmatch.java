package navieappr;



public class Stringmatch {
    public static void main(String[] args) {
        String S1="AABBCDSFAABBHGDU";
        String S2="AABB";
        int ans = serch(S1, S2);
        if(ans!=-1){
            System.out.println("found at"+ans);
        }
        else{
            System.out.println("not found");
        }
    }

    public static int serch(String S1,String S2){
        int a=S1.length();
        int b=S2.length();

        for (int i = 0; i < a-b; i++) {
            int j;
            for (j = 0; j < b; j++) {
                if(S1.charAt(i+j)!=S2.charAt(j)){
                    break;
                }
            }
            if(i==j){
                return i;
            }
        }

        return -1;
    }
}
