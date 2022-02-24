create database mo_hinh_quan_he ;
use mo_hinh_quan_he ;

create table phieu_xuat(
SoPX int primary key ,
NgayXuat date
); 

create table vat_tu(
MaVTU int primary key ,
TenVTU varchar(50)
);

create table phieu_nhap(
SoPN int primary key ,
NgayNhap date 
);

create table don_dh(
SoDH int primary key ,
NgayDH date 
);

create table nha_cc(
MaNCC int primary key ,
TenNCC varchar(50),
DiaChi varchar(50),
SDT int 
);

create table chi_tiet_phieu_xuat(
DGXuat int ,
SLXUAT int ,
SoPX int ,
MaVTU int ,
primary key(SoPX,MaVTU),
foreign key (SoPX) references  phieu_xuat (SoPX),
foreign key (MaVTU) references vat_tu (MaVTU)
);

create table chi_tiet_phieu_nhap(
DGNhap int ,
SLNhap int ,
SoPN int ,
MaVTU int ,
primary key(SoPN,MaVTU),
foreign key (SoPN) references  phieu_nhap (SoPN),
foreign key (MaVTU) references vat_tu (MaVTU)
);

create table chi_tiet_don_dat_hang(
MaVTU int ,
SoDH int ,
primary key (MaVTU , SoDH),
foreign key (MaVTU) references vat_tu(MaVTU) ,
foreign key (SoDH) references don_dh(SoDH) 
);

create table cung_cap(
SoDH int ,
MaNCC int ,
primary key (SoDH,MaNCC),
foreign key (SoDH) references don_dh(SoDH) ,
foreign key (MaNCC) references nha_cc(MaNCC) 
);

