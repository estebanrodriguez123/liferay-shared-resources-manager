create table rivetlogic_Asset (
	uuid_ VARCHAR(75) null,
	assetId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	description TEXT null,
	location LONG,
	active_ BOOLEAN,
	category LONG,
	status VARCHAR(75) null,
	mimeType VARCHAR(75) null,
	photo BLOB,
	currentUserId LONG
);

create table rivetlogic_AssetCategory (
	uuid_ VARCHAR(75) null,
	assetCategoryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	name VARCHAR(75) null,
	description VARCHAR(75) null
);

create table rivetlogic_AssetLocation (
	uuid_ VARCHAR(75) null,
	assetLocationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	name VARCHAR(75) null,
	description VARCHAR(75) null
);

create table rivetlogic_AssetMessage (
	uuid_ VARCHAR(75) null,
	assetMessageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	assetId LONG,
	fromUserId LONG,
	toUserId LONG,
	message VARCHAR(75) null
);

create table rivetlogic_AssetRequest (
	uuid_ VARCHAR(75) null,
	assetRequestId LONG not null primary key,
	groupId LONG,
	assetId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	companyId LONG,
	userName VARCHAR(75) null,
	requestedDate DATE null,
	assingedDate DATE null,
	bookedDate DATE null,
	returnedDate DATE null,
	status VARCHAR(75) null,
	priority VARCHAR(75) null,
	description VARCHAR(75) null
);