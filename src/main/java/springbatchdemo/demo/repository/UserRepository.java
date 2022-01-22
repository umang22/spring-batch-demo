package springbatchdemo.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springbatchdemo.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
