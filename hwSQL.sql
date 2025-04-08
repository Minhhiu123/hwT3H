drop database QL_SINHVIEN;

CREATE DATABASE IF NOT EXISTS QL_SINHVIEN;
USE QL_SINHVIEN;

CREATE TABLE SinhVien (
    id INT AUTO_INCREMENT PRIMARY KEY,
    ho_ten VARCHAR(100) NOT NULL,
    ngay_sinh DATE,
    gioi_tinh VARCHAR(10),
    dia_chi VARCHAR(255),
    email VARCHAR(100) UNIQUE,
    diem_trung_binh DECIMAL(4,2)
);

CREATE TABLE MonHoc (
    id_mon INT AUTO_INCREMENT PRIMARY KEY,
    ten_mon VARCHAR(100),
    so_tin_chi INT
);

CREATE TABLE DiemThi (
    id_diem INT AUTO_INCREMENT PRIMARY KEY,
    id_sinhvien INT,
    id_mon INT,
    diem DECIMAL(4,2),
    FOREIGN KEY (id_sinhvien) REFERENCES SinhVien(id),
    FOREIGN KEY (id_mon) REFERENCES MonHoc(id_mon)
);

INSERT INTO SinhVien (ho_ten, ngay_sinh, gioi_tinh, dia_chi, email, diem_trung_binh)
VALUES 
('Nguyen Van A', '2002-01-15', 'Nam', 'Hanoi', 'vana@gmail.com', 7.8),
('Nguyen Van B', '2002-01-16', 'Nu', 'Haiphong', 'vanb@yahoo.com', 3.0),
('Nguyen Van C', '2002-01-17', 'Nam', 'Danang', 'vanc@gmail.com', 6.9),
('Nguyen Van D', '2002-01-18', 'Nu', 'Hue', 'vand@gmail.com', 4.6),
('Nguyen Van E', '2002-01-19', 'Nam', 'HCM', 'vane@hotmail.com', 7.2);

INSERT INTO MonHoc (ten_mon, so_tin_chi)
VALUES 
('Toan Cao Cap', 3),
('Lap Trinh C', 4),
('Co So Du Lieu', 3);

INSERT INTO DiemThi (id_sinhvien, id_mon, diem)
VALUES
(1, 1, 7.5),
(1, 2, 6.0),
(2, 1, 9.0),
(2, 3, 8.0),
(3, 2, 4.5),
(4, 3, 5.0),
(5, 1, 6.5),
(5, 2, 3.0);



UPDATE SinhVien SET diem_trung_binh = 8.0 WHERE id = 1;
UPDATE DiemThi SET diem = 6.8 WHERE id_diem = 3;

-- Liet ke sinh vien
SELECT * FROM SinhVien;
-- Liet ke mon hoc
SELECT * FROM MonHoc;

SELECT sv.ho_ten, mh.ten_mon, dt.diem
FROM SinhVien sv
JOIN DiemThi dt ON sv.id = dt.id_sinhvien
JOIN MonHoc mh ON mh.id_mon = dt.id_mon;
-- Diem tb > 8.0
SELECT * FROM SinhVien WHERE diem_trung_binh > 8.0;
-- Diem thi < 5.0
SELECT mh.ten_mon, dt.diem
FROM DiemThi dt
JOIN MonHoc mh ON mh.id_mon = dt.id_mon
WHERE dt.diem < 5.0;
-- Sinh vien co diem thi > 6.0
SELECT COUNT(DISTINCT id_sinhvien) AS so_sinh_vien
FROM DiemThi
WHERE diem > 6.0;



-- SInh vien nam co diem 7 den 8.5 
SELECT * FROM SinhVien
WHERE diem_trung_binh BETWEEN 7.0 AND 8.5 AND gioi_tinh = 'Nam';

-- Sinh vien email "gmail.com" hoac "yahoo.com"
SELECT * FROM SinhVien
WHERE email LIKE '%gmail.com%' OR email LIKE '%yahoo.com%';

-- SInh vien diem TB > 6.5 và it nhat 1 mon < 5.0
SELECT DISTINCT sv.*
FROM SinhVien sv
JOIN DiemThi dt ON sv.id = dt.id_sinhvien
WHERE sv.diem_trung_binh > 6.5 AND dt.diem < 5.0;


-- Dem so sinh vien >6 theo mon hoc
SELECT mh.ten_mon, COUNT(dt.id_sinhvien) AS so_sinh_vien
FROM DiemThi dt
JOIN MonHoc mh ON mh.id_mon = dt.id_mon
WHERE dt.diem > 6.0
GROUP BY mh.id_mon;

-- So sinh vien thi lai < 5.0 theo mon hoc
SELECT mh.ten_mon, COUNT(dt.id_sinhvien) AS so_sinh_vien_thi_lai
FROM DiemThi dt
JOIN MonHoc mh ON mh.id_mon = dt.id_mon
WHERE dt.diem < 5.0
GROUP BY mh.id_mon;




