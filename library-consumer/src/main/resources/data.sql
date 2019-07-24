INSERT INTO roles (id, name) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_ACTUATOR'),
(3, 'ROLE_USER')
;

INSERT INTO users (id, email, password, name) VALUES
(1, 'admin@gmail.com', 'admin', 'Admin'),
(3, 'user@gmail.com', 'user', 'User');


insert into user_role(user_id, role_id) values
(1,1),
(1,2),
(1,3),
(3,2)
;

--------------------------
--BOOK--
--------------------------
INSERT INTO BOOKS (ID , NAME ,AUTHOR,PRICE, GENRE, QUANTITY, BORROWER_ID ) VALUES (1, 'Babylon', 'Jérémie', 10, 'Policier', 8, 1);
INSERT INTO BOOKS (ID , NAME ,AUTHOR ,PRICE, GENRE, QUANTITY, BORROWER_ID) VALUES (2, 'Bleu ciel', 'Eric', 14, 'Aventure', 2, 1);
INSERT INTO BOOKS (ID , NAME ,AUTHOR ,PRICE, GENRE, QUANTITY, BORROWER_ID) VALUES (3, 'Momy', 'Rams', 19.99, 'Action', 1, 1);
INSERT INTO BOOKS (ID , NAME ,AUTHOR ,PRICE, GENRE, QUANTITY, BORROWER_ID) VALUES (4, 'Titanic', 'Leonardo', 10, 'Drame', 3, 1);
INSERT INTO BOOKS (ID , NAME ,AUTHOR ,PRICE, GENRE, QUANTITY, BORROWER_ID) VALUES (5, 'Sherlock', 'Eldison', 4, 'Policier', 7, 3);


