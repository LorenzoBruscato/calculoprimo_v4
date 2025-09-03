# 📘 Versão 4 - Cálculo de Primos (N Threads)

## 📌 Descrição
O intervalo é dividido em **sub-intervalos**, e cada um é processado por uma thread diferente.  
Exemplo:
- Thread 1 → `5 a 50`
- Thread 2 → `51 a 100`
- Thread 3 → `101 a 150`

## 🖥️ Exemplo de uso
Entrada: `5 a 150`  
Saída: lista de todos os primos entre `5 e 150`.
