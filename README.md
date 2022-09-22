# MyBatis DB연결 세팅

- 각각의 필드에서 Insert / Delete 


### 테이블 생성
```sql
create table stadium(
    id number primary key,
    stadiumname varchar2(20) UNIQUE,
    teamId number UNIQUE,
    createdAt TIMESTAMP
);

CREATE SEQUENCE stadium_seq 
INCREMENT BY 1 
START WITH 1;

SELECT * FROM stadium;

--------------------------------------------------------
create table baseteam(
    id number primary key,
    teamname varchar2(20) UNIQUE,
    createdAt TIMESTAMP
);

CREATE SEQUENCE baseteam_seq 
INCREMENT BY 1 
START WITH 1;

SELECT * FROM baseteam;
-------------------------------------------------------
create table player(
    id number primary key,
    playername varchar2(20) UNIQUE,
    position varchar2(20),
    teamId number,
    createdAt TIMESTAMP
);

CREATE SEQUENCE player_seq 
INCREMENT BY 1 
START WITH 1;

SELECT * FROM player;
---------------------------------------------------
create table deadlikst(
    id number primary key,
    playername varchar2(20) UNIQUE,
    position varchar2(20),
    teamId number,
    createdAt TIMESTAMP
);

CREATE SEQUENCE deadlikst_seq 
INCREMENT BY 1 
START WITH 1;

SELECT * FROM deadlikst;
-----------------------------------------------------

commit;

```

### 더미데이터 추가
```sql


INSERT INTO stadium(id, stadiumname, teamId, createdAt) Values(stadium_seq.nextval, '사직야구장', 1, sysdate);
INSERT INTO stadium(id, stadiumname, teamId, createdAt) Values(stadium_seq.nextval, '잠실야구장', 2, sysdate);
INSERT INTO stadium(id, stadiumname, teamId, createdAt) Values(stadium_seq.nextval, '국제야구장', 3, sysdate);


INSERT INTO baseteam(id, teamname, createdAt) Values(baseteam_seq.nextval, '롯데', sysdate);
INSERT INTO baseteam(id, teamname, createdAt) Values(baseteam_seq.nextval, '삼성', sysdate);
INSERT INTO baseteam(id, teamname, createdAt) Values(baseteam_seq.nextval, 'SK', sysdate);


INSERT INTO player(id, playername, position, teamId, createdAt) Values(player_seq.nextval, '강민호', '포수', 1, sysdate);
INSERT INTO player(id, playername, position, teamId, createdAt) Values(player_seq.nextval, '이대호', '타자', 1, sysdate);
INSERT INTO player(id, playername, position, teamId, createdAt) Values(player_seq.nextval, '오윤석', '타자', 1, sysdate);

INSERT INTO player(id, playername, position, teamId, createdAt) Values(player_seq.nextval, '캐넌', '투수', 2, sysdate);
INSERT INTO player(id, playername, position, teamId, createdAt) Values(player_seq.nextval, '구자욱', '좌익수', 2, sysdate);
INSERT INTO player(id, playername, position, teamId, createdAt) Values(player_seq.nextval, '호세', '2루수', 2, sysdate);

INSERT INTO player(id, playername, position, teamId, createdAt) Values(player_seq.nextval, '추신수', '우익수', 3, sysdate);
INSERT INTO player(id, playername, position, teamId, createdAt) Values(player_seq.nextval, '김광현', '투수', 3, sysdate);
INSERT INTO player(id, playername, position, teamId, createdAt) Values(player_seq.nextval, '후안라가레스', '중견수', 3, sysdate);
commit;
```
