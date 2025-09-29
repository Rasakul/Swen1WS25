package generic.persistence;

import generic.model.Model;

public abstract class CrudRepository<T extends Model> {

    public void save(T model) {

    }
}
