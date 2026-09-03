# Monitoria de Programação Orientada a Objetos I

Este repositório reúne os **exemplos, exercícios e pequenos projetos desenvolvidos durante os horários de monitoria da disciplina de Programação Orientada a Objetos I**.

O objetivo é manter o código feito durante as monitorias organizado e disponível para consulta posterior, especialmente para quem quiser:

* revisar o que foi feito durante a monitoria;
* comparar diferentes soluções para um mesmo problema;
* testar e modificar os exemplos por conta própria;
* praticar os conceitos apresentados em aula;
* recuperar algum código desenvolvido durante um atendimento.

> **Não se preocupe se você ainda não conhece Git ou GitHub.**
> Você não precisa saber Git para acessar os exemplos deste repositório. Mais abaixo há instruções simples para baixar e abrir os projetos.

---

## 📌 Materiais da monitoria

Os materiais da monitoria estão distribuídos entre este repositório e uma pasta compartilhada no Google Drive:

### 💻 GitHub

Este repositório concentra principalmente:

* códigos desenvolvidos durante os atendimentos;
* exemplos;
* exercícios;
* pequenos projetos;
* eventuais notas e materiais relacionados às sessões.

### 📁 Google Drive

Outros materiais complementares da monitoria podem ser encontrados na pasta compartilhada:

