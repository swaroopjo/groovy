# Groovy CRUD operations with Apache Derby

The application presents a Skeleton view of how the DAO layer can be implemented using Groovy scripting. The DAO interfaces are developed using Java ans the Concrete classes are created using Groovy. 
CustomerDAOImpl is the main class that will get the customer from the database using groovy.sql.Sql and uses closure to convert the resultset rows into CustomerObjects. 

Initially, The concrete class checks if the database table exists in the schema, otherwise, it uses DataLoader class to load the customer information from the text file into Apache Derby DB. 
Apache Derby is an embedded database which does not need to be installed as an standalone DB application. ApacheDerby stores all the database files under SHOPPING_CART directory. If there is any problem executing the database query, remove the SHOPPING_CART directory and start again. 

This application is not fully developed. Currently it supports only getCustomerByID and GetCustomersList. 
The rest of the methods are yet to be implemented. 
