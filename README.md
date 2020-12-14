# in4moTask
Task for in4mo - Home budget assistant demo<br>

## Project description   
Home budget assistant is an app, which can help user to better manage his fundings.   
Amounts of money, which can represent expenses, savings etc. are soterd in registers.   
User can do several operations on registers, like recharge, transfer etc.   

------
In demo version there are four registers: "Wallet", "Savings", "Insurance policy" and "Food expenses".   
User can do three operations: Recharge register, Transfer fundings between two registers and get all registers balance.

## How to run app
After downloading run terminal, go to main app folder and type: **gradlew bootRun**  
App server will start working on URL: *localhost:8080*

## How to use app
App is a REST API with three endpoints:   
1. *localhost:8080/balance* - to get registers balance (HTTP GET method)
2. *localhost:8080/recharge* - to recharge register (HTTP POST method)
3. *localhost:8080/transfer* - to transfer fundings between two registers (HTTP POST method)

**Ad 1.**   
Using GET method on this endpoint will return registers balance in JSON format.   
Response JSON body:   
[  
  {
    "id" : [register1id]  
    "name" : [regfister1name]   
    "balance" : [register1balance]   
  }   
  {
    "id" : [register2id]  
    "name" : [regfister2name]   
    "balance" : [register2balance]   
  }  
]

**Ad 2.**   
Using POST method on this endpoint will recharge register with amount of money.    

Request JSON body:    
{    
"registerName" : [name of register to recharge]    
"amount" : [amount of recharge. Amount should be grater than 0]    
}    
    
Response body:   
Same as request body.  
    
**Ad 3.**    
Using POST method on this endpoint will transfer money between two register.    

Request JSON body:    
{   
"sourceRegisterName" : [name of register from which money will be transferred]   
"destinationRegisterName" : [name of register where money will be transferred]   
"amount" : [amount of transfer. Amount should be grater than 0 and less or equal source register balance]   
}   
   
App starts with registers:
- “Wallet” register with a balance of 1000
- “Savings” register with a balance of 5000
- “Insurance policy” register with a balance of 0
- “Food expenses” register with a balance of 0
