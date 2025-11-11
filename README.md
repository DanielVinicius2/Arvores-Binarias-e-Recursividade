# Arvores Binarias e Recursividade

**Disciplina:** Estrutura de Dados  
**Professor:** Prof. Anderson Soares  
**Valor:** 2,0 pontos  
**Entrega:** até 11/05  
**Formato de entrega:** Repositório no GitHub  

---

## 🎯 Objetivo

Compreender o conceito de **recursividade** e aplicá-lo na implementação de uma **árvore binária de busca (BST)** em Java, incluindo as operações de:
- Inserção de nós;
- Busca de valores;
- Percursos: **pré-ordem**, **em ordem** e **pós-ordem**.

---

## 🧠 Parte 1 – Conceito e Explicação

### 1️⃣ O que é recursividade?

Recursividade é uma técnica em que uma função **chama a si mesma** para resolver versões menores de um mesmo problema.  
Ela sempre precisa de:
- Um **caso base**, que define quando parar;
- Um **caso recursivo**, que faz a chamada da própria função.

📘 **Exemplo simples:**
```java
int fatorial(int n) {
    if (n == 0) return 1; // Caso base
    return n * fatorial(n - 1); // Chamada recursiva
}
```
## 2️⃣ Como a recursividade é usada na percorrência (travessia) de uma árvore binária?

A recursividade é fundamental na travessia de uma árvore binária, pois cada nó da árvore pode ser tratado como uma **subárvore independente**.

Assim, a função recursiva consegue visitar todos os nós sem precisar de laços (`for` ou `while`), apenas chamando a si mesma para explorar os ramos esquerdo e direito.

📘 **Exemplo prático – travessia em ordem (in-order):**

```java
void emOrdem(Node no) {
    if (no != null) {
        emOrdem(no.esquerda);   // Visita a subárvore esquerda
        System.out.print(no.valor + " "); // Visita o nó atual
        emOrdem(no.direita);    // Visita a subárvore direita
    }
}
```
🔁 **Etapas do processo:**

A função é chamada com o nó raiz.

Ela primeiro chama a si mesma para visitar a subárvore esquerda.

Depois, processa o nó atual.

Por fim, chama a si mesma para a subárvore direita.

💡 Dessa forma, a pilha de chamadas recursivas controla automaticamente a ordem em que os nós são visitados, sem necessidade de estruturas iterativas.

## 3️⃣ Qual a diferença entre recursão e laço (for/while)?

A **recursão** e os **laços de repetição** (como `for` e `while`) são formas de repetir instruções, mas funcionam de maneiras diferentes.

| Característica | Recursão | Laço (for/while) |
|----------------|-----------|------------------|
| **Mecânica** | Uma função chama a si mesma | Um bloco de código se repete |
| **Controle** | Usa a pilha de chamadas do sistema | Usa variáveis de controle e condições |
| **Condição de parada** | Caso base (quando a função deixa de se chamar) | Condição lógica (ex: `i < n`) |
| **Uso comum** | Estruturas hierárquicas, como árvores e grafos | Estruturas lineares, como listas e vetores |
| **Vantagem** | Código mais simples e natural para problemas recursivos | Menor uso de memória |
| **Desvantagem** | Pode consumir mais memória (chamadas aninhadas) | Pode ser menos intuitivo para problemas hierárquicos |

📘 **Exemplo comparativo:**

**Recursivo:**
```java
void contarRecursivo(int n) {
    if (n == 0) return; // Caso base
    System.out.println(n);
    contarRecursivo(n - 1); // Chamada recursiva
}
```
**Iterativo:**
```java
void contarIterativo(int n) {
    for (int i = n; i > 0; i--) {
        System.out.println(i);
    }
}
```

💡 **Resumo:**
A recursão é mais indicada quando o problema pode ser dividido em partes menores de si mesmo (como árvores e fatorial),
enquanto laços são melhores para repetições lineares e simples.
