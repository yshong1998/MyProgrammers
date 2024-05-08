-- 코드를 작성해주세요
select t1.ID, count(t2.ID) as CHILD_COUNT
FROM ECOLI_DATA t1 LEFT OUTER JOIN ECOLI_DATA t2
ON t1.ID = t2.PARENT_ID
group by t1.ID
order by t1.ID;