-- CAMPGROUND TABLE
-----------------------------------------------

-- select name and daily fee of all campgrounds
SELECT name, daily_fee
FROM campground;

-- select name and daily fee of all campgrounds ordered by campground name
SELECT name, daily_fee
FROM campground 
ORDER BY name;

-- select name, open from month, open to month, and daily fee of the campgrounds where daily fee is less than $100
SELECT name, open_from_mm, open_to_mm, daily_fee
FROM campground
WHERE daily_fee < '$100.00';

-- select name and daily fee of the campgrounds where the campground is open all year long
SELECT name, daily_fee
FROM campground
WHERE open_from_mm ='01' AND open_to_mm ='12';

-- PARK TABLE
-----------------------------------------------

-- select name and description of all parks order by established date in descending order
SELECT name, establish_date, description
FROM park
ORDER BY establish_date DESC;
-- select name and description of all parks in Ohio
SELECT name, location, description
FROM park
WHERE location = 'Ohio';

-- select name and description of all parks NOT in Ohio
SELECT name, location, description
FROM park
WHERE location != 'Ohio';
-- select the total number of visitors for all parks
SELECT name, visitors
FROM park;

-- select the average number of visitors for all parks
SELECT AVG(visitors) AS average_visitors
FROM park;


-- SITE TABLE
-----------------------------------------------

-- select all columns from site where utilities is true and order by max RV length with the largest coming first
SELECT *
FROM site
WHERE utilities = 'true'
ORDER BY max_rv_length DESC;

-- select total number of sites that have utilities hook up
SELECT COUNT(site) AS total_sites_with_utilities
FROM site
WHERE utilities = 'true';

-- RESERVATION TABLE
-----------------------------------------------

-- select reservation id, site id, name, from date, to date of the reservations where the checkin date is between the first and last day of the current month (hard coded month is ok)
SELECT reservation_id, site_id, name, from_date, to_date
FROM reservation
WHERE from_date > '2021-02-01' AND to_date < '2021-02-28';

-- select all columns from reservation where name includes 'Reservation'
SELECT *
FROM reservation
WHERE name Like '%Reservation%';

-- select the total number of reservations in the reservation table
SELECT SUM(reservation_id)
FROM reservation;


-- select reservation id, site id, name of the reservations where site id is in the list 9, 20, 24, 45, 46
SELECT reservation_id, site_id, name
FROM reservation
WHERE reservation_id IN('9', '20', '24', '45', '46');

-- select the date and number of reservations for each date orderd by from_date in ascending order
SELECT from_date, COUNT(from_date) AS number_of_reservations
FROM reservation
GROUP BY from_date
ORDER BY from_date;

