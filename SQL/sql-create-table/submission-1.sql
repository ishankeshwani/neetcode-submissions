

create table videos(
    id integer,
    name Text,
    created_at Date,
    published boolean
);





-- Do not modify below this line --
SELECT table_name, column_name, data_type
FROM information_schema.columns
WHERE table_name = 'videos';
