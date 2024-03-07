Feature: Validation for bookstore data

Scenario: Test title is present in response Json
Given hit the bookstore api
Then validate Status code Matching
Then validate Git Pocket Guide title present
Then validate Learning JavaScript Design Patterns title present
Then validate "Git Pocket Guide" at jsonpath "books[0].title" title present
Then validate "Learning JavaScript Design Patterns" at jsonpath "books[1].title" title present 
Then validate "Designing Evolvable Web APIs with ASP.NET" at jsonpath "books[2].title" title present
Then validate "234" at jsonpath "books[0].pages" pageNumbers present
Then validate "254" at jsonpath "books[1].pages" pageNumbers present