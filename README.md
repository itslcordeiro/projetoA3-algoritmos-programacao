# 🛒 Projeto A3 — Sistema de Mini Mercado

Sistema desenvolvido em Java para gerenciamento de um mini mercado utilizando terminal (console).

# 👨‍💻 Participantes

- [Antonio Augusto](https://github.com/auguxtodev) - 8261103548
- Gustavo Batista - 8261100192
- [Gustavo Brunholi](https://github.com/gubrunholi) - 826189478
- [Leonardo Cordeiro](https://github.com/itslcordeiro) - 8261113737

## 📚 Funcionalidades

- CRUD de Produtos
- CRUD de Clientes
- Controle de Estoque
- Realização de Compras
- Persistência de Dados em CSV
- Sistema totalmente em terminal

---

## 🧠 Conceitos Utilizados

- Variáveis e Tipos de Dados
- Estruturas Condicionais
- Estruturas de Repetição
- Vetores/Listas
- Modularização
- Classes e Objetos
- Persistência em Arquivos CSV
- Organização de Código

---

## 📂 Estrutura do Projeto

```
src/
 ├── model
 ├── service
 ├── util
 └── Main.java
```

---

# ▶️ Tutorial Completo — Como Rodar o Projeto

## ✅ Pré-requisitos

Antes de executar o projeto, você precisa ter instalado:

- Java JDK 17 ou superior
- VSCode, IntelliJ ou Eclipse

Para verificar se o Java está instalado, abra o terminal e digite:

```powershell
java -version
```

Se aparecer a versão do Java, está tudo certo.

---

# 📥 Baixando o Projeto

1. Baixe o projeto ZIP
2. Extraia a pasta
3. Abra a pasta do projeto no VSCode ou outra IDE Java

---

# 📂 Estrutura Correta

O projeto deve ficar assim:

```text
mini-mercado-projeto/
│
├── src/
│   ├── model/
│   ├── service/
│   ├── util/
│   └── Main.java
│
├── produtos.csv
├── clientes.csv
└── README.md
```

---

# ▶️ Executando pelo VSCode

## Método 1 — Mais Fácil

1. Abra a pasta do projeto
2. Vá até:

```text
src/Main.java
```

3. Clique no botão:

```text
Run Java
```

ou no ▶️ no canto superior direito.

---

# 💻 Executando pelo Terminal

## 1. Abra o terminal na pasta `src`

Exemplo:

```powershell
cd "C:\Users\SEU_USUARIO\Documents\mini-mercado-projeto\src"
```

---

## 2. Compile o projeto

No PowerShell do Windows:

```powershell
javac Main.java model\*.java service\*.java util\*.java
```

---

## 3. Execute o sistema

```powershell
java Main
```

---

# ✅ Resultado Esperado

Ao executar corretamente, aparecerá:

```text
====================================
      MINI MERCADO - MENU
====================================
1. Produtos
2. Clientes
3. Realizar Compra
4. Controle de Estoque
0. Sair
```

---

# ⚠️ Possíveis Erros

## Erro: package does not exist

Isso acontece quando você tenta executar um arquivo separado.

✅ Solução:

Sempre compile TODOS os arquivos juntos usando:

```powershell
javac Main.java model\*.java service\*.java util\*.java
```

---

## Erro: NoClassDefFoundError

Esse erro acontece quando o projeto não foi compilado corretamente.

✅ Solução:

Compile novamente todos os arquivos e execute apenas:

```powershell
java Main
```

---

# 💾 Arquivos CSV

Os dados são salvos automaticamente em:

```text
produtos.csv
clientes.csv
```

O sistema mantém os dados salvos mesmo após fechar o programa.

---

## 💾 Persistência de Dados

Os dados são armazenados em:

- produtos.csv
- clientes.csv

O sistema salva automaticamente os dados.

---

## 🏆 Projeto Acadêmico

Projeto desenvolvido para a disciplina de Programação Java.
