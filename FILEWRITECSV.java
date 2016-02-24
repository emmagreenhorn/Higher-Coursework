
/**
 * Write a description of class FILEREADCSV here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
                   // for general file handling
public class FILEWRITECSV
{
   // file object to open, read and close a file
   private FileWriter fWriter;    // an object to fetch data from file

   // (no class constructor, just use default constructor)

   public void writeCSVtable(String outBuffer) throws IOException
   {
       String csvFile;
       // Create a file chooser
       File currentDir = new File("").getAbsoluteFile();
       final JFileChooser fc = new JFileChooser(currentDir);
       // In response to a button click:
       int returnVal = fc.showSaveDialog(null);
       // open file
       File = fc.getSelectedFile();
       // obtain filename
       csvFile = file.getName();
       // open the file
       fWriter = new FileWriter(csvFile);   
       // write ALL the to the file in 1 burst
       fWriter.write(outBuffer);
       // close the file
       fWriter.close();
   }  
}


