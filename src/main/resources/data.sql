-- Dane startowe aplikacji. Tabele tworzy Hibernate z encji, a ten plik Spring Boot uruchamia zaraz potem.
-- LAB 01: dopiszcie tu konta wszystkich osób z zespołu (reguła R1.03).
-- LAB 02: dopiszcie dane do swoich tabel (kolejność: najpierw tabele, na które wskazują klucze obce).
insert into user_account (email, display_name, role, created_at) values
    ('ola@student.merito.pl',   'Ola',   'USER',    current_timestamp),
    ('kuba@student.merito.pl',  'Kuba',  'USER',    current_timestamp),
    ('firma@example.com',       'Firma', 'PARTNER', current_timestamp),
    ('admin@example.com',       'Admin', 'ADMIN',   current_timestamp),
    ('jakub.gluza@student.merito.pl', 'Jakub', 'USER', current_timestamp),
    ('patryk.gzik@student.merito.pl', 'Patryk', 'USER', current_timestamp),
    ('jan.galicki@student.merito.pl', 'Jan', 'USER', current_timestamp);


-- LAB 01: Wasze konta (zmieńcie na swoje dane, rola USER)
-- insert into user_account (email, display_name, role, created_at) values
--     ('imie.nazwisko@student.merito.pl', 'Imię', 'USER', current_timestamp);


-- LAB 02:
-- ===== LAB 02 · book =====
insert into book (title, isbn, publication_year, pages, available) values
                                                                       ('Ostatnie życzenie', '9788375780635', 1993, 332, true),
                                                                       ('Lalka', '9788373271890', 1890, 680, true),
                                                                       ('Rok 1984', '9788376489055', 1949, 328, false);

-- ===== LAB 02 · reader =====
insert into reader
(full_name, email, registered_on, active, street, city, postal_code) values
                                                                         ('Anna Kowalska', 'anna.kowalska@example.com', '2026-10-01', true,
                                                                          'Legnicka 20', 'Wrocław', '53-671'),

                                                                         ('Jan Nowak', 'jan.nowak@example.com', '2026-10-10', true,
                                                                          'Grabiszyńska 50', 'Wrocław', '53-504'),

                                                                         ('Piotr Wiśniewski', 'piotr.wisniewski@example.com', '2026-10-15', false,
                                                                          'Hallera 12', 'Wrocław', '53-318');

-- ===== LAB 02 · loan =====
insert into loan
(loan_date, due_date, return_date, status, notes) values
                                                      ('2026-10-01', '2026-10-15', '2026-10-13',
                                                       'RETURNED', 'Książka zwrócona w terminie'),

                                                      ('2026-10-10', '2026-10-24', null,
                                                       'ACTIVE', 'Aktywne wypożyczenie'),

                                                      ('2026-09-20', '2026-10-04', null,
                                                       'OVERDUE', 'Przekroczony termin zwrotu');