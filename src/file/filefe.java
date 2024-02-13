
package file;

import java.io.File;

/**
 *
 * @author nssho
 */
public class filefe {
    public static void main(String[] args) {
        //isFile
        //isDirectory
        File dir=new File("D:\\CSE\\Java\\X\\Folder");
        dir.mkdir();
        File dir1=new File("D:\\CSE\\Java\\X\\ff");
        dir1.mkdir();
        File ff=new File("D:\\CSE\\Java\\X\\ff\\sadat.txt");
        //ff.delete();
        //dir1.delete();
        String dirloc =dir.getAbsolutePath();
        System.out.println(dirloc);
        if(dir.exists())
            System.out.println("Directory Exists:");
        File file1=new File("D:\\CSE\\Java\\X\\Folder\\sadat.txt");
        File file2=new File(dirloc+"\\sam.txt");
        File file3=new File(dirloc+"\\sami.txt");
        try{
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        }
        catch(Exception e){
            System.out.println("Exception :"+e);
        }
        if(file1.isFile())
            System.out.println("isFile");
        else
            System.out.println("isDirectory");
        if(file1.exists())
            System.out.println("File1 Exists");
        if(file2.delete())
            System.out.println("File 2 has been deleted.");
        System.out.println(file2.exists());
        dir.delete();
    }
    
}
