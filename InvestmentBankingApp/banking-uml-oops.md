# Investment Banking OOPS – UML Diagram (ASCII)

## Overview
This document contains an **ASCII UML Class Diagram** demonstrating all core **OOPS concepts in Java** using a **real-world Investment Banking example**.

Covered concepts:
- Class & Object
- Abstract Class
- Interface
- Inheritance
- Polymorphism
- Encapsulation
- Abstraction
- Access Modifiers (`public`, `private`, `protected`, default)

---

## Domain
**Investment / Banking System**

- Bank accounts provide common behavior
- Investment products must follow mandatory rules
- Different investment types behave differently

---

## UML Class Diagram (ASCII)

```text
               <<interface>>
               Investable
          ---------------------
          + invest(amount)
          + withdraw(amount)
                 ▲
                 |
     ---------------------------------
     |                               |
+---------------------+   +-----------------------+
| FixedDepositAccount |   | MutualFundAccount     |
+---------------------+   +-----------------------+
| - interestRate      |   | - expectedReturnRate  |
+---------------------+   +-----------------------+
| + invest()          |   | + invest()            |
| + withdraw()        |   | + withdraw()          |
| + calculateReturns()|   | + calculateReturns()  |
+---------------------+   +-----------------------+
          ▲                         ▲
          |                         |
          -----------extends---------
                       |
              +----------------------+
              |  BankAccount (abstract)
              +----------------------+
              | - accountNumber      |
              | - balance            |
              | # accountHolderName  |
              +----------------------+
              | + deposit()          |
              | # getBalance()       |
              | + calculateReturns() |
              +----------------------+

```
---

### @Note1:

#### UML Symbols Cheat Sheet: Symbol	Meaning
- \+  -->  public
- \-  -->  private
- \#  -->  protected
- \`<  -->  --`
- \`<  -->  ..`
- \<<interface>>  -->  interface
- abstract  -->  abstract class

|**UML Symbols Cheat Sheet:**| **Symbol	Meaning** |
| :---:                   |    :----:       | 
| \+                      |  public         |
| \-                      |  private        |
| \#                      |  protected      |
| \`<                     |  --`            |
| \`<                     |  ..`            |
| \<<interface>>          |  interface      |
| abstract                |  abstract class |


### @Note2:

- We use an interface reference to achieve loose coupling and runtime polymorphism.
- The object is a FixedDepositAccount, but it’s referenced as Investable.
- Since calculateReturns() is not part of the interface, we cast it to BankAccount.
- At runtime, Java still calls the overridden method of FixedDepositAccount.

---
