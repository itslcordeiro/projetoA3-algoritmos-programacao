# ▶️ Como Executar o Sistema

Tutorial completo para compilação e execução do sistema Mini Mercado em Java.

---

# ✅ Pré-requisitos

Antes de iniciar, é necessário possuir instalado:

- Java JDK 17 ou superior
- VSCode, IntelliJ IDEA ou Eclipse

---

# 🔍 Verificando a instalação do Java

Abra o terminal e execute:

```powershell
java -version
```

Se aparecer a versão do Java instalada, o ambiente está configurado corretamente.

---

# 📥 Baixando o Projeto

1. Faça o download do projeto ZIP
2. Extraia os arquivos
3. Abra a pasta do projeto em sua IDE Java

---

# 📂 Estrutura Esperada

O projeto deve possuir a seguinte estrutura:

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
├── README.md
└── COMO_EXECUTAR.md
```

---

# ▶️ Executando pelo VSCode

## Método recomendado

1. Abra o projeto no VSCode
2. Acesse:

```text
src/Main.java
```

3. Clique em:

```text
Run Java
```

ou no botão ▶️ localizado no canto superior direito.

---

# 💻 Executando pelo Terminal

## 1️⃣ Abrir o terminal na pasta `src`

Exemplo:

```powershell
cd "C:\Users\SEU_USUARIO\Documents\mini-mercado-projeto\src"
```

---

## 2️⃣ Compilar o projeto

No PowerShell do Windows:

```powershell
javac Main.java model\*.java service\*.java util\*.java
```

---

## 3️⃣ Executar o sistema

```powershell
java Main
```

---

# ✅ Resultado Esperado

Ao iniciar corretamente, o menu principal será exibido:

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

## ❌ package does not exist

Esse erro ocorre quando apenas um arquivo é compilado individualmente.

### ✅ Solução

Compile todos os arquivos juntos:

```powershell
javac Main.java model\*.java service\*.java util\*.java
```

---

## ❌ NoClassDefFoundError

Esse erro acontece quando a compilação não foi realizada corretamente.

### ✅ Solução

Compile novamente todos os arquivos e execute:

```powershell
java Main
```

---

# 💾 Arquivos CSV

O sistema salva automaticamente os dados em:

```text
produtos.csv
clientes.csv
```

---

# 🔙 Voltar para o README Principal

➡️ [README.md](./README.md)
