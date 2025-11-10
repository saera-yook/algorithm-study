-- 코드를 입력하세요
SELECT f.flavor
from first_half as f
join (select shipment_id, flavor, sum(total_order) as total_order from july group by flavor) as new
on f.flavor = new.flavor
group by flavor
order by sum(new.total_order) + sum(f.total_order) desc
limit 3