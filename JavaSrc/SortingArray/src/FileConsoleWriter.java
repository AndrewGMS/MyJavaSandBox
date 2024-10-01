
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter {
    private FileWriter fileWriter;

    public FileConsoleWriter(String fileName) throws IOException{
        this.fileWriter = new FileWriter(fileName);
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException {
        this.fileWriter = new FileWriter(fileName, append);
    }

    public FileConsoleWriter(File file) throws IOException {
        this.fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException {
        this.fileWriter = new FileWriter(file, append);
    }

    public FileConsoleWriter(FileDescriptor fd) throws IOException {
        this.fileWriter = new FileWriter(fd);
    }

    public void write(int c) throws IOException {
        this.fileWriter.write(c);
        System.out.println(c);
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        this.fileWriter.write(cbuf, off, len);
        System.out.println(new String(cbuf).substring(off, off + len));
    }

    public void write(String str) throws IOException {
        this.fileWriter.write(str);
        System.out.println(str);
    }

    public void write(String str, int off, int len) throws IOException {
        this.fileWriter.write(str, off, len);
        System.out.println(str.substring(off, off + len));
    }

    public void write(char[] cbuf) throws IOException {
        this.fileWriter.write(cbuf);
        System.out.println(new String(cbuf));
    }

    public void close() throws IOException {
        this.fileWriter.close();
    }

    public static void main(String[] args) {

    }

}


/*

���� FileWriter
�������� ������ FileConsoleWriter.
����� FileConsoleWriter ������ ��������� ��������� ���� FileWriter fileWriter.
����� FileConsoleWriter ������ ��������� ��� ������������, ������� �������������� fileWriter ��� ������.
����� FileConsoleWriter ������ ��������� ���� ������� write � ���� ����� close:

public void write(char[] cbuf, int off, int len) throws IOException
public void write(int c) throws IOException
public void write(String str) throws IOException
public void write(String str, int off, int len) throws IOException
public void write(char[] cbuf) throws IOException
public void close() throws IOException
��� ������ ������ � ����, ������ ����������� ��� ������ �� �������.

�����: ����� ������������ 8-� ������� ����� (java language level)!


Requirements:
+ 1. ����� FileConsoleWriter ������ ��������� ��������� ���� FileWriter fileWriter, ������� �� ������ ���� ����� �������������������.
+ 2. ����� FileConsoleWriter ������ ����� ���� ������������� ������� �������������� fileWriter ��� ������.
3. ����� FileConsoleWriter ������ ��������� ����� write(char[] cbuf, int off, int len) throws IOException, � ������� ������ ��� ������ ������ ������������ � fileWriter � ������������� � �������.
4. ����� FileConsoleWriter ������ ��������� ����� write(int c) throws IOException, � ������� ������ ��� ������ ������ ������������ � fileWriter � ������������� � �������.
5. ����� FileConsoleWriter ������ ��������� ����� write(String str) throws IOException, � ������� ������ ��� ������ ������ ������������ � fileWriter � ������������� � �������.
6. ����� FileConsoleWriter ������ ��������� ����� write(String str, int off, int len) throws IOException, � ������� ������ ��� ������ ������ ������������ � fileWriter � ������������� � �������.
7. ����� FileConsoleWriter ������ ��������� ����� write(char[] cbuf) throws IOException, � ������� ������ ��� ������ ������ ������������ � fileWriter � ������������� � �������.
8. ����� FileConsoleWriter ������ ��������� ����� close() throws IOException, � ������� ������ ���������� ����� �� ����� ���� fileWriter.
 */