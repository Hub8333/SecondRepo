import java.io.File;
import java.io.IOException;
class Demo1 
{
	public static void main(String[] args) 
	{
		System.out.println("-----Main Starts-----");
		File f1 = new File("D:/data/naveenresume.png");
		try
		{
			f1.createNewFile();/*Danger statement : clue given by compiler, Danger Statement will generate IOException*/
		    System.out.println("File is successfully created");
		}
		catch (IOException e1)
		{
			System.out.println("Given path doesnot have enough space...So file will be created in Emergency Drive");
            try
            {
				f1 = new File("E:/backup/info.pdf");
				f1.createNewFile();
            }
            catch (IOException e2)
            {
               System.out.println("Emergency drive is also full...oops program will terminate...");
            }
		}
		System.out.println("-----Main Ends-----");
	}
}
