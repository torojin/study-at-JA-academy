--회원
drop table FB_MEMBER;
create table FB_MEMBER(
MEMBER_NO number(8) primary key,
MEMBER_ID varchar2(80) unique,
MEMBER_PW varchar2(100),
MEMBER_NICK varchar2(20),
MEMBER_SEX varchar2(4),
MEMBER_JOINDATE date
);

drop sequence FB_MEMBER_SEQ;
create sequence FB_MEMBER_SEQ;

--취미 카테고리
drop table FB_HOBBY_CATEGORY;
create table FB_HOBBY_CATEGORY(
HOBBY_CATEGORY_NO number(4) primary key,
HOBBY_CATEGORY_NAME varchar2(20)
);

drop sequence FB_HOBBY_CATEGORY_SEQ;
create sequence FB_HOBBY_CATEGORY_SEQ;

insert into FB_HOBBY_CATEGORY values (FB_HOBBY_CATEGORY_SEQ.nextval, '농구');
insert into FB_HOBBY_CATEGORY values (FB_HOBBY_CATEGORY_SEQ.nextval, '축구');
insert into FB_HOBBY_CATEGORY values (FB_HOBBY_CATEGORY_SEQ.nextval, '야구');
insert into FB_HOBBY_CATEGORY values (FB_HOBBY_CATEGORY_SEQ.nextval, '독서');

commit;

--회원 취미
drop table FB_HOBBY;
create table FB_HOBBY(
HOBBY_NO number(4) primary key,
MEMBER_NO number(8),
HOBBY_CATEGORY_NO number(4)
);

drop sequence FB_HOBBY_SEQ;
create sequence FB_HOBBY_SEQ;

--게시판 테이블
drop table FB_BOARD;
create table FB_BOARD(
BOARD_NO number(8) primary key,
MEMBER_NO number(8),
BOARD_TITLE varchar2(200),
BOARD_CONTENT varchar2(1000),
BOARD_READCOUNT number(8),
BOARD_WRITEDATE date
);

drop sequence FB_BOARD_SEQ;
create sequence FB_BOARD_SEQ;

select * from FB_MEMBER;
select * from FB_HOBBY;

select fb_member_seq.nextval from dual;





