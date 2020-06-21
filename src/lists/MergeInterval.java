package lists;

import java.util.ArrayList;

public class MergeInterval {
	
	
	
	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        
        if(intervals == null){
            intervals= new ArrayList<Interval>();
            intervals.add(newInterval);
            return intervals;
        }
        else if(intervals.size()== 0){
            intervals.add(newInterval);
            return intervals;
        }
        
        
        Interval toInsert = newInterval;
        
        int i=0;
        while(i< intervals.size()){
            Interval current = intervals.get(i);
            if(current.end < toInsert.start){
                i++;
                continue;
            }
            else if(current.start > toInsert.end){
                intervals.add(i,toInsert);
                break;
            }
            else{
                toInsert.start= Math.min(toInsert.start, current.start);
                toInsert.end= Math.max(toInsert.end, current.end);
                intervals.remove(i);
                
            }
        }
        if(i== intervals.size()){
            intervals.add(toInsert);
        }
        return intervals;
    }
	
	public static void main(String args[]) {
		Interval available= new Interval(3,5);
		
		
	}


}

