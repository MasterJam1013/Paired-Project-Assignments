-- Write queries to return the following:
-- Make the following changes in the "world" database.

-- 1. Add Superman's hometown, Smallville, Kansas to the city table. The
-- countrycode is 'USA', and population of 45001.
INSERT INTO city (name, countrycode, district, population)
VALUES ('Smallville', 'USA', 'Kansas', '45001');
-- 2. Add Kryptonese to the countrylanguage table. Kryptonese is spoken by 0.0001
-- percentage of the 'USA' population.
INSERT INTO countrylanguage (countrycode, language, isofficial, percentage)
VALUES ('USA', 'Kryptonese', 'false', '0.0001');
-- 3. After heated debate, "Kryptonese" was renamed to "Krypto-babble." Change
-- the appropriate record accordingly.
UPDATE countrylanguage SET language = 'Krypto-babble'
WHERE language = 'Kryptonese';
-- 4. Set the US capital to Smallville, Kansas in the country table.
UPDATE country SET capital = '4080'
WHERE code = 'USA';
-- 5. Delete Smallville, Kansas from the city table. (Did it succeed? Why?)
DELETE FROM city
WHERE name = 'Smallville';

 -- NO. It violates foreign key contraint.
 
-- 6. Return the US capital to Washington.
UPDATE country SET capital = '3813'
WHERE code = 'USA';
-- 7. Delete Smallville, Kansas from the city table. (Did it succeed? Why?)
DELETE FROM city
WHERE name = 'Smallville';

--Yes, yes it did. Because it was no longer mapped to any other value. Not constrained.

-- 8. Reverse the "is the official language" setting for all languages where the
-- country's year of independence is within the range of 1800 and 1972
-- (exclusive).
-- (590 rows affected)
UPDATE countrylanguage cl SET isofficial = NOT cl.isofficial
FROM country c WHERE c.code = cl.countrycode
AND c.indepyear > 1800 AND c.indepyear < 1972;

-- 9. Convert population so it is expressed in 1,000s for all cities. (Round up to
-- the nearest integer value.)
-- (4079 rows affected)
UPDATE city SET population = ROUND(population/1000);


-- 10. Assuming a country's surfacearea is expressed in square miles, convert it to
-- square meters for all countries where French is spoken by more than 20% of the
-- population.
-- (7 rows affected)
--SELECT name FROM country c
UPDATE country SET surfacearea = surfacearea*2.59E6
WHERE code IN(SELECT countrycode FROM countrylanguage cl
WHERE cl.language = 'French' AND cl.percentage > 20.0);