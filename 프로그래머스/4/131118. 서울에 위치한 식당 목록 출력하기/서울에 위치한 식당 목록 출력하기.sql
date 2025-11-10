-- 코드를 입력하세요
SELECT i.REST_ID, i.REST_NAME, i.FOOD_TYPE, i.FAVORITES, i.ADDRESS, round(avg(ifnull(r.review_score, 0)),2) as score
from rest_info as i 
join rest_review as r
on i.rest_id = r.rest_id
where i.address like '서울%'
group by i.rest_id
order by score desc, i.favorites desc