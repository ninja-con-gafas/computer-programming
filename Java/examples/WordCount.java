package examples;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
public class WordCount
{
	public static void main(String args[])
	{
		Words words=new Words();
		for (HashMap.Entry<String, Integer> pair: words.countWords().entrySet())
		{
            System.out.format("Word: %s, Count: %d%n", pair.getKey(), pair.getValue());
		}
	}
}
class Words
{
	private HashMap<String, Integer> wordCount=new HashMap<String, Integer>();
	private File file;
	private String word;
	public Words()
	{
		file=new File();
	}
	public HashMap<String, Integer> countWords()
	{
		Scanner words=new Scanner(file.getFile());
		words.useDelimiter(",");
		while(words.hasNext())
		{
			word=words.next().toLowerCase();
			if(wordCount.containsKey(word))
				wordCount.put(word,wordCount.get(word)+1);
			else
				wordCount.put(word,1);
		}
		words.close();
		return wordCount;
	}
}
class File
{
	private String filePath;
	private FileReader file;
	public File()
	{
		try
		{
			file=new FileReader(getFilePath());
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Enter a valid path for a text file\n"+e);
		}

	}
	private String getFilePath()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter path for a text file");
		filePath=input.nextLine();
		input.close();
		return filePath;
	}
	public FileReader getFile()
	{
		return file;
	}
}
