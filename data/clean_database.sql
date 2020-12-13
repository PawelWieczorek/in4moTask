DROP TABLE IF EXISTS REGISTER;

CREATE TABLE REGISTER (
                          id INT AUTO_INCREMENT  PRIMARY KEY,
                          name VARCHAR(250) NOT NULL,
                          balance INTEGER NOT NULL);

INSERT INTO REGISTER(name, balance) VALUES ('Wallet', 1000),
                                            ('Savings', 5000),
                                            ('Insurance policy', 0),
                                            ('Food expenses', 0);
