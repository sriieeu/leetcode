class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        String a = "";
        for(int i = arr.length -1 ; i >= 0 ;i--){
            a= a+ " " +arr[i]; 
        }
          a=a.trim();
  return a;
    }
}