INSERT INTO T_STORE(id, account_id, product_count, published_product_count, is_deleted, deleted, currency)
    VALUES
        (1, 1, 0, 0, false, null, 'XAF'),
        (2, 2, 3, 1, false, null, 'XAF')
    ;

INSERT INTO T_CATEGORY(id, parent_fk, title, title_french)
    VALUES
        (1100, null, 'Electronics', 'Électronique'),
        (1110, 1100, 'Computers', 'Ordinateurs')
    ;

INSERT INTO T_PRODUCT(id, store_fk, category_fk, status, is_deleted, title, summary, description, price, comparable_price, currency, quantity, published, deleted)
    VALUES
        (100, 1, null, 2, false, 'TV', 'summary of TV', 'description of TV', 150000, 200000, 'XAF', 10, now(), null),
        (199, 1, null, 1, true, 'TV', 'Sample TV', 'Long description', 50000, null, 'XAF', null, null, now())
    ;

INSERT INTO T_PICTURE(id, product_fk, url, hash, is_deleted, deleted)
    VALUES
        (101, 100, 'https://www.img.com/101.png', 'hash-101', false, null),
        (102, 100, 'https://www.img.com/102.png', 'hash-102', false, null),
        (199, 100, 'https://www.img.com/199.png', 'hash-199', true, now())
    ;

UPDATE T_PRODUCT set thumbnail_fk=101 WHERE id=100;
