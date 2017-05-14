UPDATE todo SET priority=0 WHERE id > 0;
ALTER TABLE todo
  ALTER COLUMN priority INT NOT NULL;