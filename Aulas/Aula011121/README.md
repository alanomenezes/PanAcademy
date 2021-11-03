# Atividade Banco de Dados MongoDB

**Você deve criar um banco de dados novo (database) e uma coleção com um nome pertinente, de acordo com os dados e tema que você escolher. Os seguintes comandos devem ser feitos e entregues:**

- Inserção de documentos
- Atualização de documentos 
- Exclusão de documentos 
- Consulta com projeção
- Consulta utilizando combinação entre os seletores
- Consulta paginada e ordenada (utilizar ignorar , limitar e classificar )



Softwares utilizados nesta atividade:

-  [MongoDB Community Server](https://www.mongodb.com/try/download/community) - Banco de dados
-  [Robo 3T](https://robomongo.org/download) - IDE para MongoDB
-  [MongoDB Database Tools](https://www.mongodb.com/try/download/database-tools)  - CLI para trabalhar com uma implantação do MongoDB.



Importando base de dados de uma collection em um banco e dados MongoDB criados nesta atividade, utilizando o  [MongoDB Database Tools](https://www.mongodb.com/try/download/database-tools) .

`mongoimport --db <database_name> --collection <"collection_name"> --type json --file "<path_file\>pokedex.json>" --jsonArray`



Comandos utilizados



Comandos utilizado abaixo foram aplicados utilizando o Robo 3T

* Criação do banco de dados:

```shell
use pokemon
```

* Criação da collection:  

```shell
db.createCollection('pokedex')
```

* Listar collections existentes

```shell
show collections
```

* Apagar a collection:  

```shell
db.pokedex.drop()
```

* Inserção de Documento:  

```shell
db.pokedex.insert({
     "_id" : ObjectId("6190d8fe0632e2c6dec46d50"),
    "id" : 1000,
    "name" : {
        "english" : "Platypus",
        "japanese" : "カモノハシ",
        "chinese" : "鴨嘴獸",
        "french" : "Ornithorynque"
    },
    "type" : [ 
        "Normal"
    ],
    "base" : {
        "HP" : 100,
        "Attack" : 100,
        "Defense" : 100,
        "Sp. Attack" : 100,
        "Sp. Defense" : 100,
        "Speed" : 100
    }   
})
```

* Atualização de Documento:  

```shell
db.getCollection('pokedex').update(
    // query 
    {
        "id": 1000.0,
        "type" : "Normal"
    },
    
    // update 
    {
        $set:{ "type" : ["Special"]}
    },
    
    // options 
    {
        "multi" : false,  // update only one document 
        "upsert" : false  // insert a new document, if no existing document match the query 
    }
);
```

* Exclusão de um campo do Documento

  `db.getCollection('pokedex').update(`
  	`// query` 
  	`{`
  		`"name.french" : "Ornithorynque"`
  	`},`
  ``	

  	// update 
  	{ $unset: {"name.french" : "Ornithorynque"}
  	},
  	
  	// options 
  	{
  		"multi" : false,  // update only one document 
  		"upsert" : false  // insert a new document, if no existing document match the query 
  	}
  `)`

* Exclusão de um Documento:

```shell
db.pokedex.remove({"name.english" : "Platypus"})
```

* Consulta com projeção
  Exibindo apenas nome do Pokémon e o seu tipo na consulta

```shell
db.getCollection('pokedex').find({},{"name.english" : 1, "type" : 1, "_id" : 0})
```

- Consulta utilizando combinação entre os dados dos Pokémons
- Retorna Pokémons com bases de vida, ataque e velocidade a partir de 50

`db.getCollection('pokedex').find({"base.HP": {$gte: 50},"base.Attack": {$gte: 50},"base.Speed" : {$gte: 50}})`

- Consulta paginada e ordenada (utilizar ignorar , limitar e classificar

- Para ver Pokémons com vida base maior a partir de 50

  `db.getCollection('pokedex').find({"base.HP" : {$gte : 50 }})`

- Para ver ordenador por tipo de Pokémons
  `db.getCollection('pokedex').find().sort({"type": 1})`

- Limitando a 2 registros
  `db.getCollection('pokedex').find().limit(2)`

- Pulando um registro
  `db.getCollection('pokedex').find().skip(1)`

- Consulta com combinação
  Pokémons que começam com a letra A e são do tipo Bug

  `db.getCollection('pokedex').find({"name.english": /.*A.*/, "type": /.*Bug*/})`