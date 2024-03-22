import java.io.BufferedWriter;
import java.io.IOException;

public class GradesCategory {
	private double low,high;
	private int counter,conterForGrades;
	
	public GradesCategory(double low, double high) {
		this.low = low;
		this.high = high;
		this.counter = 0;
		this.conterForGrades = 0;
	}
	
	public void testNumber(Double number) {
		counter++;
		if(number>=low  && number<=high)
			conterForGrades++;
	}
	
	public double percent() 
	{
		return (double) conterForGrades / counter * 100;
	}
	public void writeResult(BufferedWriter writer) throws IOException {
	writer.write("[" + low + "," + high + "]  " + percent()+ "%\n");
	}
	
}
