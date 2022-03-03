delimiter //
create procedure findAllCustomers()
begin
select * from customers ;
end //
delimiter ;
-- Các gọi procedure
call findAllCustomers

delimiter //
drop procedure if exists `findAllCustomer` //
create procedure findAllCustomer()
begin
select * from customers where customerNumber = 175 ;
end //