# MicroService_Kafka

## Descrição
O MicroService_Kafka é um serviço externo desenvolvido para complementar o sistema [Voting System](https://github.com/FelipeAraujo32/Voting_System.git). Ele lida com a configuração e gerenciamento do sistema de mensageria Kafka, que é utilizado para processar votos de forma assíncrona. Este serviço garante que a comunicação entre os diferentes componentes do Voting System ocorra de maneira eficiente e escalável.

## Funcionalidades
- Configuração de tópicos Kafka necessários para a aplicação.
- Gerenciamento de produtores e consumidores Kafka.
- Monitoramento e logging das mensagens trafegadas.
- Garantia de resiliência e tolerância a falhas na comunicação.

## Requisitos
- Docker e Docker Compose instalados.
- Java 17
- Kafka e Zookeeper (gerenciados pelo Docker Compose).

## Configuração do Kafka
Este serviço é responsável pela criação e configuração dos tópicos Kafka. Certifique-se de que os tópicos necessários para o [Voting System](https://github.com/FelipeAraujo32/Voting_System.git). estão devidamente configurados.

# Autor 👦
| [<img loading="lazy" src="https://avatars.githubusercontent.com/u/136930797?v=4" width=150><br><sub>Felipe Araujo</sub>](https://github.com/FelipeAraujo32)
| :---: |

## Contribuindo
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

## Licença
Este projeto está licenciado sob a MIT License.

## Contato
Para mais informações, entre em contato pelo e-mail: felipecafsx@gmail.com
