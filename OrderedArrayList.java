import java.util.ArrayList;

public class OrderedArrayList {
	private ArrayList<Integer> _data;
	public OrderedArrayList(){
		_data = new ArrayList<Integer>();
	}
	public void add(int value){
		int idx = Utils.binarySearchInsert(_data,value);
		_data.add(idx,value);
	}
	
	public String toString(){
        	String retStr = "[";
        	for( int i = 0; i < _data.size(); i++ ) {
        	    retStr += _data.get( i );
        	    if( i != _data.size() - 1 )
        	        retStr += ", ";
        	}
        	retStr += "]";
        	return retStr;
   	}
   		
}
