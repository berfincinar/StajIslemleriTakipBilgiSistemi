import java.sql.*;
public class registerDao {
     public int registerStudent(RegisterBean registerr) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO register" +
            "  (idregister, ogrNo, sifre, isim, soyisim, eMail, telNo, dogumTarihi, bolum, sinif, sirketAdi) VALUES " +
            " (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/registerdb?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey&characterEncoding=UTF-8", "root", "0658.Hadise");

            // Adım 2: Bağlantı nesnesini kullanarak bir ifade oluşturun
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1,registerr.getIdregister());
            preparedStatement.setString(2, registerr.getOgrNo());
            preparedStatement.setString(3, registerr.getSifre());
            preparedStatement.setString(4, registerr.getIsim());
            preparedStatement.setString(5, registerr.getSoyisim());
            preparedStatement.setString(6, registerr.geteMail());
            preparedStatement.setString(7, registerr.getTelNo());
            preparedStatement.setString(8, registerr.getDogumTarihi());
            preparedStatement.setString(9, registerr.getBolum());
            preparedStatement.setString(10, registerr.getSinif());
            preparedStatement.setString(11, registerr.getSirketAdi());
            System.out.println(preparedStatement);
            //3. Adım: Sorguyu veya güncelleme sorgusunu yürütün
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // işlem sql istisnası
            e.printStackTrace();
        }
        return result;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
