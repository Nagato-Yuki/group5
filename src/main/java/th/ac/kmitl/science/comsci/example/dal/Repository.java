package th.ac.kmitl.science.comsci.example.dal;

import java.sql.ResultSet;
import java.util.List;

public interface Repository<T, Id> {

    List<T> getAll();
    List<T> get(String sqlStatement);
    T getById(Id id);
    void add(T obj);
    void update(T obj);
    void delete(T obj);
    T map(ResultSet resultSet);
}
