# MC322
[2023] Repository destinated to commits of MC322(OOP) classes
## Structure
The code stored here is developed following the laboratories proposed in the discipline of MC322. Each laboratory is marked as concluded by one tag, in the format "186261-labXX". It's a combined effort of 2 students - Nisio Neto(186261) and Ricardo Horie(176746)

## Laboratories [PT-BR]
### Lab 01

Você foi encarregado de projetar um sistema de gerenciamento para uma biblioteca. Este sistema deve ser capaz de lidar com vários aspectos do funcionamento diário de uma biblioteca, incluindo o gerenciamento de livros, membros, funcionários e empréstimos. Utilize os conceitos de Orientação a Objetos para estruturar seu projeto.
1.1 Objetivos
• Classes: Identifique e defina as classes essenciais que representam os principais componentes do sistema de gerenciamento de biblioteca.
• Objetos: Cada classe deve ter pelo menos um objeto associado a ela. Descreva os objetos que você criaria e como eles se relacionariam com suas classes correspondentes. Por exemplo, um objeto da classe Livro pode representar um livro específico na biblioteca.
• Construtores: Para cada classe identificada, defina o construtor que seria usado para criar um objeto dessa classe. O construtor deve aceitar os parâmetros necessários para inicializar um objeto da classe. Por exemplo, o construtor da classe Livro pode aceitar parâmetros como título, autor, ISBN, etc.

### Lab 02
Você foi encarregado de projetar um sistema de gerenciamento para uma biblioteca. Este sistema deve ser capaz de lidar com vários aspectos do funcionamento diário de uma biblioteca, incluindo o gerenciamento de livros, membros, funcionários e empréstimos.

1.1 Objetivos
• Atributos: Identifique e defina os atributos que compõe cada clase definida no Laboratório 1.
• Tipo de acesso: Para cada classe definir o tipo de acesso (public, private, protected) dos atributos e métodos.
• Getters e Setters: Para cada classe definir os Getters e Setters necessários.
• Modularidade: Aplicar o conceito de Modularidade no desenvolvimento do projeto.

### Lab 03

Available in "resources" folder.

# Sistema de Gerenciamento de Biblioteca Universitária Multimídia

Este sistema segue os princípios SOLID para garantir uma arquitetura robusta e extensível. 

## Princípios SOLID Aplicados:

### 1. Princípio da Responsabilidade Única (SRP)
- **O Que:** Divisão de responsabilidades em classes e métodos.
- **Por Quê:** Facilita a manutenção e reduz o impacto de mudanças.
- **Como:** O serviço de reserva é agora responsável apenas pela lógica de reserva.

### 2. Princípio Aberto/Fechado (OCP)
- **O Que:** Métodos de adição de itens multimídia abertos para extensão.
- **Por Quê:** Facilita a adição de novos tipos de itens sem modificar o código existente.
- **Como:** Utilização de classes e métodos abstratos.

### 3. Princípio da Substituição de Liskov (LSP)
- **O Que:** Substituição de subclasses sem impacto na correção.
- **Por Quê:** Garante consistência e extensibilidade.
- **Como:** Certificação de que subclasses podem ser usadas em vez de suas classes base.

### 4. Princípio da Segregação de Interfaces (ISP)
- **O Que:** Interfaces específicas para cada classe de empréstimo.
- **Por Quê:** Evita que classes implementem métodos desnecessários.
- **Como:** Divisão de interfaces em interfaces menores e mais específicas.

### 5. Princípio da Inversão de Dependência (DIP)
- **O Que:** Injeção de dependência para classes dependentes.
- **Por Quê:** Facilita a troca de implementações sem afetar outras partes do sistema.
- **Como:** Dependência de abstrações em vez de implementações concretas.

Este sistema é projetado para ser flexível, de fácil manutenção e extensível de acordo com as mudanças futuras.
