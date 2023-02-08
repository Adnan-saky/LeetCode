/*Write an SQL query to find all dates' Id with higher temperatures compared to its previous dates (yesterday).

Return the result table in any order.

The query result format is in the following example.
*/

// Solution : MYSQL
SELECT t2.id
FROM Weather t1 
join weather t2 
on DATEDIFF(t1.recordDate,t2.recordDate) = -1
Where t1.temperature  < t2.temperature 