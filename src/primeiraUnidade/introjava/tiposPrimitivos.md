Tipos primitivos Java

# Tipos Primitivos do Java

Java possui 8 tipos primitivos, que são usados para armazenar valores simples e diretos.

| Tipo     | Tamanho   | Faixa de Valores                            | Exemplo de Uso             |
|----------|-----------|---------------------------------------------|----------------------------|
| `byte`   | 8 bits    | -128 a 127                                  | `byte b = 100;`            |
| `short`  | 16 bits   | -32.768 a 32.767                            | `short s = 10000;`         |
| `int`    | 32 bits   | -2³¹ a 2³¹-1                                | `int i = 123456;`          |
| `long`   | 64 bits   | -2⁶³ a 2⁶³-1                                | `long l = 123456789L;`     |
| `float`  | 32 bits   | ±3.40282347E+38 (precisão ~7 dígitos)       | `float f = 3.14f;`         |
| `double` | 64 bits   | ±1.79769313486231570E+308 (precisão ~15)    | `double d = 3.1415;`       |
| `char`   | 16 bits   | 0 a 65.535 (Unicode)                        | `char c = 'A';`            |
| `boolean`| 1 bit*    | `true` ou `false`                           | `boolean ativo = true;`    |

> *O tamanho de `boolean` não é definido oficialmente, mas conceptualmente usa 1 bit.

## 🧠 Observação (Livro, pág. 105)
> Tipos primitivos armazenam **valores diretamente**. Já os **tipos por referência** (como `String`, arrays, objetos) armazenam **endereços de memória**.

