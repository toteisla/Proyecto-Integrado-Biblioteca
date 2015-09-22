package biblioteca;

import java.sql.*;

public class Login {

    public boolean compruebaTamaño(String cadena){
        if(cadena.length() < 4)
            return false;
        else
            return true;
    }

    public boolean compruebaLogin(String strUser, String strPass, LoginFrame loginFrame){
        String sqlStringConnection = "jdbc:mysql://localhost/Biblioteca?user=root&password=855858";
        Connection sqlConnection;
        ResultSet sqlQuery;
        Statement sqlCommand;
        String strQuery = "SELECT UserID, Username, Password FROM Usuarios where Active=1 AND bolLogged = 0" ;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex){
            System.out.println("No está instalado el drive JDBC-MySQL");
            System.exit(1);
        }
        try {
            sqlConnection = DriverManager.getConnection(sqlStringConnection, "root", "855858");
            sqlCommand = sqlConnection.createStatement();
            sqlQuery = sqlCommand.executeQuery(strQuery);
            sqlQuery.beforeFirst();

            while(sqlQuery.next()){
                String dbUser = sqlQuery.getString("Username");
                String dbPass = sqlQuery.getString("Password");
                String UserID = sqlQuery.getString("UserID");
                if(dbUser.equals(strUser) && dbPass.equals(strPass)){
                    System.out.println("Login correcto.");
                    loginFrame.datosUser[0] = UserID;
                    loginFrame.datosUser[1] = dbUser;
                    return true;
                }
            }
            
        } catch (SQLException ex) {
            System.out.print("Error de conexión con la base de datos: ");
            System.out.println(ex.getMessage());
            System.out.print("Código de estado SQL: ");
            System.out.println(ex.getSQLState());
        }
        return false;
    }
}
