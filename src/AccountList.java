import java.util.Date;

public class AccountList extends ArrayList {
    public Account login(String username, String password) {
        for (Object object : array) {
            if (((Account) object).getUsername().equals(username) && ((Account) object).checkLogin(password)) {
                return (Account) object;
            }
        }
        return null;
    }

    public Object find(int id) {
        for (Object object : array) {
            if (((Account) object).getId() == id) {
                return object;
            }
        }
        return null;
    }

    public Object search(String string) {
        for (Object object : array) {
            if (((Account) object).getPerson().getName().indexOf(string) != -1) {
                return object;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        AccountList accountList = new AccountList();

        Account rootAccount = new Account(0, "root", "1234", null);
        Person rootPerson = new Manager("Root", "VN", new Date(), rootAccount, 1000000);
        rootAccount.setPerson(rootPerson);
        rootPerson.setAccount(rootAccount);

        accountList.append(rootAccount);

        System.out.println(accountList);
        System.out.println((accountList.find(0)).toString());
    }

}
