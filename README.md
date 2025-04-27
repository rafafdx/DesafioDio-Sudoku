# 🧩 DioSudoku

Um jogo de Sudoku simples em Java, desenvolvido como parte do Bootcamp de Java da DIO (Digital Innovation One).

Este projeto explora conceitos de Programação Orientada a Objetos (POO), como classes, pacotes, métodos e boas práticas de organização de código.

## 🎮 Demonstração

O jogo é executado no terminal/console, e o usuário deve preencher o tabuleiro de Sudoku até completá-lo corretamente.

## 🚀 Tecnologias utilizadas

- Java 17 (ou superior)
- Programação Orientada a Objetos (POO)
- Terminal/Console


## 📋 Como rodar o projeto

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/DioSudoku.git
```

2. Acesse a pasta do projeto:
```bash
cd DioSudoku/src
```

3. Compile os arquivos Java:
```bash
javac DioSudoku.java model/Sudoku.java view/SudokuView.java
```

4. Execute o programa:
```bash
java DioSudoku
```

## 📂 Estrutura do projeto
```bash
DioSudoku/
├── src/
│   ├── DioSudoku.java
│   ├── model/
│   │   └── Sudoku.java
│   └── view/
│       └── SudokuView.java

```

## 🧩 Funcionalidades

• Exibe o tabuleiro de Sudoku no console.

• Permite ao usuário inserir números em posições válidas.

• Valida se a jogada é permitida (não repete número na linha, coluna ou quadrante 3x3).

• Detecta a conclusão do jogo e exibe uma mensagem de vitória.

## 👨‍💻 Autor

Nome: Rafael Santos (rafafdx)

## 📄 Licença
Este projeto está licenciado sob a licença MIT.
