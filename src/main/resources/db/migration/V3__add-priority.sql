ALTER TABLE todo ADD priority VARCHAR(50);
UPDATE todo SET priority='not defined' WHERE id > 0;