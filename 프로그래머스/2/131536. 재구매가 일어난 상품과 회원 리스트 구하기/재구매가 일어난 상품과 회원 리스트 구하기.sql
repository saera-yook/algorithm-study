-- 코드를 입력하세요
SELECT USER_ID, PRODUCT_ID
    FROM (SELECT USER_ID, PRODUCT_ID, COUNT(*) AS 재구매횟수 
            FROM ONLINE_SALE 
            GROUP BY PRODUCT_ID, USER_ID) AS d
    WHERE 재구매횟수 >= 2
    ORDER BY USER_ID ASC,
             PRODUCT_ID DESC