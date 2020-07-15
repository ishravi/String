import java.util.HashMap;

public class twoDistinctCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a";
		
		int left=0,right=0,max=0;
		HashMap<Character,Integer> hashmap = new HashMap();
		while(right < s.length()){

			hashmap.put(s.charAt(right),right);
			right++;
			if(hashmap.size() > 2 ){
				int min = s.length();
				for(int index : hashmap.values())  min = Math.min(min,index);
				hashmap.remove(s.charAt(min));
				left = min+1;
			}

			max =  Math.max(max,right - left);

		}
		System.out.println( max);

	}

}
