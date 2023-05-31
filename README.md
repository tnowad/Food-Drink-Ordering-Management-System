# Food & Drink Ordering Management System

The Food & Drink Ordering Management System is a Java-based application that allows users to manage food and drink orders. It provides functionalities for users, salespersons, and managers to view products, manage user information, create invoices, and perform various management tasks.

## Getting Started

To run the application, follow these steps:

1. Clone the repository to your local machine.
2. Open the project in your preferred Java development environment (e.g., Eclipse, IntelliJ IDEA).
3. Configure the data file paths in the `App.java` file located at `Food-Drink-Ordering-Management-System/src/com/food/drink/management`.
    - Update the `ACCOUNT_DATA_PATH`, `PRODUCT_DATA_PATH`, and `BILL_DATA_PATH` variables to specify the desired file paths for storing account data, product data, and bill data respectively.
4. Compile and run the `App.java` file to start the application.

## Data Storage

The application stores data in files. By default, the data files are saved in the following paths:

- Account data: `./data/AccountData`
- Product data: `./data/ProductData`
- Bill data: `./data/BillData`

You can modify these file paths in the `App.java` file if needed.

## Usage

Once the application is running, it will prompt for login credentials. You can either log in with the provided root account (username: root, password: 1234) or continue as an anonymous user.

The available options and functionalities vary depending on the user role:

- User:
    - View product list
    - Manage user information (view history, change password)
    - Add products to the shopping cart
    - Edit the shopping cart
    - Proceed to checkout and make payments

- Salesperson:
    - Create invoices by adding products to the shopping cart
    - Edit the shopping cart before checkout
    - Make payments and accumulate points
    - Look up user information

- Manager:
    - Manage products (add, edit, delete)
    - Manage employees (add, delete)
    - Manage users (add, delete)

## Contributing

Contributions to the Food & Drink Ordering Management System project are welcome. If you find any issues or have ideas for enhancements, feel free to open an issue or submit a pull request.

## Contributors

- Nguyen Minh Tuan ([GitHub](https://github.com/tnowad))
- Bui Hong Bao ([GitHub](https://github.com/BuiBao3103))
- Mai Trung Chinh ([GitHub](https://github.com/MaiTrungChinhh))
- Do The Tung ([GitHub](https://github.com/omodtung)
