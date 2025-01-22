# <h1 align="center">ScreenMatch - Consumindo APIs em Java</h1>

<p align="center">
<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
<img src="https://img.shields.io/badge/GSON-000?style=for-the-badge&logo=google&logoColor=red"/>
</p>

---

## <h2 align="center">Descrição do Projeto</h2>

O **ScreenMatch** é um projeto desenvolvido durante o quarto curso da formação **Java** da **Alura**, com o objetivo de consumir dados de uma API HTTP e manipular informações no formato JSON em Java. Este projeto simula a busca de informações sobre filmes a partir de uma API externa.

---

## <h2 align="center">Índice</h2>

* [Descrição do Projeto](#descrição-do-projeto)
* [Funcionalidades](#funcionalidades)
* [Objetivos do Projeto](#objetivos-do-projeto)
* [Tecnologias Utilizadas](#tecnologias-utilizadas)
* [Pré-requisitos](#pré-requisitos)
* [Como Executar o Projeto](#como-executar-o-projeto)
* [Autor](#autor)

---

## <h2 align="center">Funcionalidades</h2>

🔨 Funcionalidades do projeto:

- Consulta de informações sobre filmes a partir da API [OMDb API](https://www.omdbapi.com/).
- Conversão de dados no formato JSON para objetos Java.
- Geração de arquivos com os dados obtidos.
- Tratamento de erros e exceções durante a requisição HTTP.
- Manipulação de arquivos locais para salvar dados de filmes.

---

## <h2 align="center">Objetivos do Projeto</h2>

📚 Este projeto foi desenvolvido para:
- Aprender a consumir uma API HTTP em Java.
- Entender como receber e converter dados no formato JSON.
- Utilizar a biblioteca externa **GSON** para serialização e desserialização de dados.
- Lidar com erros e tratar exceções.
- Conhecer o pacote `java.io` para manipulação de arquivos.

---

## <h2 align="center">Tecnologias Utilizadas</h2>

- **Linguagem de Programação:**  
![Java](https://img.shields.io/badge/java-000.svg?style=for-the-badge&logo=openjdk&logoColor=%23ED8B00)

- **Bibliotecas:**  
![GSON](https://img.shields.io/badge/GSON-000?style=for-the-badge&logo=google&logoColor=red)

- **Ferramentas:**  
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000?style=for-the-badge&logo=intellijidea)
![OMDb API](https://img.shields.io/badge/OMDb_API-000?style=for-the-badge&logo=api&logoColor=red)

---

## <h2 align="center">Pré-requisitos</h2>

Antes de começar, certifique-se de ter os seguintes itens instalados no seu ambiente:

- **Java JDK** 11 ou superior.  
- **Biblioteca GSON** configurada no seu projeto.  
- **Chave de acesso à OMDb API**.

---

## <h2 align="center">Como Executar o Projeto</h2>

### 📁 Acesso ao projeto

Clone o repositório com o comando:

```bash
git clone https://github.com/nataliaoliveiradev/screenmatch.git
```

### 🛠️ Abrir e rodar o projeto

1. Abra o projeto no IntelliJ IDEA ou outra IDE de sua preferência.  
2. Configure o arquivo `PrincipalComBusca.java` com sua chave de API OMDb:
   ```java
   String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=SUA_CHAVE_AQUI";
   ```
3. Compile e execute a classe principal (`PrincipalComBusca`).  
4. Insira o nome de um filme no console e veja os resultados.  

---

## <h2 align="center">Autor</h2>

<div align="center">

| [<img src="https://avatars.githubusercontent.com/u/172914574?v=4" width=115><br><sub>Natalia Oliveira</sub>](https://github.com/nataliaoliveiradev) |
| :---: |
| **Bacharel em Direito, estudante de Ciência da Computação e entusiasta do desenvolvimento fullstack.** |

</div>

---

## <h2 align="center">Contato</h2>

[![LinkedIn](https://img.shields.io/badge/LinkedIn-000?style=for-the-badge&logo=linkedin&logoColor=ff6e96)](https://www.linkedin.com/in/nataliaoliveiradev/)  
[![GitHub](https://img.shields.io/badge/GitHub-000?style=for-the-badge&logo=github&logoColor=ff6e96)](https://github.com/nataliaoliveiradev)  
[![E-mail](https://img.shields.io/badge/-Email-000?style=for-the-badge&logo=microsoft-outlook&logoColor=ff6e96)](mailto:profissionalnataliaoliveira@gmail.com)

---

## <h2 align="center">Licença</h2>

<p align="center">
Este projeto está licenciado sob a licença MIT. Para mais detalhes, consulte o arquivo LICENSE.
</p>

---
