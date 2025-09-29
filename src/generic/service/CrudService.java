package generic.service;

import generic.model.Model;
import generic.persistence.CrudRepository;

public abstract class CrudService<T extends Model> {

    private final CrudRepository<T> repository;

    protected CrudService(CrudRepository<T> repository) {
        this.repository = repository;
    }

    void save(T model) {
        if (validate(model)) {
            repository.save(model);
        }
    }

    public abstract boolean validate(T model);
}
