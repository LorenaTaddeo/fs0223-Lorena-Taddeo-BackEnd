/*CREATE TABLE IF NOT EXISTS clienti (
	NumeroClienti SERIAL PRIMARY KEY,
	nome VARCHAR NOT NULL,
	cognome VARCHAR NOT NULL,
	dataNascita DATE NOT NULL,
	regioneResidenza VARCHAR NOT NULL
);*/

INSERT INTO clienti(nome, cognome, dataNascita, regioneResidenza) VALUES ('Giorgio', 'Armani', '1990-05-15', 'Lombardia');
INSERT INTO clienti(nome, cognome, dataNascita, regioneResidenza) VALUES ('Valentino', 'Garavani', '1932-05-11', 'Lombardia');
INSERT INTO clienti(nome, cognome, dataNascita, regioneResidenza) VALUES ('Anna', 'Fendi', '1982-03-23', 'Lazio');
INSERT INTO clienti(nome, cognome, dataNascita, regioneResidenza) VALUES ('Donatella', 'Versace', '1982-12-2', 'Calabria');
INSERT INTO clienti(nome, cognome, dataNascita, regioneResidenza) VALUES ('Muccia', 'Prada', '1949-05-10', 'Lombardia');

/*CREATE TABLE IF NOT EXISTS fatture (
	NumeroFattura SERIAL PRIMARY KEY, 
	tipologia VARCHAR NOT NULL,
	importo DECIMAL NOT NULL,
	iva INTEGER NOT NULL,
	idCliente VARCHAR NOT NULL UNIQUE,
	dataFattura DATE NOT NULL,
	numeroFornitore INTEGER NOT NULL REFERENCES fornitori(numeroFornitore)
);*/

INSERT INTO fatture(tipologia, importo, iva, idCliente, dataFattura, numeroFornitore) VALUES ('Differita', 500, 22, '1234-378', '2022-04-21', 1);
INSERT INTO fatture(tipologia, importo, iva, idCliente, dataFattura, numeroFornitore) VALUES ('Anticipata', 1500, 20, '1234-332', '2022-12-30', 3);
INSERT INTO fatture(tipologia, importo, iva, idCliente, dataFattura, numeroFornitore) VALUES ('Di acconto', 2000, 20, '1234-989', '2022-03-12', 5);
INSERT INTO fatture(tipologia, importo, iva, idCliente, dataFattura, numeroFornitore) VALUES ('Semplificata', 200, 20, '1234-113', '2021-02-20', 2);
INSERT INTO fatture(tipologia, importo, iva, idCliente, dataFattura, numeroFornitore) VALUES ('Anticipata', 3000, 20, '1234-743', '2022-09-9', 4);

/*CREATE TABLE IF NOT EXISTS prodotti (
	IdProdotto SERIAL PRIMARY KEY, 
	descrizione VARCHAR NOT NULL,
	inProduzione BOOLEAN NOT NULL,
	inCommercio BOOLEAN NOT NULL,
	dataDisattivazione DATE,
	dataAttivazione DATE NOT NULL,
);*/

INSERT INTO prodotti(descrizione, inProduzione, inCommercio, dataDisattivazione, dataAttivazione) VALUES ('Profumo', TRUE, FALSE, '2022-04-21', '2022-04-11');
INSERT INTO prodotti(descrizione, inProduzione, inCommercio, dataDisattivazione, dataAttivazione) VALUES ('Borsa', FALSE, TRUE, '2021-02-28', '2017-02-20');
INSERT INTO prodotti(descrizione, inProduzione, inCommercio, dataDisattivazione, dataAttivazione) VALUES ('Giacca', TRUE, FALSE, '2023-01-7', '2022-12-30');
INSERT INTO prodotti(descrizione, inProduzione, inCommercio, dataDisattivazione, dataAttivazione) VALUES ('Scarpe', TRUE, TRUE, '2022-08-24', '2022-09-9');
INSERT INTO prodotti(descrizione, inProduzione, inCommercio, dataDisattivazione, dataAttivazione) VALUES ('Pelliccia', FALSE, FALSE, '2021-03-1', '2017-03-12');
DELETE FROM prodotti WHERE Idprodotto = 1;

/*CREATE TABLE IF NOT EXISTS fornitori (
	numeroFornitore SERIAL PRIMARY KEY,
	denominazione VARCHAR NOT NULL,
	regioneResidenza VARCHAR NOT NULL
);*/

INSERT INTO fornitori(denominazione, regioneResidenza) VALUES ('Armani', 'Lombardia');
INSERT INTO fornitori(denominazione, regioneResidenza) VALUES ('Stylia', 'Lazio');
INSERT INTO fornitori(denominazione, regioneResidenza) VALUES ('Top Coat', 'Marche');
INSERT INTO fornitori(denominazione, regioneResidenza) VALUES ('MantovaModa', 'Lombardia');
INSERT INTO fornitori(denominazione, regioneResidenza) VALUES ('Les Griffes', 'Campania');

SELECT * FROM clienti;
SELECT * FROM prodotti;
SELECT * FROM fatture INNER JOIN fornitori ON fatture.numeroFornitore = fornitori.numeroFornitore;

SELECT nome, cognome FROM clienti WHERE EXTRACT (YEAR FROM dataNascita) = 1982;

SELECT iva FROM fatture WHERE iva = 20;

SELECT COUNT (numeroFattura) FROM fatture;

SELECT COUNT(numerofattura) AS Numero_Fatture, 
	SUM(importo) AS Somma_importi, 
    EXTRACT(YEAR FROM datafattura) AS anno 
	FROM fatture GROUP BY anno
	
SELECT * FROM prodotti 
	WHERE EXTRACT (YEAR FROM dataAttivazione) = 2017 
	AND (inProduzione = true OR inCommercio = true);
	
SELECT * FROM fatture WHERE iva = 20;

SELECT EXTRACT(YEAR FROM dataFattura) AS anno, COUNT(*) AS numeroFatture
FROM fatture
WHERE iva = 20
GROUP BY EXTRACT (YEAR FROM dataFattura);

SELECT * FROM fatture WHERE tipologia LIKE 'A%';
SELECT EXTRACT(YEAR FROM dataFattura) AS anno, COUNT(*) AS numeroFatture
FROM fatture
WHERE tipologia LIKE 'A%'
GROUP BY EXTRACT (YEAR FROM dataFattura)
HAVING COUNT(*) > 1;

SELECT numeroFattura, importo, iva, dataFattura, denominazione
	FROM fatture 
	INNER JOIN fornitori  
	ON fatture.numeroFornitore = fornitori.numeroFornitore;

SELECT * FROM fatture INNER JOIN clienti ON fatture.idCliente = clienti.numeroCliente;

