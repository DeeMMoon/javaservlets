package dao;


import models.User;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsersDaoJdbcImpl implements UserDao {

    //language=SQL
    private final String SQL_SELECT_ALL = "SELECT * FROM fix_user";

    //language=SQL
    private final String SQL_SELECT_BY_ID = "SELECT * FROM fix_user where id = ?";
    private Connection connection;
    public  UsersDaoJdbcImpl (DataSource dataSource){
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<User> findAllByFirstName(String firsName) {
        return null;
    }
@Override
    public Optional<User> find(Integer id) {
        try {
            PreparedStatement statement = connection.prepareStatement(SQL_SELECT_BY_ID);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
                String firstName = resultSet.getString(2);
                String lastName = resultSet.getString(3);
               // return Optional.of(new User(id, firstName, lastName));
            }
           return Optional.empty();
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    public void save(User model) {

    }

    public void update(User model) {

    }

    public void delete(Integer model) {

    }

    public List<User> findAll() {
        try {
            List<User>users = new ArrayList();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL);
            while (resultSet.next()){
                Integer id = resultSet.getInt(1);
                String firstName = resultSet.getString(2);
                String lastName = resultSet.getString(3);
              //  User user = new User(id, firstName, lastName);
                //users.add(user);
            }
            return users;
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }

    }
}
