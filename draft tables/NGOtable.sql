-- use ngologs;

-- create table ngo(ngoId int primary key auto_increment, catID int, ngoName varchar(70), city varchar(50), email varchar(50), about varchar(450), foreign key (catID) references categories_ngo(cat_id));

-- insert into ngo values(1424001, 1, "Aaradhya Foundation", "Mumbai", "aaradhyaFoundation@gmail.com", "The Aaradhya Foundation is dedicated to providing accessible healthcare solutions to communities in need. Our mission is to ensure that every individual receives the care they deserve, promoting well-being and vitality for all");
-- insert into ngo values(1424002, 1, "Aayushman Foundation", "Chennai", "aayushmanFoundation@gmail.com", "The Aayushman Foundation is committed to child and maternal health, focusing on reducing mortality rates. Specializing in pediatric healthcare, they provide vital medical aid and preventive care. Additionally, they address educational disparities by offering resources and scholarships to support mothers, ensuring a brighter future for families in need.");

-- insert into ngo values(1424003, 2, "EmpowerEd Education", "Pune", "empowerEducation@gmail.com", "EmpowerEd Foundation: Igniting Minds, Transforming Futures. Our mission is to provide quality education to underprivileged children, empowering them to break the cycle of poverty and reach their full potential. Through innovative teaching methods and community engagement, we're shaping tomorrow's leaders, one student at a time.");
-- insert into ngo values(1424004, 2, "Bachapanshala", "Kathua", "bachpanShala@gmail.com", "Illuminating Futures. Committed to breaking barriers and nurturing talents in underserved areas. Our passion lies in fostering a love for learning and empowering individuals to thrive academically, ensuring no dream goes unfulfilled.");

-- insert into ngo values(1424005, 3, "Sevadeep", "Pune", "sevadeep@gmail.com", "Sevadeep is on a mission to eliminate food insecurity by rescuing surplus food and redistributing it to those in need. Our efforts not only reduce food waste but also nourish individuals and families, fostering healthier and more resilient communities.");
-- insert into ngo values(1424006, 3, "Annamrita Foundation", "Pune", "amritaFoundation@gmail.com", "Annamrita Foundation cultivates a more equitable and sustainable food system. We support small-scale farmers practicing sustainable agriculture, providing them with resources and market access. We also educate consumers about the importance of local food systems and empower them to make informed choices about the food they eat.");

-- insert into ngo values(1424007, 4, "Polaris Project", "Pune", "polarisProject@gmail.com", "The Polaris Project is committed to combating human trafficking, offering hope to victims through rescue and rehabilitation. Through partnerships with law enforcement and community outreach, we work to raise awareness, prevent trafficking, and prosecute perpetrators. Our goal: a world free from exploitation and oppression");
-- insert into ngo values(1424008, 4, "International Justice Mission", "Mumbai", "IJM@gmail.com", "The International Justice Mission is a grassroots movement dedicated to raising awareness about human trafficking and advocating for stronger legislation to combat this modern-day slavery. We educate communities, empower survivors, and work with policymakers to create a world free from exploitation.");

-- insert into ngo values(1424009, 5, "Narayan Foundation", "Hyderabad", "narayanFoundation@gmail.com", "The Narayan Foundation is dedicated to providing accessible healthcare solutions to communities in need. Our mission is to ensure that every individual receives the care they deserve, promoting well-being and vitality for all");
-- insert into ngo values(1424010, 5, "Wellness Initiative", "Pune", "wellnessInitiative@gmail.com", "The Wellness Initiativeaims to uplift communities through holistic healthcare services. Our holistic approach encompasses physical, mental, and emotional well-being, ensuring a balanced and thriving society.");

-- update ngo set about = "The Aayushman Foundation is committed to child and maternal health, focusing on reducing mortality rates. Specializing in pediatric healthcare, they provide vital medical aid and preventive care. Additionally, they address educational disparities by offering resources and scholarships to support mothers, ensuring a brighter future for families in need." where ngoid = 1424002;
-- update ngo set about = "EmpowerEd Foundation: Igniting Minds, Transforming Futures. Our mission is to provide quality education to underprivileged children, empowering them to break the cycle of poverty and reach their full potential. Through innovative teaching methods and community engagement, we're shaping tomorrow's leaders, one student at a time." where ngoid = 1424003;
-- update ngo set about = "Illuminating Futures. Committed to breaking barriers and nurturing talents in underserved areas. Our passion lies in fostering a love for learning and empowering individuals to thrive academically, ensuring no dream goes unfulfilled." where ngoid = 1424004;
-- update ngo set about = "Sevadeep is on a mission to eliminate food insecurity by rescuing surplus food and redistributing it to those in need. Our efforts not only reduce food waste but also nourish individuals and families, fostering healthier and more resilient communities." where ngoid = 1424005;
-- update ngo set about = "Annamrita Foundation cultivates a more equitable and sustainable food system. We support small-scale farmers practicing sustainable agriculture, providing them with resources and market access. We also educate consumers about the importance of local food systems and empower them to make informed choices about the food they eat." where ngoid = 1424006;
-- update ngo set about = "The Polaris Project is committed to combating human trafficking, offering hope to victims through rescue and rehabilitation. Through partnerships with law enforcement and community outreach, we work to raise awareness, prevent trafficking, and prosecute perpetrators. Our goal: a world free from exploitation and oppression" where ngoid = 1424007;
-- update ngo set about = "The International Justice Mission is a grassroots movement dedicated to raising awareness about human trafficking and advocating for stronger legislation to combat this modern-day slavery. We educate communities, empower survivors, and work with policymakers to create a world free from exploitation." where ngoid = 1424008;
-- update ngo set about = "The Narayan Foundation is dedicated to providing accessible healthcare solutions to communities in need. Our mission is to ensure that every individual receives the care they deserve, promoting well-being and vitality for all" where ngoid = 1424009;
-- update ngo set about = "The Wellness Initiativeaims to uplift communities through holistic healthcare services. Our holistic approach encompasses physical, mental, and emotional well-being, ensuring a balanced and thriving society." where ngoid = 1424010;

-- alter table ngo add column num_volunteers int;
-- alter table ngo add column num_donors int;

-- alter table ngo add column revenue_generated int;

-- update ngo set num_volunteers = (select count(user_id) from volunteer where ngoid = 1424002) where ngoID = 1424002;
-- update ngo set num_donors = (select count(user_id) from donor where ngoid = 1424001) where ngoID = 1424001;





