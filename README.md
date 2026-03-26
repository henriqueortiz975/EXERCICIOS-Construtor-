# EXERCÍCIOS —  (Construtor)

Agora os exercícios exigem:

- Construtor
- Encapsulamento
- Validação
- Métodos de regra de negócio
- Classe principal para teste

---

## 🧩 Exercício 1 — Classe Aluno

Crie uma classe `Aluno` com:

Atributos privados:

- `nome`
- `nota1`
- `nota2`

Requisitos:

1. Construtor que receba nome, nota1 e nota2.
2. Não permitir notas menores que 0 ou maiores que 10.
3. Método `calcularMedia()`
4. Método `verificarAprovacao()` (média ≥ 6)
5. Criar classe `Main` para testar.

---

## 🧩 Exercício 2 — Classe Funcionário

Atributos:

- `nome`
- `salario`
- `cargo`

Requisitos:

1. Construtor com todos os atributos.
2. Salário não pode ser negativo.
3. Método `aumentarSalario(double percentual)`
4. Método `exibirDados()`
5. Testar no método `main`.

---

## 🧩 Exercício 3 — Classe ContaCorrente

Atributos:

- `numero`
- `titular`
- `saldo`

Requisitos:

1. Construtor recebe número e titular.
2. Saldo inicia em 0.
3. Método `depositar(double valor)`
4. Método `sacar(double valor)` (não permitir saldo negativo)
5. Método `consultarSaldo()`
6. Simular operações no `main`.

---

## 🧩 Exercício 4 — Classe Produto com Controle de Estoque

Atributos:

- `nome`
- `preco`
- `quantidade`

Requisitos:

1. Construtor recebe nome e preço.
2. Quantidade inicia em 0.
3. Não permitir preço negativo.
4. Método `entradaEstoque(int qtd)`
5. Método `saidaEstoque(int qtd)`
6. Método `valorTotalEstoque()`
7. Criar testes no `main`.

---

## 🧩 Exercício 5 — Classe Retângulo com Regras

Atributos:

- `largura`
- `altura`

Requisitos:

1. Construtor que valide valores positivos.
2. Método `calcularArea()`
3. Método `calcularPerimetro()`
4. Método `ehQuadrado()`
5. Testar no `main`.

---

# 🎯 Exercício Desafio (Nível Avaliativo)

Crie uma classe `Pessoa` que:

- Não permita idade negativa
- Não permita nome vazio
- Tenha construtor obrigatório
- Tenha método `fazerAniversario()`
- Tenha método `exibirDados()`

Criar no `main`:

- Instanciar 3 objetos
- Alterar dados via setters
- Chamar métodos
