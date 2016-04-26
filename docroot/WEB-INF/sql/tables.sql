create table VoteBallot (
	voteBallotId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	voteIdeaTypeId LONG,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	endDate DATE null
);

create table VoteEntry (
	voteEntryId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	voteBallotId LONG
);

create table VoteIdea (
	voteIdeaId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	voteIdeaTypeId LONG,
	name VARCHAR(75) null,
	description VARCHAR(75) null
);

create table VoteIdeaType (
	voteIdeaTypeId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null
);