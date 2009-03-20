DROP TABLE IF EXISTS Clans CASCADE;
CREATE TABLE Clans
(
codclan int not null identity primary key,
nome varchar(100) not null
);

DROP TABLE IF EXISTS Idiomas CASCADE;
CREATE TABLE Idiomas
(
codidioma int not null identity primary key,
nome varchar(70) not null,
locale varchar(5) null
);

DROP TABLE IF EXISTS Perfis CASCADE;
CREATE TABLE Perfis
(
codperfil int not null identity primary key,
nome varchar(100) not null
);

DROP TABLE IF EXISTS EstilosMusicais CASCADE;
CREATE TABLE EstilosMusicais
(
codestilomusical int not null identity primary key,
nome varchar(120) not null
);

DROP TABLE IF EXISTS Gravadoras CASCADE;
CREATE TABLE Gravadoras
(
codgravadora int not null identity primary key,
nome varchar(120) not null
);

DROP TABLE IF EXISTS Artistas CASCADE;
CREATE TABLE Artistas
(
codartista int not null identity primary key,
codgravadora int  not null,
nome varchar(140) not null,
foreign key (codgravadora) references Gravadoras(codgravadora)
);

DROP TABLE IF EXISTS Artistas_EstilosMusicais CASCADE;
CREATE TABLE Artistas_EstilosMusicais
(
codartista_estilomusical int not null identity primary key,
codartista int not null,
codestilomusical int not null,
foreign key (codartista) references Artistas(codartista),
foreign key (codestilomusical) references EstilosMusicais(codestilomusical)
);

DROP TABLE IF EXISTS Usuarios CASCADE;
CREATE TABLE Usuarios
(
codusuario int not null identity primary key,
nome varchar(50) not null,
sobrenome varchar(80) not null,
senha varchar(30) not null,
email varchar(100) not null,
pontuacao int not null
);

DROP TABLE IF EXISTS Albuns CASCADE;
CREATE TABLE Albuns
(
codalbum int not null identity primary key,
codartista int not null,
nome varchar(120) not null,
capa varbinary null,
foreign key (codartista) references Artistas(codartista)
);

DROP TABLE IF EXISTS Musicas CASCADE;
CREATE TABLE Musicas
(
codmusica int not null identity primary key,
codidioma int not null,
codalbum int not null,
codusuario int not null,
titulo varchar(100) not null,
txtletra longvarchar not null,
ultimaAtualizacao datetime not null,
foreign key (codidioma) references Idiomas(codidioma),
foreign key (codalbum) references Albuns(codalbum),
foreign key (codusuario) references Usuarios(codusuario)
);

DROP TABLE IF EXISTS Usuarios_Perfis CASCADE;
CREATE TABLE Usuarios_Perfis
(
codusuario_perfil int not null identity primary key,
codusuario int not null,
codperfil int not null,
foreign key (codusuario) references Usuarios(codusuario),
foreign key (codperfil) references Perfis(codperfil)
);

DROP TABLE IF EXISTS Usuarios_Clans CASCADE;
CREATE TABLE Usuarios_Clans
(
codusuario_clan int not null identity primary key,
codusuario int not null,
codclan int not null,
foreign key (codusuario) references Usuarios(codusuario),
foreign key (codclan) references Clans(codclan)
); 

insert into EstilosMusicais (nome) values ('Rock progressivo');
insert into EstilosMusicais (nome) values ('Eletrônica');
insert into Gravadoras (nome) values ('EMG');
insert into Gravadoras (nome) values ('Inside Out');
insert into Idiomas (nome,locale) values ('Português (Brasil)','pt_br');
insert into Idiomas (nome,locale) values ('Inglês','en_us');
insert into Artistas (nome,codgravadora) values ('Duran Duran',0);
insert into Artistas (nome,codgravadora) values ('Dream theater',1);
insert into Albuns (nome,codartista) values ('When Dream and day unite',1);
insert into Albuns (nome,codartista) values ('Images and Words',1);
insert into Albuns (nome,codartista) values ('Awake',1);
insert into Albuns (nome,codartista) values ('A change of seasons',1);
insert into Albuns (nome,codartista) values ('Falling into infinity',1);
insert into Albuns (nome,codartista) values ('Scenes from a memory',1);
insert into Albuns (nome,codartista) values ('Six degrees of inner turbulence',1);
insert into Albuns (nome,codartista) values ('Train of thought',1);
insert into Albuns (nome,codartista) values ('Octavarium',1);
insert into Albuns (nome,codartista) values ('Systematic Chaos',1);
insert into Albuns (nome,codartista) values ('Notorious',0);
insert into Usuarios (nome,sobrenome,email,senha,pontuacao) values ('Usuario','do sistema','nilo.teixeira@gmail.com','teste',0);