package reisetech.StudentManagement;

import static java.lang.String.valueOf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentManagementApplication {

  public static void main(String[] args) {
    SpringApplication.run(StudentManagementApplication.class, args);
  }

  @GetMapping("/hello")
  public String hello() {
    return "Hello, World!";
  }

  @GetMapping("/hey")
  public String hey() {
    return "Hey, Siri";
  }

  public int sum(int a, int b) {
    return a + b;
  }

  @GetMapping("/calculation")
  public String calculation() {
    int keisan = sum(1, 2);
    return valueOf(keisan);
  }
}
