CREATE SCHEMA schema_three;
CREATE SCHEMA schema_four;
SET search_path to schema_three;
CREATE TABLE three (
    id INT,
    name VARCHAR(100)
);
