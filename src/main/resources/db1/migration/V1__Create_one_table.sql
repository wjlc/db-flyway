CREATE SCHEMA schema_one;
CREATE SCHEMA schema_two;

SET search_path to schema_one;

CREATE TABLE one (
    id INT,
    name VARCHAR(100)
);
