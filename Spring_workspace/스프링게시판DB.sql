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

insert into FB_MEMBER values(FB_MEMBER_SEQ.nextval, 'id', 'pw', 'nick', 'W', sysdate);

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

desc FB_MEMBER;
desc fb_board;
select * from FB_MEMBER order by member_no desc;
select * from FB_HOBBY;
select * from FB_HOBBY_CATEGORY;
select * from FB_BOARD;

select fb_member_seq.nextval from dual;

insert into FB_HOBBY values(FB_HOBBY_SEQ.nextval,'22');

SELECT * FROM FB_Member WHERE member_no = 1;
SELECT * FROM FB_Member WHERE member_id = '1111' and member_pw = '1111';

select * from fb_board order by board_no;

select * from fb_board where board_no='3';

UPDATE FB_BOARD SET BOARD_READCOUNT = BOARD_READCOUNT+1 WHERE BOARD_NO = 1;

commit;

---------------------------------------------------------------------------

--검색 쿼리
select * 
from(
    select ROWNUM rnum, t1.* 
    from(
        select * from fb_board
        where board_title like '%gk%'
        order by board_no desc
        )t1
    )t2
where t2.rnum >= (2-1)*10+1 and t2.rnum <= 2*10; 

select count(*) 
from(
    select ROWNUM rnum, t1.* 
    from(
        select * from fb_board
        where board_title like '%gk%'
        order by board_no desc
        )t1
    )t2;


select count(*) from fb_board
where board_title like '%gkgk%';


--페이징 처리
insert into fb_board values(fb_board_seq.nextval, 1, '하하하하하', '하하하하하하하하아아아',0,sysdate);
insert into fb_board values(fb_board_seq.nextval, 1, '하하하하하', '하하하하하하하하아아아',0,sysdate);
insert into fb_board values(fb_board_seq.nextval, 1, '하하하하하', '하하하하하하하하아아아',0,sysdate);
insert into fb_board values(fb_board_seq.nextval, 1, '하하하하하', '하하하하하하하하아아아',0,sysdate);
insert into fb_board values(fb_board_seq.nextval, 1, '하하하하하', '하하하하하하하하아아아',0,sysdate);
insert into fb_board values(fb_board_seq.nextval, 1, '하하하하하', '하하하하하하하하아아아',0,sysdate);
insert into fb_board values(fb_board_seq.nextval, 1, '하하하하하', '하하하하하하하하아아아',0,sysdate);
insert into fb_board values(fb_board_seq.nextval, 1, '하하하하하', '하하하하하하하하아아아',0,sysdate);
insert into fb_board values(fb_board_seq.nextval, 1, '하하하하하', '하하하하하하하하아아아',0,sysdate);

delete fb_board


commit;


drop table FB_Upload_File;
create table FB_Upload_File(
    file_no number(8) PRIMARY KEY,
    board_no number(8),
    file_link_path varchar2(100),
    file_real_path varchar2(200),
    file_upload_date date
);

drop sequence FB_Upload_File_seq;
create sequence FB_Upload_File_seq;

select * from FB_Upload_File;


