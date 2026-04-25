## Step1 (Class Test)

| Test Case                 | Purpose                                             | Expected result         |
|---------------------------|-----------------------------------------------------|-------------------------|
| TC1     | Checking if the objects are being created correctly | Stored correctly        |
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

| Test Case | Purpose                                                                                                  | Expected result                                                                                                                                  |
|-----------|----------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------|
| TC1       | Vertify that StockItem objects are created when inputs are entered.                                      | Output shows the accurate StockItem details                                                                                                      |
| TC2       | Checking valid and invalid input - ( addStock, sellStock, price)                                         | Quantity increases and decreases correctly, and the price updates accordingly. If the input is incorrect, the error message is displayed properly. |
| TC3       | Insert amount before creating item - addStock, sellStock, price to ensure the function (null-item) works | It displays ""Create an item first.""                                                                                                            |
| TC4       | Ensure output area updated after valid input                                                             | It updated accurately.                                                                                                                           |



## Step2 (GUI Test)

## Step3 (GUI Test)
