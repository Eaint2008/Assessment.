## Step1 (Class Test)

| Test Case                 | Purpose                                             | Expected result         |
|---------------------------|-----------------------------------------------------|-------------------------|
| TC1- Create item          | Checking if the objects are being created correctly | Stored correctly        |
| TC2- addStock (Valid & Invalid)         | To vertify that quantity increases with a valid addStock amount and that appropriate error handling occurs for invalid amounts.                           | Valid input increases the quantity, while the invalid input displays an error message and leave the quantity unchanged.            |
| TC3- Sell stock (Valid & Invalid)         | To ensure quantity decreases with a valid sellStock amount and that error handling works correctly for invalid input.                            | When a valid amount is entered, the quantity decreases correctly. For invalid input, the system displays an error message and the quantity remains unchanged.    |
| TC4- Change price & VAT update       | To ensure price updates correctly and the VAT price recalculaye accurately.                  | The new price is  stored, and the VAT value updates accordingly.        |


## Step2 (Class Test)

| Test Case | Purpose                               | Expected result                                                     |
|-----------|---------------------------------------|---------------------------------------------------------------------|
| TC1       | Create NavSys object                  | Object created correctly and printed with overridden toString()     |
| TC2       | Testing both valid and invalid addStock amount to ensure correct behaviour         | Quantity increases correctly when a valid addStock amount is entered, and an error message (‘Error: the stock exceeds 100.’) is displayed with the quantity unchanged when an invalid amount is entered.                                 |
| TC3       | Testing both valid and invalid sellStock amount to ensure correct behaviour        | Quantity decreases correctly when a valid sellStock amount is entered and an error message (‘Error: Amount is less than 1.’) is displayed with the quantity unchanged when an invalid amount is entered.                                  |
| TC4       | Change price using setPriceWithoutVAT | Price updates correctly                                             |
| TC5       | Test overriden getStockName(), getStockDescription(), toString()        | Return ""Navigation system"",  Return ""Geo Vision Sat Nav"" , Output displays in the same format as the StockItem class                                      |


## Step3 (Class Test)

## Step1 (GUI Test)

| Test Case                                                        | Purpose                                                             | Expected result                               |
|------------------------------------------------------------------|---------------------------------------------------------------------|-----------------------------------------------|
| TC1- Create Stock Item                                           | Vertify that StockItem objects are created when inputs are entered. | Output shows the accurate StockItem details   |
| TC1.1- Create Stock Item (Missing input)                         | Ensure program handles empty input                                  | ""Invalid Value"" shown                       |
| TC1.2- Create Stock Item (Invalid input)                         | Ensure program handles invalid number                               | ""Invalid Value"" shown                       |
| TC2- Add Stock(Valid)                                            | Increase stock                                                      | Updated quantity shown                        |
| TC2.1- Add Stock (insert add stock amount before creating item)  | Ensure the function (null-item) works                               | It works and shows ""Create an item first.""  |
| TC2.2- Add Stock (Stock exceeds limit)                           | Check the stock-limit rule                                          | Error shown but quantity unchanged            |
| TC2.3- Add Stock (Insert invalid amount)                         | To reject invalid amount                                            | Error shown but quantity unchanged            |
| TC3- Sell Stock (Valid)                                          | Decrease stock                                                      | Updated quantity shown                        |
| TC3.1-Sell Stock (Insert sell stock amount before creating item) |  Ensure the function (null-item) works                              | It works and shows ""Create an item first.""  |
| TC3.2- Sell stock (sell more than available)                     | Avoid overselling                                                   | Quantity unchanged                            |
| TC3.3- Sell stock (Inerst invalid value)                         | Authenticate the rule of input                                      | Error printed but quantity unchanged          |
| TC4- Change price(Valid)                                         | Confirm whether price updates correctly or not                      | Price updated and VAT cahnged                 |
| TC4.1- Change price (add price before creating item)             | Ensure the method (null-item) works                                 | It works and shows ""Create an item first.""  |
| TC4.2- Change price (Invalid input)                              | Certify the numeric input                                           | Output shows ""Invalid Price!""               |
| TC5- OutputArea (Display check)                                  | Ensure output area updated after valid input                        | It updated accurately.                        |
| TC5.1- Vertify Error Message display                             | Ensure the exact error message appeared for invalid input           | It reveals the correct error message.         |


## Step2 (GUI Test)

## Step3 (GUI Test)
