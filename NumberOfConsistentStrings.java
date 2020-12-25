class Solution {
    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(int i=0;i<words.length;i++){
            boolean flag=true;
            for(int j=0;j<words[i].length();j++){
                char c=words[i].charAt(j);

                if(allowed.indexOf(c)==-1){
                    flag=false;
                    break;
                }
            }
            if(flag)
                count++;
        }
        return count;
    }

}


public class NumberOfConsistentStrings {


    public static void main(String[] args) {
        String allowed = "abc     ";
        String[] words = {"a","b","c","ab","ac","bc","abc"};

        int result = Solution.countConsistentStrings(allowed, words);
        System.out.println(String.valueOf(result));
    }

}
