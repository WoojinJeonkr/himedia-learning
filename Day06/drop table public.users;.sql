drop table public.users;
CREATE TABLE public.users (
	idx serial not NULL,
	"name" varchar(100) not NULL,
	id varchar(100) not NULL,
	"passwd" varchar(50) not NULL,
	gender bpchar(1) not NULL,
	birth varchar(10) not NULL,
	phone varchar(20) not NULL,
	rgstdate timestamp not null default now(),
	modifydate timestamp null,
	active bool default true
);

insert into userinfo(idx)
values(1);

insert into userinfo(name)
values('이카루스');

update userinfo set name='을지문덕'
,id='goodman', birth='한글한글'
where idx = 1;

update userinfo set active = true;

delete from userinfo where idx = 3;

select max(idx)+1 from userinfo;

insert into userinfo (name, id, passwd, gender, birth, phone)
values('이카루스', 'icarus', '12345', '1', '2000-05', '010-1111-2222');

insert into userinfo (name, id, passwd, gender, birth, phone)
values('신사임당', 'shinsaimdang', '06789', '2', '1956-01', '010-2222-3333');
