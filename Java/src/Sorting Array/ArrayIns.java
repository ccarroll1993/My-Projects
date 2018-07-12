// insertSort.java
// demonstrates insertion sort
// to run this program: C>java InsertSortApp
//--------------------------------------------------------------
class ArrayIns
{
	private long[] a; // reference to array a
	private int nElems; // number of data items
	//--------------------------------------------------------------
	public ArrayIns(int max) // constructor
	{
		a = new long[max]; // create the array
		nElems = 0; // no items yet
	}
	//--------------------------------------------------------------
	public void insert(long value) // put element into array
	{
		a[nElems] = value; // insert it
		nElems++; // increment size
	}
	//--------------------------------------------------------------
	public void display() // displays array contents
	{
		for(int j=0; j<nElems; j++) // for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}
	//--------------------------------------------------------------
	public void insertionSort()
	{
		int in, out;
		for(out=1; out<nElems; out++) // out is dividing line
		{
			long temp = a[out]; // remove marked item
			in = out; // start shifts at out
			while(in>0 && a[in-1] >= temp) // until one is smaller,
			{
				a[in] = a[in-1]; // shift item to right
				--in; // go left one position
			}
			a[in] = temp; // insert marked item
		} // end for
	} // end insertionSort()
	//-----------------------------------------------------------------
	public void noDups() {

	    for (int i = 0; i < nElems; i++) {
	        for (int j = i + 1; j < nElems; j++) {
	            if (a[i] == a[j]) {                  
	                for (int k = j+1; k < nElems; k++, j++) {
	                    a[j] = a[k];
	                }
	                nElems--;
	                j--;
	            }
	        }
	    }
	} // end noDups()
} // end class ArrayIns
////////////////////////////////////////////////////////////////