-- select the park name, campground name, open_from_mm, open_to_mm & daily_fee ordered by park name and then campground name
SELECT  park.name, campground.name, campground.open_from_mm, campground.open_to_mm, campground.daily_fee
FROM campground
INNER JOIN park ON park.park_id = campground.park_id
ORDER BY park.name, campground.name;



-- select the park name and the total number of campgrounds for each park ordered by park name
SELECT park.name, COUNT(campground.park_id) AS number_of_campgrounds_per_park
FROM park
INNER JOIN campground ON campground.park_id =park.park_id
GROUP BY park.name
Order BY park.name;



-- select the park name, campground name, site number, max occupancy, accessible, max rv length, utilities where the campground name is 'Blackwoods'
SELECT park.name, campground.name, site.site_number, site.max_occupancy, site.accessible, site.max_rv_length, site.utilities
FROM site
INNER JOIN campground ON campground.campground_id = site.campground_id
INNER JOIN park ON park.park_id = campground.park_id
WHERE campground.name = 'Blackwoods';


/*
  select park name, campground, total number of sites (column alias 'number_of_sites') ordered by park
  -------------------------------------------------
    Acadia	Blackwoods	276
    Acadia	Seawall	198
    Acadia	Schoodic Woods	92
    Arches	"Devil's Garden"	49
    Arches	Canyon Wren Group Site	1
    Arches	Juniper Group Site	1
    Cuyahoga Valley	The Unnamed Primitive Campsites	5
  -------------------------------------------------
*/
SELECT park.name, campground.name, COUNT(site.site_id) AS number_of_sites
FROM park
INNER JOIN campground  ON campground.park_id =park.park_id
INNER JOIN site ON site.campground_id = campground.campground_id
GROUP BY park.name, campground.name
ORDER BY park.name;

-- select site number, reservation name, reservation from and to date ordered by reservation from date
SELECT site_id, name, from_date, to_date
FROM reservation
ORDER BY from_date;


/*
  select campground name, total number of reservations for each campground ordered by total reservations desc
  -------------------------------------------------
    Seawall	13
    Blackwoods	9
    "Devil's Garden"	7
    Schoodic Woods	7
    The Unnamed Primitive Campsites	5
    Canyon Wren Group Site	4
    Juniper Group Site	4
  -------------------------------------------------
*/
SELECT campground.name, COUNT(reservation.reservation_id) AS total_number_of_reservations
FROM campground
INNER JOIN site ON site.campground_id = campground.campground_id
INNER JOIN reservation ON reservation.site_id = site.site_id
GROUP BY campground. name
ORDER BY total_number_of_reservations DESC;




