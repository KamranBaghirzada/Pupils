import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PupilDao {
    public Pupil getPupil(int id) {
        String query = "select name,surname,entryGrade,address,University_id from pupilsfinished where id = " + id;
        Pupil p = new Pupil();
        p.setId(id);
        try {
            Statement st = Objects.requireNonNull(connect()).createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            p.setNamep(rs.getString("name"));
            p.setSurnamep(rs.getString("surname"));
            p.setEntryGradep(rs.getInt("entryGrade"));
            p.setAddressp(rs.getString("address"));
            p.setUniversity_idp(rs.getString("University_id"));
            return p;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static Connection connect() {
        String url = "jdbc:mysql://localhost:3306/filemansys?characterEncoding=latin1";
        String username = "root";
        String password = "Kamran145145145!";
        try {
            Class.forName("com.mysql.jdbc.Driver");//load and register
            return DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public void addPupil(Pupil p) {
        String update = "insert into pupilsfinished values (?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = Objects.requireNonNull(connect()).prepareStatement(update);
            preparedStatement.setInt(1, p.getId());
            preparedStatement.setString(2, p.getNamep());
            preparedStatement.setString(3, p.getSurnamep());
            preparedStatement.setInt(4, p.getEntryGradep());
            preparedStatement.setString(5, p.getAddressp());
            preparedStatement.setString(6, p.getUniversity_idp());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int pupilCount() throws Exception {
        int b = 0;
        Connection con = connect();
        assert con != null;
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from pupilsfinished");
        while (rs.next()) {
            b++;
        }
        rs.close();
        st.close();
        con.close();
        return b;
    }

    public ArrayList<Pupil> getPupilsPutIntoList(int pupilCount) {
        ArrayList<Pupil> list = new ArrayList<Pupil>(27);
        for (int i = 1; i <= pupilCount; i++) {
            list.add(getPupil(i));
        }
        return list;
    }
}
