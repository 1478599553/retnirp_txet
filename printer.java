import javax.swing.*;
import java.io.*;
import java.util.*;

public class printer
{
	public static void main (String[] args) throws Exception
	{
	String dir;
	String inputChar;
	String encoded;
	
	dir = System.getProperty("user.dir");
	OutputStream output = new FileOutputStream(dir+File.separator+"加密字符输出.txt");
	
	Scanner input = new Scanner(System.in);
	Scanner encode = new Scanner(System.in);
	System.out.println("请输入需要转换的编码类型");
	encoded = encode.nextLine();
	System.out.println("请输入需要加密的文字（支持多个字符）");
	inputChar = input.nextLine();  
	output.write(inputChar.getBytes(encoded));
	output.close();
	System.out.println("ready.");
	}
}
