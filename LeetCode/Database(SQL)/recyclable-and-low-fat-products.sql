-- https://leetcode.com/problems/product-sales-analysis-i/
SELECT
    product_id
FROM
    Products
WHERE
    low_fats = 'Y'
    AND recyclable = 'Y';