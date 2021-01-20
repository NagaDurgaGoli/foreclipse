import java.io.IOException;
import java.sql.SQLException;

public class ExceptionDemo {
	public static void main(String[] args) {
		ExceptionDemo ex=new ExceptionDemo();
		try {
			ex.processFile();
			ex.processDatabase();
			System.out.println("a");
		}catch( IOException e) {
		System.out.println("b");
	}catch(Exception e) {
		System.out.println("c");
	}
}
void processDatabase() throws SQLException{
	throw new SQLException();
}
void processFile() throws IOException{
	throw new IOException();
}}
