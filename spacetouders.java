public class spacetouders {
    public static void main (String[] args){
        String a = "i am surath";
        char[] charArray = a.toCharArray();
        for(int i=0;i<charArray.length;i++){
            if(charArray[i]==' '){
                charArray[i] = '_';
            }
        }
        a = new String(charArray);
        System.out.println(a);
    }
}