👉 [Acessar a pasta da monitoria no Google Drive](https://drive.google.com/drive/folders/14H1aeLXiYUzop1Y-Z4sep2QJu1ou2cNJ?usp=sharing)

Sempre que possível, os materiais serão organizados para facilitar a relação entre o conteúdo desenvolvido durante os atendimentos e os arquivos disponíveis aqui no GitHub.

---

## 📚 Organização do repositório

Os materiais são organizados primeiro pelo **mês** e depois pela **data da monitoria**.

Por exemplo:

```text
Monitoria-POO-I_2026/
│
├── README.md
│
└── Agosto/
    └── 22-08/
        └── Exemplo/
            ├── src/
            │   ├── exemplo/
            │   │   ├── Exemplo.java
            │   │   ├── SistemaAlunoRefatoradooc.java
            │   │   └── SistemaAlunos.java
            │   │
            │   └── exLoja/
            │       ├── Loja.java
            │       └── Produto.java
            │
            ├── test/
            ├── nbproject/
            ├── build/
            ├── build.xml
            └── manifest.mf
```

A ideia é que o caminho indique **quando aquele código foi desenvolvido**.

Por exemplo:

```text
Agosto/22-08/Exemplo/
```

significa:

```text
Mês: Agosto
Data da monitoria: 22/08
Projeto: Exemplo
```

---

## 🔎 Onde está o código que eu devo estudar?

Na maioria das vezes, o que você procura estará dentro da pasta:

```text
src/
```

Por exemplo:

```text
Agosto/
└── 22-08/
    └── Exemplo/
        └── src/
            ├── exemplo/
            │   ├── Exemplo.java
            │   ├── SistemaAlunoRefatoradooc.java
            │   └── SistemaAlunos.java
            │
            └── exLoja/
                ├── Loja.java
                └── Produto.java
```

Os arquivos terminados em:

```text
.java
```

são os arquivos contendo o **código-fonte Java**.

Então, se você quer apenas consultar o que foi escrito durante a monitoria, normalmente basta navegar até `src/` e abrir os arquivos `.java`.

---

## ☕ Abrindo um arquivo diretamente pelo GitHub

Você não precisa baixar nada para simplesmente ler um código.

No GitHub:

1. abra a pasta correspondente ao mês;
2. abra a pasta da data desejada;
3. entre no projeto;
4. abra a pasta `src`;
5. escolha o pacote desejado;
6. clique no arquivo `.java`.

O GitHub mostrará o código diretamente pelo navegador.

---

## 💾 Quero baixar o projeto para o meu computador

Se você **ainda não utiliza Git**, a maneira mais simples é baixar o repositório como arquivo `.zip`.

### Opção 1 — Baixar ZIP

Na página principal do repositório:

1. clique no botão **Code**;
2. clique em **Download ZIP**;
3. extraia o arquivo baixado;
4. procure a pasta correspondente à monitoria desejada;
5. abra o projeto pelo NetBeans.

Exemplo:

```text
Agosto/22-08/Exemplo
```

No NetBeans, você pode utilizar:

```text
File → Open Project
```

e selecionar a pasta do projeto.

---

## 🌱 Já uso Git

Se você já possui Git instalado, pode clonar o repositório:

```bash
git clone https://github.com/henriqueleaop/Monitoria-POO-I_2026.git
```

Depois:

```bash
cd Monitoria-POO-I_2026
```

Assim você terá uma cópia local de todos os materiais.

Para buscar atualizações futuras:

```bash
git pull
```

Não é necessário conhecer Git para acompanhar a monitoria, mas aprender o básico dele será bastante útil ao longo do curso e na vida profissional.

---

## 🧩 Por que existem tantas outras pastas?

Ao abrir um projeto criado pelo NetBeans, você poderá encontrar arquivos como:

```text
build/
nbproject/
build.xml
manifest.mf
```

Não se assuste.

Eles fazem parte da estrutura utilizada pelo **NetBeans para configurar, compilar e executar o projeto**.

Para estudar Programação Orientada a Objetos, na maior parte do tempo o que realmente nos interessa está em:

```text
src/
```

### `src/`

Contém o código-fonte escrito por nós.

Exemplo:

```text
src/exLoja/Produto.java
```

### `test/`

Pode conter testes do projeto.

Nem todos os exemplos necessariamente terão testes.

### `build/`

Pode conter arquivos gerados durante a compilação.

Por exemplo:

```text
Produto.class
```

Um arquivo `.class` é resultado da compilação de um arquivo `.java`.

De maneira simplificada:

```text
Produto.java
     │
     │ compilação
     ▼
Produto.class
```

Você normalmente **não precisa editar arquivos `.class`**.

### `nbproject/`

Contém configurações utilizadas pelo NetBeans.

Na maioria dos exercícios da disciplina você não precisará alterar manualmente esses arquivos.

---

## 🧠 Como utilizar este repositório para estudar

Evite apenas copiar o código.

Uma forma muito melhor de aproveitar os exemplos é:

1. leia o problema que estava sendo resolvido;
2. tente entender a solução sem executar o programa;
3. tente prever o resultado;
4. execute;
5. modifique alguma parte do código;
6. observe o que muda;
7. tente reconstruir a solução sozinho.

Por exemplo, se houver:

```java
Produto produto = new Produto("Teclado", 150.0);
```

experimente pensar:

* O que é `Produto`?
* O que é `produto`?
* O que o `new` está fazendo?
* Qual construtor está sendo chamado?
* Onde ficam armazenados `"Teclado"` e `150.0`?
* O que aconteceria se criássemos outro `Produto`?
* O que aconteceria se duas variáveis referenciassem o mesmo objeto?

Esse tipo de investigação é muito mais importante do que memorizar código.

---

## 🎯 Conteúdos

Os exemplos do repositório poderão envolver assuntos como:

* classes e objetos;
* atributos;
* métodos;
* construtores;
* encapsulamento;
* referências entre objetos;
* arrays e coleções;
* composição;
* herança;
* polimorfismo;
* classes abstratas;
* interfaces;
* tratamento de exceções;
* refatoração;
* modelagem de pequenos sistemas;
* outros conteúdos abordados ao longo da disciplina.

Nem todos esses assuntos necessariamente aparecerão desde o início. O repositório crescerá conforme as monitorias forem acontecendo.

---

## ⚠️ Sobre as soluções

Os códigos encontrados aqui foram produzidos principalmente com **finalidade didática**.

Isso significa que uma solução pode priorizar clareza e facilidade de entendimento em vez de representar a arquitetura que seria utilizada em um sistema real de produção.

Também podem existir várias maneiras corretas de resolver o mesmo exercício.

Uma solução presente neste repositório não deve ser interpretada como:

> “esta é a única maneira correta de fazer”.

Ao contrário: comparar alternativas e discutir seus efeitos faz parte do aprendizado.

---

## 🛠️ Ambiente utilizado

Os exemplos são desenvolvidos principalmente utilizando:

* **Java**
* **Apache NetBeans**

Dependendo da atividade, outras ferramentas poderão ser utilizadas e serão indicadas quando necessário.

---

## ❓ Encontrei algo que não entendi

Anote a dúvida e leve para o próximo horário de monitoria.

Se possível, tente identificar exatamente onde surgiu a dificuldade.

Em vez de apenas:

> “não entendi esse código”

tente chegar com algo como:

> “não entendi por que alterar esse objeto através da variável `b` também modifica o que vejo através da variável `a`”.

Quanto mais específica for a dúvida, mais fácil será investigar o problema juntos.

---

## 👨‍🏫 Sobre este repositório

Este material é mantido como parte das atividades de monitoria de **Programação Orientada a Objetos I do IFMG — Campus Ouro Branco**.

A proposta do repositório é funcionar como um histórico prático das monitorias e como material complementar para os estudantes da disciplina.

Bons estudos! ☕
