USE adlister_db;

use mysql;
CREATE USER 'adlister_user'@'localhost' IDENTIFIED BY 'codeup';
GRANT ALL ON adlister_db to 'adlister_user@localhost';