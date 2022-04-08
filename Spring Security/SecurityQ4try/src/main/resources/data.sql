INSERT INTO users (username,password,enabled)
    values('user',
    'pass',
    true);

INSERT INTO users (username,password,enabled)
    values('admin',
    'passad',
    true);

INSERT INTO authorities (username,authority)
    values('USER','ROLE_USER');

INSERT INTO authorities (username,authority)
    values('ADMIN','ROLE_ADMIN');