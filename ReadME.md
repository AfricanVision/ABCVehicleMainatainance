1. Database Schema Design

The schema consists of three main entities: Owner, Vehicle, and Service. Each owner can have multiple vehicles, and each vehicle can have multiple services.
Entities:

    Owner
        id (Primary Key)
        name
        contact
    Vehicle
        id (Primary Key)
        owner_id (Foreign Key to Owner)
        registration
        model
    Service
        id (Primary Key)
        vehicle_id (Foreign Key to Vehicle)
        service_type
        service_date
        cost


Owner
------
id
name
contact

Vehicle
-------
id
owner_id (FK -> Owner.id)
registration
model

Service
-------
id
vehicle_id (FK -> Vehicle.id)
service_type
service_date
cost


SELECT s.service_type, v.model, v.registration, o.name, s.cost, s.service_date
FROM Service s
JOIN Vehicle v ON s.vehicle_id = v.id
JOIN Owner o ON v.owner_id = o.id
ORDER BY s.service_date;


SELECT o.name, COUNT(s.id) AS total_services, SUM(s.cost) AS total_spent
FROM Owner o
JOIN Vehicle v ON o.id = v.owner_id
JOIN Service s ON v.id = s.vehicle_id
GROUP BY o.id, o.name
ORDER BY total_spent DESC;


SELECT v.model, COUNT(s.id) AS service_count, SUM(s.cost) AS total_income
FROM Vehicle v
JOIN Service s ON v.id = s.vehicle_id
GROUP BY v.model
ORDER BY service_count DESC;
