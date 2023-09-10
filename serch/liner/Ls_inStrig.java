package serch.liner;

public class Ls_inStrig {
    public static void main(String[] args) {
        String name ="akash";
        char traget ='h';
        System.out.println(serch(name,traget));
        System.out.println(serch2(name,traget));
    }
    public static int  serch(String str,char target){
        if(str.length()==0){
            return -1;
        }
        for(int i =0;i< str.length(); i++){
            if(target == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }


     public static boolean serch2(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }

}
