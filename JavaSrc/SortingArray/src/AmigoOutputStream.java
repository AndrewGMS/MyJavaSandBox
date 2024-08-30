import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class AmigoOutputStream extends FileOutputStream {
//    public static String fileName = "C:/tmp/result.txt";
    public static String fileName = "Y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data.txt";
    FileOutputStream fileOutputStream;

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }


    public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException {
      super(fileName);
      this.fileOutputStream = fileOutputStream;
    }

    @Override
    public void write(int b) throws IOException {
        fileOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        super.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fileOutputStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        flush();
        write("JavaRush © All rights reserved.".getBytes());
        fileOutputStream.close();
    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }
}
