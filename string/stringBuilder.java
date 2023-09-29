

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder bd =new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch =(char)('a'+i);
            bd.append(ch);
            
        }
        System.out.println(bd.toString());
      
        System.out.println(bd.capacity());
        System.out.println(bd.charAt(23)); 
        
    }
}
