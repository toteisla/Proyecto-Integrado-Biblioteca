
package biblioteca;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;

public class SQL {
    
    public boolean executeQuery(String strQuery){
        String sqlStringConnection = "jdbc:mysql://127.0.0.1/Biblioteca";
        Connection sqlConnection;
        Statement sqlCommand;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConnection = DriverManager.getConnection(sqlStringConnection, "tote", "855858");
            sqlCommand = sqlConnection.createStatement();
            sqlCommand.executeUpdate(strQuery);
        } catch (Exception ex) {
            System.out.print("Error de conexión con la base de datos: ");
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }

    public boolean executeBinaryQuery(String strQuery, String strBin){
        String sqlStringConnection = "jdbc:mysql://127.0.0.1/Biblioteca";
        Connection sqlConnection;
        PreparedStatement sqlQuery;
        Statement sqlCommand;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConnection = DriverManager.getConnection(sqlStringConnection, "tote", "855858");
            sqlCommand = sqlConnection.createStatement();
            sqlQuery = sqlConnection.prepareStatement(strQuery);
            File fileBin = new File(strBin);
            FileInputStream bin = new FileInputStream(fileBin);
            sqlQuery.setBinaryStream(1, (InputStream)bin, (int)fileBin.length());
            int result = sqlQuery.executeUpdate();
            if(result > 0)
                return true;
            else
                return false;
        } catch (Exception ex) {
            System.out.print("Error de conexión con la base de datos: ");
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public ResultSet getResultSet(String strQuery){
        String sqlStringConnection = "jdbc:mysql://127.0.0.1/Biblioteca";
        Connection sqlConnection;
        Statement sqlCommand;
        ResultSet sqlQuery = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConnection = DriverManager.getConnection(sqlStringConnection, "tote", "855858");
            sqlCommand = sqlConnection.createStatement();
            sqlQuery = sqlCommand.executeQuery(strQuery);
        } catch (Exception ex) {
            System.out.print("Error de conexión con la base de datos: ");
            System.out.println(ex.getMessage());
        }
        return sqlQuery;
    }

    public boolean booleanQuery(String strQuery){
        String sqlStringConnection = "jdbc:mysql://127.0.0.1/Biblioteca";
        Connection sqlConnection;
        ResultSet sqlQuery;
        Statement sqlCommand;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConnection = DriverManager.getConnection(sqlStringConnection, "tote", "855858");
            sqlCommand = sqlConnection.createStatement();
            sqlQuery = sqlCommand.executeQuery(strQuery);
            sqlQuery.last();
            if(sqlQuery.getRow() > 0)
                return true;
        } catch (Exception ex) {
            System.out.print("Error de conexión con la base de datos: ");
            System.out.println(ex.getMessage());
            return false;
        }
        return false;
    }

    public Connection conexion(){
        String sqlStringConnection = "jdbc:mysql://127.0.0.1/Biblioteca";
        Connection sqlConnection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConnection = DriverManager.getConnection(sqlStringConnection, "tote", "855858");
        } catch (Exception ex) {
            System.out.print("Error de conexión con la base de datos: ");
            System.out.println(ex.getMessage());
        }
        return sqlConnection;
    }

    /*
    public boolean executeQuery(String strQuery){
        String sqlStringConnection = "jdbc:mysql://senior.inf/fcancelog_Biblioteca";
        Connection sqlConnection;
        Statement sqlCommand;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConnection = DriverManager.getConnection(sqlStringConnection, "fcancelog", "2DAI");
            System.out.println( "SQL:Conectado.." );
            sqlCommand = sqlConnection.createStatement();
            System.out.println( "SQL:Creación de orden.." );
            sqlCommand.executeUpdate(strQuery);
            System.out.println( "SQL:Ejecución de consulta.." );
        } catch (Exception ex) {
            System.out.print("Error de conexión con la base de datos: ");
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }

    public boolean executeBinaryQuery(String strQuery, String strBin){
        String sqlStringConnection = "jdbc:mysql://senior.inf/fcancelog_Biblioteca";
        Connection sqlConnection;
        PreparedStatement sqlQuery;
        Statement sqlCommand;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConnection = DriverManager.getConnection(sqlStringConnection, "fcancelog", "2DAI");
            System.out.println( "SQL:Conectado.." );
            sqlCommand = sqlConnection.createStatement();
            System.out.println( "SQL:Creación de orden.." );
            sqlQuery = sqlConnection.prepareStatement(strQuery);
            File fileBin = new File(strBin);
            FileInputStream bin = new FileInputStream(fileBin);
            sqlQuery.setBinaryStream(1, (InputStream)bin, (int)fileBin.length());
            System.out.println( "SQL:Ejecución de consulta.." );
            int result = sqlQuery.executeUpdate();
            if(result > 0)
                return true;
            else
                return false;
        } catch (Exception ex) {
            System.out.print("Error de conexión con la base de datos: ");
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public ResultSet getResultSet(String strQuery){
        String sqlStringConnection = "jdbc:mysql://senior.inf/fcancelog_Biblioteca";
        Connection sqlConnection;
        Statement sqlCommand;
        ResultSet sqlQuery = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConnection = DriverManager.getConnection(sqlStringConnection, "fcancelog", "2DAI");
            System.out.println( "SQL:Conectado.." );
            sqlCommand = sqlConnection.createStatement();
            System.out.println( "SQL:Creación de orden.." );
            sqlQuery = sqlCommand.executeQuery(strQuery);
            System.out.println( "SQL:Ejecución de consulta.." );
        } catch (Exception ex) {
            System.out.print("Error de conexión con la base de datos: ");
            System.out.println(ex.getMessage());
        }
        return sqlQuery;
    }

    public boolean booleanQuery(String strQuery){
        String sqlStringConnection = "jdbc:mysql://senior.inf/fcancelog_Biblioteca";
        Connection sqlConnection;
        ResultSet sqlQuery;
        Statement sqlCommand;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConnection = DriverManager.getConnection(sqlStringConnection, "fcancelog", "2DAI");
            System.out.println( "SQL:Conectado.." );
            sqlCommand = sqlConnection.createStatement();
            System.out.println( "SQL:Creación de orden.." );
            sqlQuery = sqlCommand.executeQuery(strQuery);
            System.out.println( "SQL:Ejecución de consulta.." );
            sqlQuery.last();
            if(sqlQuery.getRow() > 0)
                return true;
        } catch (Exception ex) {
            System.out.print("Error de conexión con la base de datos: ");
            System.out.println(ex.getMessage());
            return false;
        }
        return false;
    }*/
}
