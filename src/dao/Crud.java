package dao;

import java.util.List;
import java.util.Optional;

public interface Crud<T, ID> {

    String save(T entity);

    List<T> findAll();

    Optional<T> findById(ID id);

    T update(ID id, T t);

    String delete(ID id);

}