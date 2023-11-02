/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */

public class MyHashMap {
		ArrayList<Integer> sSey, sValue;

		public MyHashMap() {
			sKey = new ArrayList<>();
			sValue = new ArrayList<>();
    }
    
    public void put(int key, int value) {
    	if(empty()) {
    		sKey.add(key);
    		sValue.add(value);
    	}
    	else if(!sKey.contains(key)) {
    		sKey.add(key);
    		sValue.add(value);	
    	}
    	else {
    		return;
    	}
    }
    
    public int get(int key) {
    	if(!empty()) {
    		return sValue.get(key);
    	}
    	return -1;
    }
    
    public void remove(int key) {
    	if(!empty()) {
    		sKey.remove(key);
    		sValue.remove(key);
    	}
    }

    public boolean empty() {
    	return key.isEmpty();
    }
}