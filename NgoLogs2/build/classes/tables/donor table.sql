 use ngologs2;

create table donor(donorID int primary key auto_increment, ngo_id int, user_ID int, amountContributed int, timeOfDonation 
TIMESTAMP DEFAULT CURRENT_TIMESTAMP, foreign key (ngo_id) references ngo(ngoID), foreign key (user_Id) references person(userID));

insert into donor(donorid, ngo_id, user_id, amountContributed) values(1, 1424001, 2024001, 1500);