use ngologs2;

CREATE TABLE Volunteer (
    volunteerId INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT,
    ngoID INT,
    skills VARCHAR(255),
    interests VARCHAR(255),
    availability ENUM('Morning', 'Afternoon', 'Evening')
);

insert into volunteer values(1, 2024002, 1424002, "Problem Solving, Tech Background, Team Leader", "Singing, Boxing, Teaching", "Evening");