package project5;

/*ArrayList ADT using array*/
public class ArrayList<E> {
	private static final int SIZE = 50;
	private Edge data[];
	private int index;
	private int size;
	
	//constructor
	public ArrayList(){
		this.data=new Edge[SIZE];
		this.size=SIZE;
	}
		
	//add to arraylist
	public void add(Edge edge){
		if(index == size-1){
			increase_size();
		}
		data[index] = edge;
		index++;
	}
	
	private void increase_size() {
		size = size + SIZE;
		Edge add_data[] = new Edge[size];
		for(int i=0; i < data.length; i++){
			add_data[i] = data[i];
		}
		data=add_data;
	}
	
	//get an element of arraylist
	public Edge get(int i) throws Exception{
		if(i > index-1){
			throw new Exception("ArrayIndexOutOfBound");
		}
		if(i < 0){
			throw new Exception("Value is negative");
		}
		return data[i];
		
	}
	
	//remove an element of arraylist
	public void remove(int i) throws Exception{
		if(i > index-1){
			throw new Exception("ArrayIndexOutOfBound");
		}
		if(i < 0){
			throw new Exception("Value is negative");
		}
		for(int j=i; j < data.length-1; j++){
			data[j] = data[j+1];
		}
		index--;
	}
	
	//method to check size
	public int size() {
		return size;
	}
}


