ALTER TABLE T_PRODUCT ADD COLUMN event_starts DATETIME;
ALTER TABLE T_PRODUCT ADD COLUMN event_ends DATETIME;
ALTER TABLE T_PRODUCT ADD COLUMN event_meeting_id VARCHAR(30);
ALTER TABLE T_PRODUCT ADD COLUMN event_meeting_password VARCHAR(30);
ALTER TABLE T_PRODUCT ADD COLUMN event_provider INT NOT NULL DEFAULT 0;
