## Step1 (Class Test)

| Test Case                 | Purpose                                             | Expected result         |
|---------------------------|-----------------------------------------------------|-------------------------|
| TC1     | Checking if the objects are being created correctly | Stored correctly        |
| TC2       | To vertify that quantity increases or decreases with a valid addStock amount or sellStock and that appropriate error handling occurs for invalid amounts.                           | Valid input increases or decreases the quantity, while the invalid input displays an error message and leave the quantity unchanged.            |
| TC3   | To ensure price updates correctly and the VAT price recalculaye accurately.                  | The new price is  stored, and the VAT value updates accordingly.        |


## Step2 (Class Test)

| Test Case | Purpose                               | Expected result                                                     |
|-----------|---------------------------------------|---------------------------------------------------------------------|
| TC1       | Create NavSys object                  | Object created correctly and printed with overridden toString()     |
| TC2       | Testing both valid and invalid for addStock amount, sellStock, and price to ensure correct behaviour         | Quantity increases correctly when a valid addStock amount is entered, and an error message (‘Error: the stock exceeds 100.’) is displayed with the quantity unchanged when an invalid amount is entered. Quantity decreases correctly when a valid sellStock amount is entered and an error message (‘Error: Amount is less than 1.’) is displayed with the quantity unchanged when an invalid amount is entered. Price updates correctly                                  |                      |                                           |
| TC3     | Test overriden getStockName(), getStockDescription(), toString()        | Return ""Navigation system"",  Return ""Geo Vision Sat Nav"" , Output displays in the same format as the StockItem class                                      |


## Step3 (Class Test)

## Step1 (GUI Test)

| Test Case | Purpose                                                                                                  | Expected result                                                                                                                                  |
|-----------|----------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------|
| TC1       | Verify that the StockItem object details are correctly displayed in the output area when the user enters valid inputs.                                      | Output shows the accurate StockItem details                                                                                                      |
| TC2       | Checking valid and invalid input - ( addStock, sellStock, price)                                         | Quantity increases and decreases correctly, and the price updates accordingly. If the input is incorrect, the error message is displayed properly. |
| TC3       | Insert amount before creating item - addStock, sellStock, price to ensure the function (null-item) works | It displays ""Create an item first.""                                                                                                            |
                                                                                                                         |



## Step2 (GUI Test)

| Test Case | Purpose                                                                                                       | Expected result                                                                                                                    |
|-----------|---------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------|
| TC1       | To verify that the system correctly updates the addStock, sellStock, and price when valid values are entered. | Quantity updates correctly and output displays the updated values.                                                                 |
| TC2       | To ensure the system handles invalid input appropriately without altering existing values.                    | System shows ""Invalid input"". No changes are made to the quantity or price.                                                      |
| TC3       | To confirm that the button actions function correctly by updating or restoring the displayed values.          | Clicking the Update button displays the updated values, while clicking the Reset button restores and displays the original values. |


## Step3 (GUI Test)
