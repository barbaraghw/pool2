package pool2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ejemplo {
    public static void main(String[] args) {
        try {
            Connection connection = ConnectionPoolManager.getConnection();
            String query = "SELECT * FROM prod";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            // Procesar los resultados

            statement.close();
            ConnectionPoolManager.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}