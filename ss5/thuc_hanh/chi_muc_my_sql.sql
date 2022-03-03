use classicmodels ;

alter table customers add index idx_full_name(contactFirstName, contactLastName) ;
explain select * from customers where contactFirstName = 'Jean' or contactFirstName='King';

