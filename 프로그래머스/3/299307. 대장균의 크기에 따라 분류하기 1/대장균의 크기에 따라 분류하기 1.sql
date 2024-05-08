-- 코드를 작성해주세요
select ID,
        (CASE
            WHEN SIZE_OF_COLONY <= 100 THEN 'LOW'
            WHEN SIZE_OF_COLONY > 100  and SIZE_OF_COLONY <= 1000 THEN 'MEDIUM'
            else 'HIGH'
        END) as SIZE
from ECOLI_DATA
order by ID;