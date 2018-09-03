import java.util.HashMap;
import java.util.Map;

public class TwoSum_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static int[] twoSumSolution(int[] nums,int target ){
    	int[] res=new int[2];
    	if(nums == null || nums.length == 0){
    		return res;
    	}
    	Map<Integer,Integer> hm=new HashMap<>();
    	for(int i=0;i<nums.length;i++){
    		if(!hm.containsKey(target-nums[i])){
    			hm.put(nums[i],i);
    		}else{
    			res[0]=hm.get(target-nums[i]);
    			res[1]=i;
    		}
    	}
    	return res;
    }
    
}
