-- Create a new user, grant her rights, and set her password.
GRANT SELECT
	,
	INSERT,
	UPDATE,
	DELETE ON webproject.* TO webapp@localhost IDENTIFIED BY '1234';