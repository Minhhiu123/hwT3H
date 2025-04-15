drop database QL_COMPANY;

CREATE DATABASE IF NOT EXISTS QL_COMPANY;
USE QL_COMPANY;

CREATE TABLE company_info (
    id INT PRIMARY KEY AUTO_INCREMENT,
    ten VARCHAR(255),
    dia_chi TEXT,
    phone VARCHAR(20)
);

CREATE TABLE social (
    id INT PRIMARY KEY AUTO_INCREMENT,
    ten VARCHAR(255),
    link TEXT,
    company_info_id INT,
    FOREIGN KEY (company_info_id) REFERENCES company_info(id)
);

CREATE TABLE branch (
    id INT PRIMARY KEY AUTO_INCREMENT,
    ten VARCHAR(255),
    dia_chi TEXT,
    mail VARCHAR(255),
    phone VARCHAR(20)
);

CREATE TABLE category (
    id INT PRIMARY KEY AUTO_INCREMENT,
    ten VARCHAR(255),
    category_parent_id INT,
    FOREIGN KEY (category_parent_id) REFERENCES category(id)
);

CREATE TABLE branch_category (
    branch_id INT,
    category_id INT,
    PRIMARY KEY (branch_id, category_id),
    FOREIGN KEY (branch_id) REFERENCES branch(id),
    FOREIGN KEY (category_id) REFERENCES category(id)
);

CREATE TABLE production (
    id INT PRIMARY KEY AUTO_INCREMENT,
    ten VARCHAR(255),
    gia DECIMAL(15,2),
    mo_ta TEXT,
    so_luong INT,
    category_id INT,
    FOREIGN KEY (category_id) REFERENCES category(id)
);

CREATE TABLE image (
    id INT PRIMARY KEY AUTO_INCREMENT,
    path TEXT,
    extention VARCHAR(10)
);

CREATE TABLE production_image (
    production_id INT,
    image_id INT,
    PRIMARY KEY (production_id, image_id),
    FOREIGN KEY (production_id) REFERENCES production(id),
    FOREIGN KEY (image_id) REFERENCES image(id)
);

CREATE TABLE size (
    id INT PRIMARY KEY AUTO_INCREMENT,
    ma VARCHAR(50),
    ten VARCHAR(50),
    type VARCHAR(50)
);


CREATE TABLE production_size (
    production_id INT,
    size_id INT,
    PRIMARY KEY (production_id, size_id),
    FOREIGN KEY (production_id) REFERENCES production(id),
    FOREIGN KEY (size_id) REFERENCES size(id)
);


CREATE TABLE color (
    id INT PRIMARY KEY AUTO_INCREMENT,
    ma VARCHAR(50),
    ten VARCHAR(50)
);


CREATE TABLE production_color (
    production_id INT,
    color_id INT,
    PRIMARY KEY (production_id, color_id),
    FOREIGN KEY (production_id) REFERENCES production(id),
    FOREIGN KEY (color_id) REFERENCES color(id)
);
