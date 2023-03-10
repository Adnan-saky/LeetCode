/*Write an SQL query to delete all the duplicate emails, keeping only one unique email with the smallest id. Note that you are supposed to write a DELETE statement and not a SELECT one.

After running your script, the answer shown is the Person table. The driver will first compile and run your piece of code and then show the Person table. The final order of the Person table does not matter.

The query result format is in the following example.*/

// solution : MYSQL
Delete t1 from person t1
inner join person t2
where t1.id > t2.id and t1.email = t2.email



// solution : MS SQL Server
WITH DELETECTL AS (
    SELECT *, ROW_NUMBER() Over (PARTITION BY EMAIL ORDER BY ID) AS ROW 
    FROM PERSON 
)
delete FROM DELETECTL where row >1

