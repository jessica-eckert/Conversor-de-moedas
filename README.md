# Conversor de Moedas 

## Descrição

Este é um **Conversor de Moedas** em Java, projetado para facilitar a conversão de valores entre diferentes moedas. A aplicação utiliza dados de taxas de câmbio em tempo real através da API **Exchange Rate API**, garantindo resultados precisos e atualizados. O conversor permite ao usuário realizar várias conversões diretamente no console, com um menu interativo.

## Funcionalidades

- Conversões entre diversas moedas em tempo real.
- Interface simples de linha de comando para interação com o usuário.
- Atualização dinâmica das taxas de câmbio via API.
- Utiliza a biblioteca **Gson** para manipulação de JSON.
- Suporta pelo menos 6 opções de conversão.

## Como Usar

1. **Clone o repositório**
   
   ```bash
   git clone https://github.com/jessica-eckert/Conversor-de-moedas.git
   Instale as dependências

Se você ainda não tem o Java e a biblioteca Gson configurados, siga as instruções abaixo:

Certifique-se de ter o JDK 17+ instalado em sua máquina.
Adicione a biblioteca Gson ao seu projeto. Se você estiver usando o IntelliJ IDEA, basta adicionar o arquivo JAR das dependências no seu projeto.
Obtenha sua chave de API da Exchange Rate API

Registre-se no Exchange Rate API e obtenha sua chave de API.
Armazene a chave da API em um arquivo config.properties ou em uma variável de ambiente para segurança.
Execute o projeto

No terminal, navegue até o diretório do projeto e execute o programa:
bash
Copiar código
java -jar ConversorDeMoedas.jar
Interaja com o menu

O programa irá apresentar um menu de opções para o usuário, permitindo a conversão de valores entre diferentes moedas.

## Exemplos de Conversões Suportadas
- Real (BRL) para Dólar (USD)
- Euro (EUR) para Libra Esterlina (GBP)
- Dólar (USD) para Yen Japonês (JPY)
  
## Como Contribuir
- Faça um fork do repositório.
- Crie uma nova branch (git checkout -b minha-feature).
- Faça suas alterações e commit (git commit -am 'Adicionando nova funcionalidade').
- Envie para a branch (git push origin minha-feature).
- Abra um pull request.
## Licença
Este projeto é licenciado sob a MIT License - consulte o arquivo LICENSE para mais detalhes.

Agradecimentos
A Exchange Rate API por fornecer dados de taxas de câmbio em tempo real.
A Gson por tornar a manipulação de JSON fácil e eficiente.
