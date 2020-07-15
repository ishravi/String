
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String res = longestCommonPrefix("abab","baba");
		
		
		System.out.println(res);

	}
    public static String longestCommonPrefix(String s1,String s2) {

    	if(s1.length() == 0 || s2.length() ==0 ) return "";

    	int[][] cache = new int[s1.length()][s2.length()];
    	String out = "";

    	for(int i=0;i<s1.length();i++){
    		for(int j=0;j<s2.length();j++){
    			if(s1.charAt(i) == s2.charAt(j)){
    				if(i==0 || j==0){
    					cache[i][j]=1;
    				}else{
    					cache[i][j]=cache[i-1][j-1] +1;
    				}
    	
    			}
    			if(cache[i][j] > out.length()){
    				out = s1.substring(i-cache[i][j]+1,i+1);
    			}	

    		}

    	}
    	return out;
    }
    
	

}


