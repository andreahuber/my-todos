UPDATE todo SET priority=0 WHERE id > 0;
ALTER TABLE todo MODIFY COLUMN priority INTEGER NOT NULL DEFAULT 0;