ALTER TABLE T_DISCOUNT ADD COLUMN type INT DEFAULT 0;
ALTER TABLE T_DISCOUNT MODIFY starts DATETIME;
ALTER TABLE T_DISCOUNT MODIFY ends DATETIME;
