
-- 1. Display all available gift boxes
SELECT
    product_id,
    product_name,
    price
FROM products
WHERE is_available = TRUE;


-- 2. Display customers and their orders
SELECT
    c.first_name,
    c.last_name,
    o.order_id,
    o.order_status,
    o.order_date
FROM customers c
JOIN orders o
    ON c.customer_id = o.customer_id;


-- 3. Calculate the total value of each order
SELECT
    o.order_id,
    c.first_name,
    c.last_name,
    SUM(oi.quantity * oi.unit_price) AS order_total
FROM orders o
JOIN customers c
    ON o.customer_id = c.customer_id
JOIN order_items oi
    ON o.order_id = oi.order_id
GROUP BY
    o.order_id,
    c.first_name,
    c.last_name;


-- 4. Calculate total revenue from confirmed orders
SELECT
    SUM(oi.quantity * oi.unit_price) AS confirmed_revenue
FROM orders o
JOIN order_items oi
    ON o.order_id = oi.order_id
WHERE o.order_status = 'Confirmed';
