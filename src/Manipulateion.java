
public class Manipulateion {
	private int order;
	private int[][] pegs;
	
	//initiation of the pegs based on the order of the device
	public Manipulateion(int n) {
		this.order = n;
		pegs= new int[n][3];
		//the peg that the ring is on
		for(int i = 0;i<n;i++) {				
			this.pegs[i][0]=i+1;				
		}
	}
	public void PrintPegs() {
		System.out.println("----------------");
		for(int i=0;i<this.pegs.length;i++) {
			//System.out.println(pegs[i].toString());
			System.out.println(this.pegs[i][0]+" ,"+this.pegs[i][1]+" ,"+this.pegs[i][2]);
		}
		
	}
	//returns true if number can be put into the specific given column
	private boolean isabove(int num,int column) {
		boolean result = true;
		for(int i=0;i<num;i++) {
			
			if(pegs[i][column]>0) {
				result = false;
			}
		System.out.println("num is = "+pegs[i][column]);
		}
		return result;
	}
	//under construction please be patient...
	public void solve() {
		PrintPegs();
		System.out.println(isabove(3,0));
	}
}
