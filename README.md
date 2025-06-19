# 🚀 Projeto DevOps

Um projeto de estudo e treinamento prático que integra **Spring Boot**, **Apache Kafka**, **MongoDB** e **Docker** em um ambiente simples de mensageria. O objetivo é demonstrar o envio de mensagens para um tópico Kafka, consumo dessas mensagens por um consumer e armazenamento no MongoDB.

## 🛠️ Tecnologias Utilizadas

- Java 17
- Spring Boot
- Apache Kafka
- Apache Zookeeper
- MongoDB
- Docker e Docker Compose
- Git e GitHub
- VSCode

## ⚙️ Funcionalidades

- Envio de mensagens via API REST para o Kafka
- Consumo automático das mensagens Kafka por um listener
- Armazenamento dos dados no MongoDB
- Leitura de configurações via `application.yml`

## 🔌 Endpoints da API

### ➕ `POST /mensagens`

Envia uma nova mensagem para o tópico Kafka e armazena no MongoDB.

**Exemplo de JSON enviado:**
```json
{
  "conteudo": "Mensagem de teste"
}
```

### 📄 `GET /projeto`

Retorna todas as configurações carregadas do arquivo `application.yml`.

---

## 🐳 Como Executar com Docker

1. Certifique-se de ter o **Docker** e o **Docker Compose** instalados.
2. Suba os containers com:
```bash
docker-compose up -d
```
3. Rode sua aplicação Spring Boot normalmente (pelo VSCode ou terminal).

---

## 🧪 Testando a API

Você pode usar o [Postman](https://www.postman.com/) ou `curl`:

```bash
curl -X POST http://localhost:8080/mensagens \
  -H "Content-Type: application/json" \
  -d '{"conteudo": "Olá, Kafka + Mongo!"}'
```

Depois acesse `http://localhost:8080/projeto` para verificar as configurações do projeto.

---

## 📁 Estrutura do Projeto

```
📦 projeto-devops
 ┣ 📂 src
 ┃ ┣ 📂 main
 ┃ ┃ ┣ 📂 java
 ┃ ┃ ┃ ┗ 📂 com.exemplo.projeto
 ┃ ┃ ┃   ┣ 📜 ProjetoController.java
 ┃ ┃ ┃   ┣ 📜 KafkaProducer.java
 ┃ ┃ ┃   ┣ 📜 KafkaConsumer.java
 ┃ ┃ ┃   ┣ 📜 Mensagem.java
 ┃ ┃ ┃   ┗ 📜 ConfiguracaoProjeto.java
 ┃ ┃ ┣ 📂 resources
 ┃ ┃ ┃ ┗ 📜 application.yml
 ┣ 📜 docker-compose.yml
 ┣ 📜 pom.xml
 ┗ 📜 README.md
```

---

## 👨‍💻 Autor

Desenvolvido por **Vinícius Burigatto Mota**  
📧 [vinicius.burigatto@hotmail.com](mailto:vinicius.burigatto@hotmail.com)  
🔗 [GitHub: VinnyBurigatto](https://github.com/VinnyBurigatto/projeto-devops)

---

## 🏁 Status do Projeto

✅ Finalizado para fins de estudo e demonstração.

---

## 📅 Última Atualização

Junho de 2025