insert into user_details(id,birth_date,name) 
values (10001, current_date(), 'Ranga');

insert into user_details(id,birth_date,name) 
values (10002, current_date(), 'Ravi');

insert into user_details(id,birth_date,name) 
values (10003, current_date(), 'Satish');

insert into post (id, description, user_id) 
values (20001, 'I want to lear AWS', 10001);

insert into post (id, description, user_id) 
values (20002, 'I want to lear Azure', 10001);

insert into post (id, description, user_id) 
values (20003, 'I want to lear DevOps', 10001);

insert into post (id, description, user_id) 
values (20004, 'I want to lear Office', 10002);

insert into post (id, description, user_id) 
values (20005, 'I want to learn Kubernetes', 10002);