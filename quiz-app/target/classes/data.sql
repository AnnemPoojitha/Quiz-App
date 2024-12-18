DROP TABLE IF EXISTS QUESTION;

CREATE TABLE QUESTION (
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    QUESTION_TEXT VARCHAR(255) NOT NULL,
    OPTION_A VARCHAR(255) NOT NULL,
    OPTION_B VARCHAR(255) NOT NULL,
    OPTION_C VARCHAR(255) NOT NULL,
    OPTION_D VARCHAR(255) NOT NULL,
    CORRECT_ANSWER VARCHAR(255) NOT NULL
);

INSERT INTO question (question_text, correct_answer, option_a, option_b, option_c, option_d)
VALUES ('What is the capital of France?', 'Paris', 'Paris', 'London', 'Berlin', 'Rome');

INSERT INTO question (question_text, correct_answer, option_a, option_b, option_c, option_d)
VALUES ('What is 2 + 2?', '4', '3', '4', '5', '6');

INSERT INTO question (question_text, correct_answer, option_a, option_b, option_c, option_d)
VALUES ('Who wrote Hamlet?', 'Shakespeare', 'Shakespeare', 'Dickens', 'Hemingway', 'Tolkien');

INSERT INTO question (question_text, correct_answer, option_a, option_b, option_c, option_d)
VALUES ('Which planet is known as the Red Planet?', 'Mars', 'Mars', 'Earth', 'Jupiter', 'Venus');

INSERT INTO question (question_text, correct_answer, option_a, option_b, option_c, option_d)
VALUES ('What is the boiling point of water?', '100', '90', '100', '120', '80');
