import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradesCalculation {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Grades interval file name = intervale.dat \nNumber file name = numere.dat \nOut file name = statistica.dat");
		System.out.println("\nName of the grades interval file");
		String intervalFile = scan.nextLine();
		System.out.println("Name of the number file ");
		String numberFile = scan.nextLine();
		System.out.println("Name of out file ");
		String outFile = scan.nextLine();

		
		List<GradesCategory> intervals = new ArrayList<>();
		
		try
		{
			BufferedReader intervalReader = new BufferedReader(new FileReader(intervalFile));
			String intervalLine = intervalReader.readLine();
			while(intervalLine != null) 
				{
					intervalLine=intervalLine.replaceAll("[\\[\\]]", "");
					String[] lowsHighs = intervalLine.split(",");
					double low = Double.parseDouble(lowsHighs[0]);
					double high = Double.parseDouble(lowsHighs[1]);
					GradesCategory interval = new GradesCategory(low, high);
	                intervals.add(interval);
	                
	                intervalLine= intervalReader.readLine();


				}
				intervalReader.close();
		
				
			BufferedReader numberReader = new BufferedReader(new FileReader(numberFile));
			String numberLine = numberReader.readLine();
			while(numberLine != null) 
			{
				String[] numbers = numberLine.split("\\s+");
				for (String numersString : numbers)
				{
					Double number = Double.parseDouble(numersString);
					for (GradesCategory interval : intervals)
						interval.testNumber(number);
				}
				numberLine= numberReader.readLine();

			}
			numberReader.close();
			
			BufferedWriter outFileWriter = new BufferedWriter(new FileWriter(outFile));
			for (GradesCategory interval : intervals)
				interval.writeResult(outFileWriter);
			outFileWriter.close();

			System.out.println("Statisticile au fost scrise in fisierul \"" + outFile + "\".");

			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
