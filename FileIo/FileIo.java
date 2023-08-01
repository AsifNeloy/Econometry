package FileIo;
import java.io.*;
import java.util.*;



public class FileIo         //this class is to write and read from client
{	
	public FileIo(){};
	public File file;
	String centerAlign= new String("\t\t\t\t\t\t\t\t\t\t\t\t  ");
	public FileWriter writer;
	public FileReader reader;
	public BufferedReader bfr;

	public void writeInFile(String s)         //this method is to write in file (ClientHistory.txt)
	{
		try
		{
			file=new File("History.txt");
			file.createNewFile();
			writer=new FileWriter(file,true);
			writer.write(s+"\r"+"\n");
			writer.flush();
			writer.close();
		}
		catch(IOException ioe)
		{
			System.out.println("IO Exception Occurred");
		}
	}

		public void readFromFile()throws Exception          //this method is to read from file
		{
			try
			{
				reader=new FileReader(file);
				bfr=new BufferedReader(reader);
				if(file.exists()){
				String text="",temp="";


				while((temp=bfr.readLine())!=null)
				{
					 //temp=bfr.readLine();
					text=text+temp+"\n"+"\r";
				}
				System.out.print(centerAlign+text);
				reader.close();}
				else{System.out.println(centerAlign+"No entry yet!");}
			}
			catch(Exception ioe)
			{
				System.out.print("IO Exception Occurred");
			}
		}
	
}