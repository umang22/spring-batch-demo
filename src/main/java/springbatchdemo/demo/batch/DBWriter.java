package springbatchdemo.demo.batch;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import springbatchdemo.demo.model.User;
import springbatchdemo.demo.repository.UserRepository;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<User> {

    private UserRepository userRepository;

    @Autowired
    public DBWriter (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void write(List<? extends User> users) throws Exception {

        System.out.println("Data saved for the users:" + users);
        userRepository.saveAll(users);
    }
}
