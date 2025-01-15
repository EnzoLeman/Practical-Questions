# Invoice Class

## Problem Description

Create a class called `Invoice` that includes the following:

- **partNumber** (type `String`)
- **partDescription** (type `String`)
- **quantity** (type `int`)
- **pricePerItem** (type `double`)

Provide the following:

1. A constructor that initializes the part number, part description, quantity, and price per item.
2. Set and get methods for each instance variable.
3. A method that calculates the total invoice amount (quantity * price per item).
4. If the quantity is less than 0, set it to 0; if the price per item is less than 0, set it to 0.

Then, write a test application named `InvoiceTest` that demonstrates the capabilities of the `Invoice` class. The test app should:

1. Create an `Invoice` object.
2. Display the invoice details (part number, part description, quantity, price per item).
3. Calculate and display the total invoice amount.
