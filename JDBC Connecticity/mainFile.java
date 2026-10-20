// import java.util.Scanner;
import java.sql.*;

public class mainFile {
    private static final String url="jdbc:mysql://localhost:3306/temp";
    private static final String username="root";
    private static final String password="Admin@12";
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            Connection connection=DriverManager.getConnection(url, username, password);
            String query="insert into stud values(?,?,?);";
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1, 10);
            preparedStatement.setString(2, "Payal");
            preparedStatement.setInt(3, 15);
            int rowAffected=preparedStatement.executeUpdate();
            if(rowAffected>0) System.out.println("Successfull");
            else System.out.println("Failed");

            preparedStatement.close();
            connection.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
