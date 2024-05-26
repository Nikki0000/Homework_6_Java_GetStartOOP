
// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена 
// с разными телефонами, их необходимо считать, как одного человека с разными телефонами. 
// Вывод должен быть отсортирован по убыванию числа телефонов.

import PhoneBook.PhoneBook;
import users.User;

public class Main {
    public static void main(String[] args) {
        

        PhoneBook pb = new PhoneBook();

        User user1 = new User("Alena");

        User user2 = new User("Ivan");

        User user3 = new User("Elena");


        pb.addPhone(user1, 123);
        pb.addPhone(user1, 456);

        pb.addPhone(user2, 789);

        pb.addPhone(user3, 111);
        pb.addPhone(user3, 4567);
        pb.addPhone(user3, 1234);


        pb.printPhoneBook();

        
    }
}
