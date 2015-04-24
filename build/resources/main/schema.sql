CREATE TABLE BOOK (
	ID BIGINT NOT NULL,
	TITLE VARCHAR(255),
	CREATOR VARCHAR(255),
	TYPE VARCHAR(255),
	DATE DATETIME,
	PRIMARY KEY (ID)
);

CREATE TABLE `operators2` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `partner_id` int(11) unsigned NOT NULL,
  `operator_name` varchar(64) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
);