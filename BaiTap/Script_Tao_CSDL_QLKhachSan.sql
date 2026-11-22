
-- =============================================
-- Cơ sở dữ liệu: QLKHACHSAN
-- =============================================

CREATE DATABASE QLKHACHSAN;
GO

USE QLKHACHSAN;
GO

-- Bảng PHONG
CREATE TABLE PHONG (
    MaPhong VARCHAR(10) PRIMARY KEY,
    LoaiPhong NVARCHAR(50),
    GiaPhong DECIMAL(10,2) CHECK (GiaPhong > 0),
    DaDat BIT
);

-- Bảng KHACHHANG
CREATE TABLE KHACHHANG (
    MaKH VARCHAR(10) PRIMARY KEY,
    TenKH NVARCHAR(100) NOT NULL,
    NgaySinh DATE,
    GioiTinh NVARCHAR(10)
);

-- Bảng PHIEUDAT
CREATE TABLE PHIEUDAT (
    MaPD INT IDENTITY(1,1) PRIMARY KEY,
    MaPhong VARCHAR(10),
    MaKH VARCHAR(10),
    NgayNhan DATE,
    NgayTra DATE,
    FOREIGN KEY (MaPhong) REFERENCES PHONG(MaPhong) 
	ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (MaKH) REFERENCES KHACHHANG(MaKH) 
	ON DELETE CASCADE ON UPDATE CASCADE,
);

-- Dữ liệu mẫu cho bảng PHONG
INSERT INTO PHONG (MaPhong, LoaiPhong, GiaPhong, DaDat) VALUES
('P101', N'Deluxe', 800000, 0),
('P102', N'Superior', 600000, 1),
('P103', N'Standard', 400000, 0);

-- Dữ liệu mẫu cho bảng KHACHHANG
INSERT INTO KHACHHANG (MaKH, TenKH, NgaySinh, GioiTinh) VALUES
('KH01', N'Lê Văn A', '1990-01-01', N'Nam'),
('KH02', N'Trần Thị B', '1992-02-02', N'Nữ'),
('KH03', N'Nguyễn Văn C', '1988-03-03', N'Nam');

-- Dữ liệu mẫu cho bảng PHIEUDAT
INSERT INTO PHIEUDAT (MaPhong, MaKH, NgayNhan, NgayTra) VALUES
('P101', 'KH01', '2024-08-01', '2024-08-04'),
('P102', 'KH02', '2024-08-05', '2024-08-10'),
('P103', 'KH03', '2024-08-03', '2024-08-06');
