# Mini-projeto POO Aulas 01-04 
arie Katiana Pierre
ADS — Segundo Período


# Mini-Projeto POO — Aulas 01 a 04

## 🎯 Objetivo
Aplicar os conceitos fundamentais de Programação Orientada a Objetos (POO) em Java, incluindo:

- Criação e uso de objetos  
- Encapsulamento (get/set)  
- Construtores  
- Sobrescrita  
- Herança e polimorfismo  
- Organização de classes em um mini-sistema  

---

## 📁 Estrutura do Projeto

mini-projeto-poo-aulas01-04/

├── src/
│ ├── Midia.java
│ ├── Filme.java
│ ├── Serie.java
│ └── App.java
└── README.md



---

## 🧩 Descrição das Classes

### **Midia**
Classe base com os atributos:

- `titulo`  
- `anoLancamento`  
- `genero`

Inclui:

- Construtor  
- Getters e Setters com validação  
- Método `exibirResumo()` que retorna um resumo da mídia  

---

### **Filme**
Subclasse de **Midia** com atributos:

- `duracaoMinutos`

Sobrescreve o método:

- `exibirResumo()` exibindo a duração do filme

---

### **Serie**
Subclasse de **Midia** com atributos:

- `temporadas`
- `episodiosPorTemporada`

Também sobrescreve:

- `exibirResumo()` para mostrar informações específicas da série

---

### **App**
Classe principal responsável por:

- Criar objetos de Filme e Série  
- Exibir informações no console  
- Demonstrar **polimorfismo** ao chamar `exibirResumo()`  

---

# ▶️ Execução

Você pode executar o projeto pelo CMD ou pelo terminal do VS Code.

---

## **1. Executando pelo CMD**

Dentro da pasta `src`, digite:

```bash
javac *.java
java App

2. Executando pelo VS Code (caso o CMD não funcione)

Abra o arquivo App.java

Clique no botão Run no topo

Se não aparecer, pressione Ctrl + F5

O VS Code compila e executa automaticamente.

Saída esperada

=== Filme ===
Título: Interestelar
Ano: 2014
Gênero: Ficção Científica
Duração: 169 minutos

=== Série ===
Título: Breaking Bad
Ano: 2008
Gênero: Drama
Temporadas: 5
Episódios por temporada: 13

Diagrama de Classes (Texto)
Midia
 ├── titulo : String
 ├── anoLancamento : int
 ├── genero : String
 ├── +exibirResumo()
 │
 ├── Filme
 │   ├── duracaoMinutos : int
 │   └── +exibirResumo()
 │
 └── Serie
     ├── temporadas : int
     ├── episodiosPorTemporada : int
     └── +exibirResumo()



Marie Katiana Pierre
ADS — Segundo Período

