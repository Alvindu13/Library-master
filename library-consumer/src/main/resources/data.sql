

--------------------------
--USER--
--------------------------
INSERT INTO USERS (ID,  USERNAME, PASSWORD, ROLES, PERMISSIONS, MAIL, ACTIVE) VALUES (1, 'Alvindu13', '1234', 'USER', 'USER', 'alcaraz.jeremie@hotmail.fr', 1);
INSERT INTO USERS (ID,  USERNAME, PASSWORD, ROLES, PERMISSIONS, MAIL, ACTIVE) VALUES (2, 'admin', 'admin123', 'ADMIN', 'ADMIN', 'jeremie.jeremie@hotmail.fr', 1);

--------------------------
--BOOK--
--------------------------
INSERT INTO BOOK (ID , NAME ,AUTHOR,PRICE, GENRE, QUANTITY, BORROWER_ID ) VALUES (1, 'Babylon', 'Jérémie', 10, 'Policier', 8, 1);
INSERT INTO BOOK (ID , NAME ,AUTHOR ,PRICE, GENRE, QUANTITY, BORROWER_ID) VALUES (2, 'Bleu ciel', 'Eric', 14, 'Aventure', 2, 1);
INSERT INTO BOOK (ID , NAME ,AUTHOR ,PRICE, GENRE, QUANTITY, BORROWER_ID) VALUES (3, 'Momy', 'Rams', 19.99, 'Action', 1, 1);
INSERT INTO BOOK (ID , NAME ,AUTHOR ,PRICE, GENRE, QUANTITY, BORROWER_ID) VALUES (4, 'Titanic', 'Leonardo', 10, 'Drame', 3, 1);
INSERT INTO BOOK (ID , NAME ,AUTHOR ,PRICE, GENRE, QUANTITY, BORROWER_ID) VALUES (5, 'Sherlock', 'Eldison', 4, 'Policier', 7, 2);


