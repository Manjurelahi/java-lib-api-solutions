package demo;

import demo.entity.Address;
import demo.entity.User;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class LombokDemo {
    public static void main(String[] args) {
        User user = new User("1001", "Manjur", 1234567890L, List.of(
                new Address("Mumbai", "India", 400065),
                new Address("Delhi", "India", 400001)
        ));
        log.info(user.toString());

        user.setUserName("Elahi");
        log.info(user.toString());

        user = User.builder().userId("1002").userName("Patel").userContactNumber(9876543210L)
                .addressList(List.of(
                        new Address("Bangalore", "India", 400002),
                        new Address("Chennai", "India", 400003))
                ).build();
        log.info(user.toString());
    }
}
