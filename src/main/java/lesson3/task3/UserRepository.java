// Задание 3.  (необязательное)
//
//Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей, кроме администраторов.
// Для этого, вам потребуется расширить класс User новым свойством, указывающим, обладает ли пользователь админскими правами.
// Протестируйте данную функцию.

package lesson3.task3;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        if (!findByName(user.name)) {
            data.add(user);
            user.isAuthenticate = true;
        }
        else {
            user.isAuthenticate = true;
        }
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void notAuthenticate() {
        for (User user : data) {
            if (!user.isAdmin) {
                user.isAuthenticate = false;
            }
        }
    }

    public int adminNumber() {
        int number = 0;
        for (User user : data) {
            if (user.isAdmin) {
                number +=1;
           }
        }
        return number;
    }

    public void printIsAuthenticate() {
        for (User user : data) {
            if (user.isAuthenticate) {
                System.out.println("name: " + user.name + " admin: " + user.isAdmin);
            }
        }
    }
}