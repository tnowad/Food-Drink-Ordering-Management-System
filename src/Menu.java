import java.util.Date;
import java.util.Scanner;

public class Menu {
    public static Scanner scanner = new Scanner(System.in);
    public static Account currentAccount = null;
    public static AccountList currentAccountList = null;

    public static void setAccount(Account account) {
        currentAccount = account;
    }

    public static void setAccountList(AccountList accountList) {
        currentAccountList = accountList;
    }

    public static Account login() {
        System.out.println("Bạn có muốn đăng nhập không ?");
        System.out.println("1. Có");
        System.out.println("0. Không");
        int choice;
        choice = Integer.parseInt(scanner.nextLine());
        Account account = null;
        if (choice == 1) {
            while (account == null) {
                System.out.println("Nhập username: ");
                String username = scanner.nextLine();
                System.out.println("Nhập password: ");
                String password = scanner.nextLine();
                account = currentAccountList.login(username, password);
                if (account == null) {
                    System.out.println("Đăng nhập thất bại, đăng nhập lại ?");
                    System.out.println("1. Có");
                    System.out.println("0. Không");
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice == 0)
                        break;
                }
            }
        }
        if (account == null) {
            System.out.println("Bạn đang dùng tài khoản khách");
            account = new Account(-1, "guest", "1234", new Customer("Guest", "VN", new Date(), null, 0));
        }
        return account;
    }

    public static void showMenu() {
        if (currentAccount.getPerson() instanceof Customer) {
            showMenuPermissionCustomer();
        } else if (currentAccount.getPerson() instanceof Salesman) {
            showMenuPermissionSalesman();
        } else if (currentAccount.getPerson() instanceof Manager) {
            showMenuPermissionManager();
        }
    }

    public static void showMenuPermissionCustomer() {
        System.out.println("1. Hiện danh sách sản phẩm.");
        System.out.println("2. Thông tin người dùng.");
        System.out.println("0. Thoát.");
    }

    public static void showMenuPermissionSalesman() {
        System.out.println("1. Tạo hóa đơn.");
        System.out.println("2. Tra cứu thông tin người dùng.");
        System.out.println("3. Kết ca.");
        System.out.println("0. Thoát.");
    }

    public static void showMenuPermissionManager() {
        System.out.println("1. Quản lý Sản phẩm");
        System.out.println("2. Quản lý Nhân viên");
        System.out.println("3. Quản lý Người dùng");
        System.out.println("0. Thoát");
    }
    
    public static int showMenuProduct() {
        /**
         * TODO:
         * [] show header attributes of product
         * [] display by table
         * [] get id product
         * [] check id valid and exist
         * [] return id if valid
         */
        return -1;
    }

}