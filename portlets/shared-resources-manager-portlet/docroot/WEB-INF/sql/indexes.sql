create index IX_65441369 on rivetlogic_Asset (companyId, groupId);
create index IX_EF4FF2A3 on rivetlogic_Asset (companyId, groupId, userId);
create index IX_18D9A923 on rivetlogic_Asset (groupId);
create index IX_FB7D286D on rivetlogic_Asset (uuid_);
create index IX_CA57459B on rivetlogic_Asset (uuid_, companyId);
create unique index IX_C09A76DD on rivetlogic_Asset (uuid_, groupId);

create index IX_AB23B907 on rivetlogic_AssetCategory (companyId, groupId);
create index IX_83F71A41 on rivetlogic_AssetCategory (companyId, groupId, userId);
create index IX_58895A45 on rivetlogic_AssetCategory (groupId);
create index IX_384ABA0F on rivetlogic_AssetCategory (uuid_);
create index IX_F87FBAB9 on rivetlogic_AssetCategory (uuid_, companyId);
create unique index IX_C9F99B7B on rivetlogic_AssetCategory (uuid_, groupId);

create index IX_EB2FA87E on rivetlogic_AssetLocation (companyId, groupId);
create index IX_5873A2B8 on rivetlogic_AssetLocation (companyId, groupId, userId);
create index IX_96B86F2E on rivetlogic_AssetLocation (groupId);
create index IX_95DBF538 on rivetlogic_AssetLocation (uuid_);
create index IX_52DF1BF0 on rivetlogic_AssetLocation (uuid_, companyId);
create unique index IX_2C5DDE72 on rivetlogic_AssetLocation (uuid_, groupId);

create index IX_12B73AAE on rivetlogic_AssetMessage (companyId, groupId);
create index IX_A2365AFE on rivetlogic_AssetMessage (groupId);
create index IX_B0829508 on rivetlogic_AssetMessage (uuid_);
create index IX_CA857A20 on rivetlogic_AssetMessage (uuid_, companyId);
create unique index IX_C56608A2 on rivetlogic_AssetMessage (uuid_, groupId);

create index IX_AC131736 on rivetlogic_AssetRequest (companyId, groupId);
create index IX_7F38D970 on rivetlogic_AssetRequest (companyId, groupId, userId);
create index IX_92A70376 on rivetlogic_AssetRequest (groupId);
create index IX_9B72FB80 on rivetlogic_AssetRequest (uuid_);
create index IX_CBED8A8 on rivetlogic_AssetRequest (uuid_, companyId);
create unique index IX_EDF5692A on rivetlogic_AssetRequest (uuid_, groupId);