create database QLBANHANG
go
use QLBANHANG
create table customer(
	customer_id int primary key,
	customer_name NVARCHAR(100),
)
create table employee(
	employee_id int primary key,
	employee_name nvarchar(100),
	salary float,
	supervisor_id int,
)
create table products(
	product_id int primary key,
	product_name nvarchar(100),
	list_price float,
)
create table orders(
	order_id int primary key,
	order_date date,
	customer_id int,
	employee_id int,
	total float,
	constraint cid foreign key (customer_id) references customer(customer_id),
	constraint eplid foreign key(employee_id) references employee(employee_id),
)
create table lineItem(
	order_id int,
	product_id int,
	quantity int,
	price float,
	constraint ordid foreign key(order_id) references orders(order_id),
	constraint prid foreign key(product_id) references products(product_id),
	primary key(order_id, product_id),
)
-- 1. Chèn dữ liệu bảng Customer
INSERT INTO Customer (customer_id, customer_name) VALUES
(1, N'Nguyễn Văn An'),
(2, N'Trần Thị Bình'),
(3, N'Lê Hoàng Cường'),
(4, N'Phạm Mai Dung'),
(5, N'Hoàng Văn Em'),
(6, N'Vũ Thị Giang'),
(7, N'Đặng Kim Hoa'),
(8, N'Bùi Minh Khang'),
(9, N'Đỗ Thùy Linh'),
(10, N'Ngô Bảo Nam');

-- 2. Chèn dữ liệu bảng Employee
INSERT INTO Employee (employee_id, employee_name, salary, supervisor_id) VALUES
(1, N'Trần Đại Nghĩa', 5000, NULL),
(2, N'Lý Thường Kiệt', 3000, 1),
(3, N'Phạm Hồng Thái', 2500, 1),
(4, N'Nguyễn Trãi', 2000, 2),
(5, N'Trần Hưng Đạo', 3500, 1),
(6, N'Lê Lợi', 2200, 5),
(7, N'Quang Trung', 2800, 5),
(8, N'Nguyễn Huệ', 2400, 7),
(9, N'Phan Bội Châu', 1800, 2),
(10, N'Hồ Chí Minh', 4000, 1);

-- 3. Chèn dữ liệu bảng Product
INSERT INTO Products (product_id, product_name, list_price) VALUES
(1, N'Laptop Dell XPS', 1500.00),
(2, N'Chuột Logitech', 25.50),
(3, N'Bàn phím cơ', 80.00),
(4, N'Màn hình Samsung', 300.00),
(5, N'Tai nghe Sony', 120.00),
(6, N'iPhone 15', 1200.00),
(7, N'Sạc dự phòng', 45.00),
(8, N'Ổ cứng SSD', 110.00),
(9, N'Ghế công thái học', 250.00),
(10, N'Bàn làm việc', 180.00);

-- 4. Chèn dữ liệu bảng Orders
INSERT INTO Orders (order_id, order_date, customer_id, employee_id, total) VALUES
(101, '2023-10-01', 1, 2, 1525.50),
(102, '2023-10-02', 2, 3, 380.00),
(103, '2023-10-03', 3, 2, 1200.00),
(104, '2023-10-04', 4, 4, 250.00),
(105, '2023-10-05', 5, 5, 225.00),
(106, '2023-10-06', 6, 6, 80.00),
(107, '2023-10-07', 7, 7, 155.00),
(108, '2023-10-08', 8, 8, 180.00),
(109, '2023-10-09', 9, 9, 120.00),
(110, '2023-10-10', 10, 10, 300.00);

-- 5. Chèn dữ liệu bảng LineItem
INSERT INTO LineItem (order_id, product_id, quantity, price) VALUES
(101, 1, 1, 1500.00),
(101, 2, 1, 25.50),
(102, 4, 1, 300.00),
(102, 3, 1, 80.00),
(103, 6, 1, 1200.00),
(104, 9, 1, 250.00),
(105, 8, 2, 110.00),
(105, 7, 1, 45.00),
(106, 3, 1, 80.00),
(107, 8, 1, 110.00),
(107, 7, 1, 45.00);