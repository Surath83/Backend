public class doubtrispace {
    public static void main(String[] args){
        int count=0;
        String a = "i am  surath";
        char[] charArray = a.toCharArray();
        for(int i=0;i<charArray.length;i++){
            if(charArray[i]==' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
