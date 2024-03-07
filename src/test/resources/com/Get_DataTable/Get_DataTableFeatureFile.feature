Feature: Validation for Book Store Data

Scenario: Validate Data In Json Response in Table 
Given Hit the book store api
Then validate as status code 
Then validate data from response 
|	Git Pocket Guide			  |	books[0].title		|
	|	A Working Introduction	|	books[0].subTitle	|
	|	Richard E. Silverman		|	books[0].author		|
	|	No Starch Press  				|	books[7].publisher|

