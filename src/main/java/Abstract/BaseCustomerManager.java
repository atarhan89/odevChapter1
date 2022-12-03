package Abstract;

import Entities.Customer;

public abstract class  BaseCustomerManager implements ICustomerService {
    @Override
    public void Save(Customer customer) throws Exception {
        System.out.println("saved to db"+ customer.NationalId);
    }

    @Override
    public void Save(ICustomerService customer) {

    }

    @Override
    public void Save() {

    }
}
