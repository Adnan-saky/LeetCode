SELECT T1.NAME  AS Customers
FROM CUSTOMERS T1 LEFT JOIN ORDERS T2 ON T1.ID = T2.CUSTOMERID
WHERE T2.CUSTOMERID IS NULL ;