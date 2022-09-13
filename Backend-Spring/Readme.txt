Create sql database
 1. user -> userrecord (table)
 2. todolist -> todo (table)
 3. productdb -> calories (table) and proteinlist (table)

Host
http://localhost:8081
http://localhost:8082
http://localhost:8083
http://localhost:8084
http://localhost:8090
http://localhost:8091

Authorization - Swagger
http://localhost:8081/check
http://localhost:8081/getToken
http://localhost:8081/getuname
http://localhost:8081/registeruser

Caloriesproduct - Swagger
http://localhost:8091/getproductlist/addproduct
http://localhost:8091/getproductlist/getproductbyid/{foodId}
http://localhost:8091/getproductlist/editproduct
http://localhost:8091/getproductlist/product/{foodId}

CaloriesValues - Swagger
http://localhost:8083/CaloriesValues/{foodName}
http://localhost:8083/CaloriesValues/allfood

Proteinproduct - Swagger
http://localhost:8090/getproductlist/addproduct
http://localhost:8090/getproductlist/getproductbyid/{stockId}
http://localhost:8090/getproductlist/editproduct
http://localhost:8090/getproductlist/product/{stockId}

ProteinValues - Swagger
http://localhost:8082/Protein/{productName}
http://localhost:8082/Protein/allprotein

todo - Swagger
http://localhost:8084/invoices/all
http://localhost:8084/invoices/add
http://localhost:8084/invoices/delete/{id}
http://localhost:8084/invoices/update