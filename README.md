# myRetail
Target Technical Assessment case study

1. Create Product - localhost:8080/product/create 
  Request body - {
    "ID": "123456",
    "Name": "Shirt",
    "Description": "Cotton Shirt",
    "CurrentPrice":{
        "Value":20,
        "Currency": "USD"
    }
}

2. Update product - localhost:8080/product/update
  Request body - {
    "ID": "123456",
    "Description": "Cotton Shirt",
    "CurrentPrice":{
        "Value":20,
        "Currency": "USD"
    }
}

3. Get product - localhost:8080/product/get/{id}
4. Delete product - localhost:8080/product/delete/{id}

