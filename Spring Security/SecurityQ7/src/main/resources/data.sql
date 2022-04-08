INSERT INTO users (username,password,enabled)
    values('user',
    'pass',
    true);

INSERT INTO users (username,password,enabled)
    values('admin',
    'passad',
    true);

INSERT INTO users (username,password,enabled)
    values('barath',
    'barath',
    true);

INSERT INTO users (username,password,enabled)
    values('newuser',
    'newuser',
    true);

INSERT INTO authorities (username,authority)
    values('user','ROLE_USER');

INSERT INTO authorities (username,authority)
    values('admin','ROLE_ADMIN');

INSERT INTO authorities (username,authority)
    values('barath','ROLE_BARATH');

INSERT INTO authorities (username,authority)
    values('newuser','ROLE_NEWUSER');