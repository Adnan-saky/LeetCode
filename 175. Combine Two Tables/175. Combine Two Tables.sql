SELECT T1.firstName, T1.lastName, T2.city, T2.state 

	FROM Person T1 LEFT JOIN Address T2 
		on T1.personId = T2.personId;