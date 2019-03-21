# Catalogue des patrons de conception du GoF

  * Auteur : Sébastien Mosser (UQAM)
  * Contributeurs: Mireille Blay-Fornarino (UCA), Philippe Collet (UCA)
  * Version : 2019.03 
  * Intégration continue : [![Build Status](https://travis-ci.com/ace-lectures/pattern-repository.svg?branch=master)](https://travis-ci.com/ace-lectures/pattern-repository)

Ce dépôt est un support au cours INF-5153 de l'Université du Québec à Montréal. Il recense des implémentation en Java des patrons de conceptions vu dans ce cours. Il est créé en collaboration avec l'Université Côte d'Azur (IUT & Polytech).

## Patrons disponibles

### Création

Patron de conception | Description | Code d'exemple | Diapositives |
---------------------| :---------: | :------------: | :----------: |
[Abstract Factory](./creation/abstract_factory) | :white_check_mark: | :x: | :x: | 
[Builder](./creation/builder) | :white_check_mark: | :white_check_mark: | :x: |
[Factory](./creation/factory) | :white_check_mark: | :x: | :x: | 
[Prototype](./creation/prototype) | :white_check_mark: | :white_check_mark: | :x: |
[Singleton](./creation/singleton) | :white_check_mark: | :white_check_mark: | :x: |
 
 
### Structure

Patron de conception | Description | Code d'exemple | Diapositives |
---------------------| :---------: | :------------: | :----------: |
[Adapter](./structure/adapter) | :white_check_mark: | :x: | :x: | 
[Composite](./structure/composite) | :white_check_mark: | :white_check_mark: | :x: | 
[Decorator](./structure/decorator) | :white_check_mark: | :white_check_mark: | :x: | 
[Facade](./structure/facade) | :white_check_mark: | :x: | :x: | 
[Proxy](./structure/proxy) | :white_check_mark: | :white_check_mark: | :x: | 

### Comportement

Patron de conception | Description | Code d'exemple | Diapositives |
---------------------| :---------: | :------------: | :----------: |
[Command](./comportement/command) | :white_check_mark: | :x: | :x: | 
[Observer](./comportement/observer) | :white_check_mark: | :white_check_mark: | :x: | 
[State](./comportement/state) | :white_check_mark: | :white_check_mark: | :x: | 
[Strategy](./comportement/strategy) | :white_check_mark: | :white_check_mark: | :x: | 
[Template Method](./comportement/template_method) | :white_check_mark: | :white_check_mark: | :x: | 
[Visitor](./comportement/visitor) | :white_check_mark: | :white_check_mark: | :x: | 

## Bonus

  - [ ] `Observer` en utilisant le patron présent dans Java
  - [ ] `Prototype` en utilisant le mécanisme de `Cloneable` de Java


## Contribuer au catalogue

Pour contribuer au catalogue, n'hésitez pas : 

  - A _forker_ le dépôt pour proposer de nouvelles implémentations (_pull requests_ bienvenues);
  - A utiliser le système d'_issues_ de Github pour rapporter des problèmes ou proposer des évolutions.

### Patrons non couverts dans le cours

  - Structure
    - [ ] Bridge
    - [ ] Flyweight
  - Comportement
    - [ ] Interpreter
    - [ ] Chain of Responsbility
    - [ ] Iterator
    - [ ] Mediator
    - [ ] Memento     

## Environement Logiciel

  - Le patrons sont implémenté en Java, version 11 (LTS);
  - Le dépôt est un projet Maven (3.6);
    - Pour compiler l'intégralité des codes, `mvn clean package` à la racine du dépôt. 
    - Pour lancer un projet donné, après l'avoir compilé: `mvn -q exec:java`
  - Les diagrammes UMLs sont donnés en utilisant le format de PlantUML;
    - Pour produire une image `.png` ou `.pdf` à partir de la description `.puml`, vous devez utiliser le logiciel `plantuml` (avec le `charset` UTF-8 pour les caractères accentués). 
    - Chaque sous-repertoire `uml` contient une `Makefile` qui construit les images à partir des descriptions (`make png` et `make pdf`).