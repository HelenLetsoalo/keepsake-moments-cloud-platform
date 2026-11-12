
-- Sample customers
INSERT INTO customers (first_name, last_name, phone_number, email)
VALUES
('Thandi', 'Mokoena', '0712345678', 'thandi@example.com'),
('Sipho', 'Nkosi', '0823456789', 'sipho@example.com');

-- Sample products
INSERT INTO products (product_name, description, price, is_available)
VALUES
('Luxury Birthday Box', 'Personalised birthday gift box', 650.00, TRUE),
('Graduation Box', 'Personalised graduation keepsake box', 450.00, TRUE),
('Romantic Rose Box', 'Red roses with personalised keepsakes', 850.00, TRUE);

-- Sample orders
INSERT INTO orders (customer_id, order_status)
SELECT customer_id, 'Pending'
FROM customers
WHERE email = 'thandi@example.com';

INSERT INTO orders (customer_id, order_status)
SELECT customer_id, 'Confirmed'
FROM customers
WHERE email = 'sipho@example.com';

-- Sample order items
INSERT INTO order_items (order_id, product_id, quantity, unit_price)
SELECT o.order_id, p.product_id, 1, p.price
FROM orders o
JOIN customers c ON o.customer_id = c.customer_id
JOIN products p ON p.product_name = 'Luxury Birthday Box'
WHERE c.email = 'thandi@example.com';

INSERT INTO order_items (order_id, product_id, quantity, unit_price)
SELECT o.order_id, p.product_id, 2, p.price
FROM orders o
JOIN customers c ON o.customer_id = c.customer_id
JOIN products p ON p.product_name = 'Graduation Box'
WHERE c.email = 'sipho@example.com';
