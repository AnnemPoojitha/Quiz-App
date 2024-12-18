Project title: Quiz Application API

Description: This is a Spring Boot RESTful API for a Quiz Application. The application supports managing quiz sessions, retrieving random multiple-choice questions, submitting answers, and fetching statistics for a quiz session.

Features:
1. Start a Quiz Session: Create a session for a user to begin the quiz.
2. Get Random Questions: Retrieve random multiple-choice questions from the database.
3. Submit Answers: Allow users to submit answers and track correctness.
4. Get Session Statistics: Fetch the total number of questions attempted, correct answers, and incorrect answers.

Tools & Technologies used:
1. Java
2. Spring Boot
3. Spring Data JPA
4. H2 Database (In-memory database for development)
5. Maven (Build tool)
6. Google Chrome used as testing tool for APIs - it won't support POST API end point. So, here only GET end point is implemented.
7. Spring Tool Suite 4
   
Prerequisites:
1. Install Spring Tool Suite 4
3. Optional: Install Postman to test the API endpoints.
   
After completing prerequisites:
1. Create one maven project.
2. Complete code for the project.

Instructions on how to run and test the code:
1. Run QuizAppApplication.java/Right click on the project and run as spring boot app.
2. If it is running successfully, then in console it will display Started QuizAppApplication.....
3. Access the H2 Console at:
   
   URL: http://localhost:8080/h2-console

   JDBC URL: jdbc:h2:mem:testdb

   Username: sa

   Password: (leave blank)

4. Then, by executing the below query

   SELECT * FROM QUESTION;

   it will display as shown in the below figure.

![Screenshot 2024-12-18 145113](https://github.com/user-attachments/assets/77e0ac06-7319-445e-a98c-b42d4a634042)

5. To start the quiz: Open another window in browser and paste the below link to start the quiz.

   http://localhost:8080/api/quiz/start

   Then, it will display as shown in the below figure.

![Screenshot 2024-12-18 145626](https://github.com/user-attachments/assets/c44c262f-3371-41fc-aef4-178079dd202f)

6. To get random questions: Paste the below link to get random questions. Count represents number of random questions. if we dont enter count then by default it will fetch 2 random questions.

   http://localhost:8080/api/quiz/random?count=3

   Then we will get output as shown in the below figure.

![Screenshot 2024-12-18 150350](https://github.com/user-attachments/assets/1227797a-b754-4ff3-a2ee-05322f2f8e02)

7. To submit answers and track correctness: Paste below link into the browser.

   http://localhost:8080/api/quiz/submit?questionId=5&answer=100

   If answer is correct then it will give the output as follows otherwise it will display Incorrect Answer.

   Replace questionId and answer with respective ones to submit answers to all the questions.

![Screenshot 2024-12-18 151717](https://github.com/user-attachments/assets/e7ba8cec-7a4b-4fc7-a942-5d37fa6092ca)

8. To check correctness and incorrectness: After submitting answers to all the questions, paste below link to check statistics.

   http://localhost:8080/api/quiz/all

   Then, it will provide us the statistics as shown in the below figure.

![Screenshot 2024-12-18 152345](https://github.com/user-attachments/assets/0c10e626-8c9b-461b-8e9f-2237429170d9)

9. Finally, again we can start a new quiz session from step 1.

   It is all about how to run the code and how to test it by using APIs.

Assumptions:
1. Add user authentication for sessions.
2. Implement persistent database storage (e.g., MySQL).
3. Add a timer for quiz sessions.





















