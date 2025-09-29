package generic.service;

import generic.model.User;
import generic.persistence.CrudRepository;

public class UserService extends CrudService<User> {

    protected UserService(CrudRepository<User> repository) {
        super(repository);
    }

    @Override
    public boolean validate(User model) {
        //User specific code
        return false;
    }
}
